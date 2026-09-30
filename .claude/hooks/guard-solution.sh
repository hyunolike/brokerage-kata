#!/usr/bin/env bash
# PreToolUse(Write|Edit|MultiEdit): Claude 가 풀이 영역(src/, tests/)에 코드를 쓰지 못하게 막는다.
# 문제를 새로 추가하는 등 레포 관리 작업일 때만 `touch .kata/SCAFFOLD_MODE` 로 잠시 해제한다.
set -uo pipefail

ROOT="${CLAUDE_PROJECT_DIR:-$(cd "$(dirname "$0")/../.." && pwd)}"
[ -f "$ROOT/.kata/SCAFFOLD_MODE" ] && exit 0

input="$(cat)"
path="$(printf '%s' "$input" | grep -o '"\(file_path\|notebook_path\)"[[:space:]]*:[[:space:]]*"[^"]*"' | head -1 | sed 's/.*"\([^"]*\)"$/\1/')"
[ -z "$path" ] && exit 0

case "$path" in
  */track-a-live-coding/*/src/*|track-a-live-coding/*/src/*|\
  */track-b-assignment/src/*|track-b-assignment/src/*|\
  */track-c-frontend/src/*|track-c-frontend/src/*|\
  */track-c-frontend/tests/*|track-c-frontend/tests/*)
    cat >&2 <<MSG
[코칭 모드] 풀이 영역($path)에는 코드를 쓰지 않는다. 이 레포의 코드는 사용자가 직접 작성한다.
- 막힌 경우: /hint 로 한 단계씩 힌트를 준다.
- 모범답안: 사용자가 /solution 을 직접 호출했을 때만 대화창에 보여준다. (파일로 원하면 .solutions/ 아래에)
- 문제 스캐폴딩 작업이라면 사용자에게 'touch .kata/SCAFFOLD_MODE' 로 해제를 요청한다.
MSG
    exit 2 ;;
esac
exit 0
