import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        for(int i = 0; i < 5; i++){
            int inputNum = sc.nextInt();
            if(inputNum < 40) inputNum = 40;

            answer += inputNum / 5;
        }

        System.out.print(answer);
    }
}
