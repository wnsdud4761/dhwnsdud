package bb;

import java.util.Scanner;

public class quiz3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			String str[] = {"����","����","��"};
			int n = (int)(Math.random()*3);
			
			System.out.print("���� ���� �� !>>");
			String user = scanner.next();
			
			if(user.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			
			if(str[n].equals(user))
				System.out.println("����� = "+user+", ��ǻ�� ="+str[n]+", �����ϴ�.");
			
			else if((user.equals("����")&&str[n].equals("����"))||
					(user.equals("��")&&str[n].equals("����"))||
					(user.equals("����")&&str[n].equals("��")))
				System.out.println("����� = "+user+", ��ǻ�� = "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
			else
				System.out.println("����� = "+user+", ��ǻ�� ="+str[n]+", ����ڰ� �̰���ϴ�.");
		}
		scanner.close();
	}

}
