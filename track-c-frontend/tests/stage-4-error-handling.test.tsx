import { describe, it, expect } from 'vitest'

/**
 * specs/004-error-handling/spec.md 의 테스트 골격.
 *
 * 1. describe.skip 을 describe 로 바꿔 잠금을 푼다.
 * 2. 각 테스트를 직접 채운다. (expect.fail 은 지운다)
 * 3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
describe.skip('🔒 stage-4: 공통 에러 처리', () => {
  it('AC-C004-1 공통 응답 포맷의 실패 응답을 에러 코드가 담긴 에러로 변환한다 (request 단위 테스트)', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C004-2 에러 코드별로 사용자용 메시지를 보여준다', () => {
    // 예시: 잔고 부족, 계좌 없음, 취소 불가
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C004-3 검증 실패 응답의 필드 오류를 해당 입력 필드 아래에 표시한다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C004-4 네트워크 오류와 서버 오류(5xx)는 공통 안내와 재시도를 제공한다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C004-5 렌더링 중 예외가 나도 앱 전체가 하얗게 죽지 않는다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })
})
