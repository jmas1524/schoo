import java.util.Scanner;

public class prac_04_25_B {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        System.out.println("整数を加算します。");
        int n;
        while(true) {
            System.out.print("何個加算しますか：");
            n = stdln.nextInt();
            if(n>0) break;
        }

        int sum = 0;
        int count = 0;
        for (int i=0; i<n; i++) {
            System.out.print("整数：");
            int t = stdln.nextInt();
            if(sum + t > 1000) {
                System.out.println("合計が1000を超えました。");
                System.out.println("最後の数値は無視します。");
                break;
            }
            sum += t;
            count++;
        }
        double ave = count!=0 ? (double)sum/count : 0;
        System.out.println("合計は"+ sum +"、平均は"+ ave +"です。");
    }
}