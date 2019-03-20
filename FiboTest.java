import java.util.Scanner;

//ì³²¨ÄÇÆõÊýÁÐ

public class FiboTest {
	
	public static int fibo(int n) {
		if(n > 0 && (n == 1 || n == 2)) {
			return 1;
		}
		else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("input the number : ");
		int num = input.nextInt();
		for(int i = 1; i <= num; i++) {
			System.out.print(fibo(i) + " ");
		}
		
		input.close();

	}


}
