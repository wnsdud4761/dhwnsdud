package aa;
import java.util.Scanner;

public class calculate {

	public static void main(String[] args) {
		System.out.print("����>>");
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
				System.out.print("0���� ���� �� �����ϴ�.");
				scanner.close();
				return;
			}
			else
				result = a/b;
			}

		System.out.println(a+i+b+"�� �������"+result);
		scanner.close();
	}
}
