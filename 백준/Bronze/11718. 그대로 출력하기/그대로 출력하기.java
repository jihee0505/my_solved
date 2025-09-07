import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력 있을 때만 계속 출력하기
		while(sc.hasNext()) {
			//입력
			String str = sc.nextLine();
			
			//출력
			System.out.println(str);
		}

		
	}

}
