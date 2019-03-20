//测试增删改功能


import java.util.Scanner;


public class TriviaGame {
	
	public static final int N = 5;
	
	public static void main(String args[]) {
		
		String question[] = new String[20];
		question[0] = "question 0";
		question[1] = "question 1";
		question[2] = "question 2";
		
		
		String answer[][] = {{"answer 00", "answer 01", "answer 02", "answer 03"},
							 {"answer 10", "answer 11", "answer 12", "answer 13"},
							 {"answer 20", "answer 21", "answer 22", "answer 23"}};
		
		Scanner input = new Scanner(System.in);
		System.out.println("make a choice : ");
		System.out.println("1 : add a question");
		System.out.println("2 : modify a question");
		System.out.println("3 : delete a question");
		int choice = input.nextInt();
		
		switch(choice) {
		
			case 1:{
				
				System.out.println("enter the question");	
				String str = input.next();
				System.out.println(str);
//				for(int i = question.length; i )
//				question[question.length + 1] = input.next();
//				System.out.println(question);
				
				
			}break;
		
		}
		
	}

}
