import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//테스트케이스
		int n = sc.nextInt();
	
		//테스트케이스 시작
		for(int tc=0; tc<n; tc++) {
			//글자 수 반복 횟수 입력
			int r = sc.nextInt();
			
			//문자열 입력
			String str = sc.next();
			
			//문자 길이만큼 반복
			for(int i=0; i<str.length(); i++) {
				//r만큼 동일 글자 반복
				for(int j=0; j<r; j++) {
					//출력
					System.out.print(str.charAt(i));
				}
			}
			System.out.println();
		}
		
	}

}
