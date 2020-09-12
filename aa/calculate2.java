package aa;

import java.util.Scanner;

public class calculate2 {

	public static void main(String[] args) {
		System.out.print("연산>>");
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		String i = scanner.next();
		int b=scanner.nextInt();
		int result = 0;
		switch(i) {
		case "+":
			result = a+b;
			break;
		case "-":
			result = a-b;
			break;
		case "*":
			result = a*b;
			break;
		case "/":
			if(b==0) {
				System.out.print("0으로 나눌수 없습니다.");
				scanner.close();
			}
			result = a/b;
			break;
		}
		System.out.println(a+i+b+"의 계산결과는"+result);
		scanner.close();
	}

}
