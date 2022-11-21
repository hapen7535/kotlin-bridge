package bridge

import bridge.Constants.Companion.DOWN
import bridge.Constants.Companion.UP

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
class BridgeGame {
    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     *
     *
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    private var idx = 0
    private val upResultList = mutableListOf<String>()
    private val downResultList = mutableListOf<String>()

    fun move(userDirection: String, createdBridge: List<String>) : MutableMap<String, List<String>>{

        val selectedBridge = mutableMapOf<String, List<String>>()

        if (userDirection == createdBridge[idx]) {
            if (userDirection == UP) {
                upResultList.add("O")
                downResultList.add(" ")
            } else {
                upResultList.add(" ")
                downResultList.add("O")
            }
            idx += 1
        } else {
            if (userDirection == UP) {
                upResultList.add("X")
                downResultList.add(" ")
            } else {
                upResultList.add(" ")
                downResultList.add("X")
            }
        }
        selectedBridge[UP] = upResultList
        selectedBridge[DOWN] = downResultList
        return selectedBridge
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     *
     *
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun retry() {}
}
