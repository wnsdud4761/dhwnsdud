package cc;

import java.util.Scanner;

class Reserve{
	private String[] s;
	private String[] a;
	private String[] b;
	
	public Reserve(String[] s, String[] a, String[] b) {
		this.s = s;
		this.a = a;
		this.b = b;
	}
	
	public void enroll() {
		Scanner scanner = new Scanner(System.in);
		String name;
		int n;
		
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int seat = scanner.nextInt();
		
		switch(seat) {
		case 1:
			System.out.println("S>> --- --- --- --- --- --- --- --- --- ---");
			System.out.print("이름>>");
			name = scanner.next();
			System.out.print("번호>>");
			n = scanner.nextInt();
			if(s[n-1].equals("---"))
				s[n-1] = name;
			else
				System.out.println("이미 예약된 좌석입니다... 다른 좌석을 선택해주세요.");
			break;
		case 2:
			System.out.println("A>> --- --- --- --- --- --- --- --- --- ---");
			System.out.print("이름>>");
			name = scanner.next();
			System.out.print("번호>>");
			n = scanner.nextInt();
			if(a[n-1].equals("---"))
				a[n-1] = name;
			else
				System.out.println("이미 예약된 좌석입니다... 다른 좌석을 선택해주세요.");
			break;
		case 3:
			System.out.println("B>> --- --- --- --- --- --- --- --- --- ---");
			System.out.print("이름>>");
			name = scanner.next();
			System.out.print("번호>>");
			n = scanner.nextInt();
			if(b[n-1].equals("---"))
				b[n-1] = name;
			else
				System.out.println("이미 예약된 좌석입니다... 다른 좌석을 선택해주세요.");
			break;
		default :
			System.out.println("1,2,3중 하나를 선택해주세요");
			break;
		}
	}
	
	public void check() {
		System.out.print("S>> ");
		for(int i = 0; i<s.length; i++)
			System.out.print(s[i] + " ");
		System.out.println();
		
		System.out.print("A>> ");
		for(int i = 0; i<s.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		
		System.out.print("B>> ");
		for(int i = 0; i<s.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	public void cancel() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("좌석 S:1, A:2, B:3>>");
		int seat = scanner.nextInt();
		String name;
		int sum = 0;
		switch(seat) {
		case 1:
			System.out.print("S>> ");
			for(int i =0; i<s.length; i++)
				System.out.print(s[i] + " ");
			System.out.println();
			System.out.print("이름>>");
			name = scanner.next();
			for(int i=0; i<s.length; i++) {
				if(s[i].equals(name))
					s[i] = "---";
				else 
					sum++;
			}
		if(sum==10) {
			System.out.println("해당 이름으로 예약된 좌석이 없습니다.");
			sum = 0;
		}
		break;
		case 2:
			System.out.print("A>> ");
			for(int i =0; i<s.length; i++)
				System.out.print(a[i] + " ");
			System.out.println();
			System.out.print("이름>>");
			name = scanner.next();
			for(int i=0; i<a.length; i++) {
				if(a[i].equals(name))
					a[i] = "---";
				else 
					sum++;
			}
		if(sum==10) {
			System.out.println("해당 이름으로 예약된 좌석이 없습니다.");
			sum = 0;
		}
		break;
		case 3:
			System.out.print("B>> ");
			for(int i =0; i<s.length; i++)
				System.out.print(b[i] + " ");
			System.out.println();
			System.out.print("이름>>");
			name = scanner.next();
			for(int i=0; i<b.length; i++) {
				if(b[i].equals(name))
					b[i] = "---";
				else 
					sum++;
			}
		if(sum==10) {
			System.out.println("해당 이름으로 예약된 좌석이 없습니다.");
			sum = 0;
		}
		break;
		default :
			System.out.println("1, 2, 3중 하나를 선택해주세요.");
			break;
		}
	}
}

	public class cc {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String [] s = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"}; 
		String [] a = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
		String [] b = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
		 
		Reserve rv = new Reserve(s,a,b);
		
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int n = scanner.nextInt();
			
			if(n==4)
				break;
			
			switch(n) {
			case 1:
				rv.enroll();
				break;
			case 2:
				rv.check();
				break;
			case 3:
				rv.cancel();
				break;
			default:
				System.out.println("1, 2, 3, 4 중 하나를 눌러주세요.");
				break;
			}
		}
		scanner.close();
	}
}
