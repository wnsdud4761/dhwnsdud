package aa;
import java.util.Scanner;

public class calculate {

	public static void main(String[] args) {
		System.out.print("연산>>");
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		String i = scanner.next();
		int b=scanner.nextInt();
		int result = 0;
		if(i.equals("+"))
			result = a+b;
		else if(i.equals("-"))
			result = a-b;
		else if(i.equals("*"))
			result = a*b;
		else if(i.equals("/")) {
			if(b==0) {
				System.out.print("0으로 나눌 수 없습니다.");
				scanner.close();
				return;
			}
			else
				result = a/b;
			}

		System.out.println(a+i+b+"의 계산결과는"+result);
		scanner.close();
	}
}
