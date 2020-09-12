package aa;

import java.util.Scanner;

public class circle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번쨰 원의 중심과 반지름 입력>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int r1 = scanner.nextInt();
		
		System.out.print("두번쨰 원의 중심과 반지름 입력>>");
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int r2= scanner.nextInt();
		
		double dis = 0;
		dis = Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
		
		if(dis<=r1+r2)
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 안 겹친다.");
		
		scanner.close();
	}
}
