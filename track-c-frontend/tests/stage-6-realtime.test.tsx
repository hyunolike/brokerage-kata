import { describe, it, expect } from 'vitest'

/**
 * specs/006-realtime/spec.md 의 테스트 골격.
 *
 * 1. describe.skip 을 describe 로 바꿔 잠금을 푼다.
 * 2. 각 테스트를 직접 채운다. (expect.fail 은 지운다)
 * 3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
describe.skip('🔒 stage-6: 실시간 주문 상태', () => {
  it('AC-C006-1 체결 메시지를 받으면 해당 주문 뱃지가 체결로 바뀐다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C006-2 연결이 끊기면 재연결 중을 표시하고 재연결 간격이 늘어난다', () => {
    // 예시: vi.useFakeTimers() 로 시간을 진행시키며 검증
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C006-3 재연결하면 끊긴 동안 바뀐 주문 상태가 반영된다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C006-4 같은 메시지를 두 번 받아도 화면 변화는 한 번이다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })

  it('AC-C006-5 화면을 떠나면 연결이 닫힌다', () => {
    // given

    // when

    // then
    expect.fail('TODO: 테스트를 작성하세요')
  })
})
