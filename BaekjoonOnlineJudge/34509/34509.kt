fun main() {
    for (n in 10..99) {
        val a = n / 10
        val b = n % 10

        // 조건 4: 숫자 8이 없어야 한다
        if (a == 8 || b == 8) continue

        // 뒤집은 수 만들기
        // 문자열로 뒤집고 앞쪽 0 제거
        val reversed = n.toString().reversed().toInt()

        // 조건 2: 뒤집은 수가 4의 배수
        if (reversed % 4 != 0) continue

        // 조건 3: 각 자리 수 합이 6의 배수
        if ((a + b) % 6 != 0) continue

        // 조건을 모두 만족하는 N 출력
        println(n)
    }
}
