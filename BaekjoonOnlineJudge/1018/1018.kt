import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.min


// 현재 칸 (i, j)에 예상되는 색깔 결정
// 체스판 규칙: (행 인덱스 + 열 인덱스) 합이 짝수이면 시작 칸과 같은 색
//                                        홀수이면 시작 칸과 다른 색


fun getRepaintCount(board: Array<CharArray>, startRow: Int, startCol: Int, targetStartChar: Char): Int {
    var repaintCount = 0 

    for (i in 0 until 8) {
        for (j in 0 until 8) {
            val currentRow = startRow + i
            val currentCol = startCol + j

            val expectedChar = if ((i + j) % 2 == 0) {
                targetStartChar
            } else {
                if (targetStartChar == 'W') 'B' else 'W'
            }

            if (board[currentRow][currentCol] != expectedChar) {
                repaintCount++
            }
        }
    }
    return repaintCount
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()

    val board = Array(N) { CharArray(M) }

    for (i in 0 until N) {
        val line = br.readLine()
        for (j in 0 until M) {
            board[i][j] = line[j]
        }
    }

    var answer = 8 * 8

    for (r in 0..N - 8) {
        for (c in 0..M - 8) {
            val repaintsForCurrentSubgrid = min(
                getRepaintCount(board, r, c, 'W'),
                getRepaintCount(board, r, c, 'B')
            )
            answer = min(answer, repaintsForCurrentSubgrid)
        }
    }
    println(answer)
}
