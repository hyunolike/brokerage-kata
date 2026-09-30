import { describe, it, expect } from 'vitest'

/**
 * specs/001-account-dashboard/spec.md 의 테스트 골격.
 *
 * 1. describe.skip 을 describe 로 바꿔 잠금을 푼다.
 * 2. 각 테스트를 직접 채운다. (expect.fail 은 지운다)
 * 3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
describe.skip('🔒 stage-1: 계좌 대시보드', () => {
  it('AC-C001-1 원화 금액은 천 단위 구분 기호와 "원"을 붙여 표시한다', () => {
    // 예시: 1234567 → 1,234,567원 (formatKrw 단위 테스트)
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C001-2 계좌를 개설하면 계좌 정보와 0원 잔고가 표시된다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C001-3 입금하면 잔고가 갱신되어 표시된다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C001-4 입금 금액이 비었거나 1원 미만이면 입금 버튼이 비활성화된다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C001-5 잔고를 불러오는 동안 로딩 상태를, 실패하면 에러와 재시도 버튼을 보여준다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })
})
