import java.util.Scanner;

public class prac_03_15 {
	public static void main(String[] args) {
	
		Scanner stdln = new Scanner(System.in);

		System.out.print("整数a：");
        int a = stdln.nextInt();
        System.out.print("整数b：");
        int b = stdln.nextInt();

        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println(a+"\n"+b);
	}
}