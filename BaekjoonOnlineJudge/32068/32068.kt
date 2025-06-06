import kotlin.math.min

fun calculateMinStepToTarget(start: Long, target_pos: Long): Long {
    // 1. 시작 위치가 바로 보물 위치인 경우 0단계
    if (start == target_pos) {
        return 0L
    }
    var minStep = Long.MAX_VALUE // 최소 단계를 저장할 변수, 초기값은 가능한 가장 큰 값
    // 2. 목표 위치가 시작 위치보다 클 때 (target_pos > start)
    // 이 경우는 S + k 형태의 짝수 단계에서 도달할 가능성이 있습니다.
    // target_pos = start + k  => k = target_pos - start
    val kForEven = target_pos - start
    // k는 0 이상이어야 합니다. (이동 횟수이므로)
    if (kForEven >= 0) {
        val step = 2 * kForEven // 짝수 단계 temp = 2k
        minStep = min(minStep, step)
    }
    // 3. 목표 위치가 시작 위치보다 작을 때 (target_pos < start)
    // 이 경우는 S - (k-1) 형태의 홀수 단계에서 도달할 가능성이 있습니다.
    // target_pos = start - (k - 1) => k - 1 = start - target_pos => k = start - target_pos + 1
    val kForOdd = start - target_pos + 1
    // k는 1 이상이어야 합니다. (1단계부터 시작하므로)
    if (kForOdd >= 1) {
        val step = 2 * kForOdd - 1 // 홀수 단계 temp = 2k - 1
        minStep = min(minStep, step)
    }
    // 두 경우 중 유효한 최소 단계 반환 (도달 불가능하면 여전히 Long.MAX_VALUE)
    return minStep
}

fun main() {
    val cnt = readln().toInt()
    val answer = mutableListOf<Long>()

    repeat(cnt) {
        val (left, right, start) = readln().split(" ").map { it.toLong() }
        
        val stepL = calculateMinStepToTarget(start, left)
        val stepR = calculateMinStepToTarget(start, right)
        
        answer.add(min(stepL, stepR))
    }
    print(answer.joinToString("\n"))
}
