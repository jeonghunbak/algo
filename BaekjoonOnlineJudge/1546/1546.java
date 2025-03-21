import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int max = 0;
        double sum = 0;
        int cnt = sc.nextInt();

        for(int i = 0; i < cnt; i++){
            int inputNum = sc.nextInt();
            list.add(inputNum);

            if(inputNum > max) max = inputNum;
        }

        for(int i = 0; i < list.size(); i++){
            double el = list.get(i);
            sum += el / max * 100;
        }

        double answer = sum / cnt;

        System.out.println(answer);
    }
}
