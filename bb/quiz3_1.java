package bb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class quiz3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("곱하고자 하는 두 수 입력>>");
		do {
			try {
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.print(n+"x"+m+"="+n*m);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				System.out.print("곱하고자 하는 두 수 입력>>");
				scanner.nextLine();
				continue;
			}
		}
		while(true);
		scanner.close();
	}

}
