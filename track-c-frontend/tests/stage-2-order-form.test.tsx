import { describe, it, expect } from 'vitest'

/**
 * specs/002-order-form/spec.md 의 테스트 골격.
 *
 * 1. describe.skip 을 describe 로 바꿔 잠금을 푼다.
 * 2. 각 테스트를 직접 채운다. (expect.fail 은 지운다)
 * 3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
describe.skip('🔒 stage-2: 주문 폼', () => {
  it('AC-C002-1 종목코드가 6자리 숫자가 아니면 오류 메시지를 보여준다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C002-2 호가 단위에 맞지 않는 가격이면 가장 가까운 유효 가격을 안내한다', () => {
    // 예시: 71,050 → 71,000 또는 71,100 (tickSize 단위 테스트)
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C002-3 주문 금액이 주문 가능 금액을 넘으면 주문 버튼이 비활성화된다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C002-4 가격과 수량을 입력하면 예상 주문 금액이 표시된다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C002-5 주문 제출 중에는 버튼을 다시 누를 수 없다 (중복 제출 방지)', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C002-6 주문 성공 시 폼이 초기화되고 주문 가능 금액이 갱신된다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })
})
