package chpaer_06;

import java.util.Scanner;

class Person{
	private int n1, n2, n3;
	public String name;
	public Person(String name) {
		this.name = name;
	}
	public boolean gambling() {
		n1 = (int)((Math.random()*3)+1);
		n2 = (int)((Math.random()*3)+1);
		n3 = (int)((Math.random()*3)+1);
		System.out.print( n1+" "+n2+" "+n3+" ");
		if(n1==n2&&n2==n3)
			return true;
		else 
			return false;
	}
}

public class quiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1번째 선수 이름 >> ");
		String name = scanner.next();
		Person p1 = new Person(name);
		System.out.print("2번째 선수 이름 >> ");
		name = scanner.next();
		Person p2 = new Person(name);
		String buffer = scanner.nextLine();
		while(true) {
			System.out.print("["+p1.name+"]:<Enter>");
			buffer = scanner.nextLine();
			if(p1.gambling()) {
				System.out.println(p1.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
			
			System.out.print("["+p2.name+"]:<Enter>");
			buffer = scanner.nextLine();
			if(p2.gambling()) {
				System.out.println(p2.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
		}
		scanner.close();

	}

}
