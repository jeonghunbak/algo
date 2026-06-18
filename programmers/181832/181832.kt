class Solution {
    fun solution(n: Int): Array<IntArray> {
        val answer = Array(n) { IntArray(n) }

        // 오른쪽, 아래, 왼쪽, 위
        val dx = intArrayOf(0, 1, 0, -1)
        val dy = intArrayOf(1, 0, -1, 0)

        var x = 0
        var y = 0
        var dir = 0

        for (num in 1..n * n) {
            answer[x][y] = num

            var nx = x + dx[dir]
            var ny = y + dy[dir]

            // 범위 밖이거나 이미 숫자가 있으면 방향 전환
            if (
                nx !in 0 until n ||
                ny !in 0 until n ||
                answer[nx][ny] != 0
            ) {
                dir = (dir + 1) % 4
                nx = x + dx[dir]
                ny = y + dy[dir]
            }

            x = nx
            y = ny
        }

        return answer
    }
}
