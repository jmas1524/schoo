import java.util.Scanner;

class Exercise3_5{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数値：");
		int a=stdIn.nextInt();
		
		if (a>=0)
		if (a%5==0)
		System.out.println("その値は5で割り切れます。");
		else
		System.out.println("その値は5で割り切れません。");
		else
		System.out.println("正でない値が入力されました。");
		
	}
}