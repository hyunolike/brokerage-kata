/**
 * API 호출 공통 함수. stage-1 시작 코드.
 *
 * 트랙 B spec 004 에서 정한 공통 응답 포맷을 해석하고,
 * 실패를 화면에서 다루기 쉬운 형태로 바꾸는 곳이 된다. 시그니처는 자유롭게 바꿔도 된다.
 */
export async function request<T>(_path: string, _init?: RequestInit): Promise<T> {
  throw new Error('TODO: stage-1')
}
