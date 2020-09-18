package bb;

import java.util.Scanner;

public class quiz3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			String str[] = {"가위","바위","보"};
			int n = (int)(Math.random()*3);
			
			System.out.print("가위 바위 보 !>>");
			String user = scanner.next();
			
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			
			if(str[n].equals(user))
				System.out.println("사용자 = "+user+", 컴퓨터 ="+str[n]+", 비겼습니다.");
			
			else if((user.equals("가위")&&str[n].equals("바위"))||
					(user.equals("보")&&str[n].equals("가위"))||
					(user.equals("바위")&&str[n].equals("보")))
				System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다.");
			else
				System.out.println("사용자 = "+user+", 컴퓨터 ="+str[n]+", 사용자가 이겼습니다.");
		}
		scanner.close();
	}

}
