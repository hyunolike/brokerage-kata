#!/usr/bin/env bash
# PreToolUse(Read): 트랙 A 에서 사용자가 아직 도달하지 않은 단계의 문서/테스트를 Claude 가 읽지 못하게 막는다.
# (읽지 않으면 누설할 수도 없다. 트랙 B/C 의 spec 은 처음부터 모두 공개이므로 대상이 아니다)
set -uo pipefail

ROOT="${CLAUDE_PROJECT_DIR:-$(cd "$(dirname "$0")/../.." && pwd)}"
[ -f "$ROOT/.kata/SCAFFOLD_MODE" ] && exit 0

input="$(cat)"
path="$(printf '%s' "$input" | grep -o '"file_path"[[:space:]]*:[[:space:]]*"[^"]*"' | head -1 | sed 's/.*"\([^"]*\)"$/\1/')"
[ -z "$path" ] && exit 0

problem="$(printf '%s' "$path" | sed -n 's|.*track-a-live-coding/\(p[0-9][^/]*\)/.*|\1|p')"
[ -z "$problem" ] && exit 0

stage="$(printf '%s' "$path" | sed -n -e 's|.*/stages/stage-\([0-9][0-9]*\)\.md$|\1|p' -e 's|.*/Stage\([0-9][0-9]*\)Test\.java$|\1|p')"
[ -z "$stage" ] && exit 0

state="$ROOT/.kata/state/$problem"
current=1
if [ -f "$state" ]; then
  grep -q '^status=done' "$state" && exit 0
  current="$(grep '^stage=' "$state" | cut -d= -f2)"
fi

if [ "$stage" -gt "$current" ]; then
  echo "[스포일러 방지] $problem 은 현재 stage $current 이다. stage $stage 문서/테스트는 사용자가 ./kata next 로 도달한 뒤에만 읽는다." >&2
  exit 2
fi
exit 0
