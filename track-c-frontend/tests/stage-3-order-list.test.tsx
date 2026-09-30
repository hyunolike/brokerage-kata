import { describe, it, expect } from 'vitest'

/**
 * specs/003-order-list/spec.md 의 테스트 골격.
 *
 * 1. describe.skip 을 describe 로 바꿔 잠금을 푼다.
 * 2. 각 테스트를 직접 채운다. (expect.fail 은 지운다)
 * 3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
describe.skip('🔒 stage-3: 주문 내역과 취소', () => {
  it('AC-C003-1 주문 목록을 최신순으로 상태 뱃지와 함께 보여준다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C003-2 상태 필터를 바꾸면 해당 상태의 주문만 보여준다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C003-3 접수 상태의 주문에만 취소 버튼이 보인다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C003-4 취소하면 확인을 거친 뒤 목록과 잔고가 함께 갱신된다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C003-5 취소 요청이 실패하면 원래 상태로 되돌리고 이유를 보여준다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })
})
