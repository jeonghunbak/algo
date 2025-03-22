import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int answer = 0;

        for(int i = 0; i < cnt; i++){
            int input = sc.nextInt();
            answer += isPrime(input);
        }

        System.out.println(answer);
    }

    static int isPrime(int num){
        if(num == 1) return 0;

        for(int i = 2; i < num -1; i++){
            if(num % i == 0) return 0;
        }

        return 1;
    }
}
