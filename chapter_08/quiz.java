package chapter_08;
import java.io.*;
import java.util.*;

class SearchText{
	
	File file = null;
	FileReader fr = null;
	BufferedReader br = null;
	Vector<String> v = new Vector<String>();
	Scanner scan = null;
	
	public SearchText() {
		
		scan = new Scanner(System.in);
		System.out.print("파일 명 입력 : ");
		String name = scan.next();
		
		file = new File(name);
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			while(true) {
				String line = br.readLine();
				if(line == null)
					break;
				
				v.add(line);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Search() {
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.print("검색할 단어 : ");
			String word = scan.nextLine();
			
			if(word.equals("-1"))
				break;
			
			for(int i=0;i<v.size();i++) {
				String key=v.get(i);
				if(key.indexOf(word) != -1 )
					System.out.println(v.get(i));
			}
			
		}
		System.out.println("종료합니다.");
		scan.close();
	}
}

public class quiz {

	public static void main(String[] args) {
		SearchText st = new SearchText();
		
		st.Search();
	}
}
