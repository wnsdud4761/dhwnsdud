package aa;

import java.util.Scanner;

public class circle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù���� ���� �߽ɰ� ������ �Է�>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int r1 = scanner.nextInt();
		
		System.out.print("�ι��� ���� �߽ɰ� ������ �Է�>>");
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int r2= scanner.nextInt();
		
		double dis = 0;
		dis = Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
		
		if(dis<=r1+r2)
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ���� �� ��ģ��.");
		
		scanner.close();
	}
}
