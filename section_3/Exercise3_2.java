import java.util.Scanner;

class Exercise3_2{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
	
		System.out.print("����A�F");
		int a=stdIn.nextInt();
	
		System.out.print("����B�F");
		int b=stdIn.nextInt();
	
		if (a%b == 0)
		System.out.println("B��A�̖񐔂ł��B");
	
		else
		System.out.println("B��A�̖񐔂ł͂���܂���B");
	}
}