package bb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class quiz3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
		do {
			try {
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.print(n+"x"+m+"="+n*m);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				scanner.nextLine();
				continue;
			}
		}
		while(true);
		scanner.close();
	}

}
