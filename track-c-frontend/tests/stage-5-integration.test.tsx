import { describe, it, expect } from 'vitest'

/**
 * specs/005-integration/spec.md 의 테스트 골격.
 *
 * 1. describe.skip 을 describe 로 바꿔 잠금을 푼다.
 * 2. 각 테스트를 직접 채운다. (expect.fail 은 지운다)
 * 3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
describe.skip('🔒 stage-5: 백엔드 연동', () => {
  it('AC-C005-1 목(mock) 응답이 계약(contracts/brokerage-api.yaml)의 예시와 일치한다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C005-2 계좌 개설 → 입금 → 주문 → 취소 흐름이 한 화면 흐름으로 동작한다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })
})
