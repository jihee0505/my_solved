import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 입력
		int t = sc.nextInt();
		
		
		//반복문 시작
		for(int tc=1; tc<=t; tc++) {
			//거스름돈 입력
			int change = sc.nextInt();
			
			//순서대로 q,d,n,p 구하기
			//각 화폐의 값으로 change를 나누기
			//change는 값을 나눈 나머지로 갱신하면서 금액 줄여 가기
			int q = change/25;
			change = change%25;
			
			int d = change/10;
			change = change%10;
			
			int n = change/5;
			change = change%5;
			
			int p = change/1;
			change = change%1;
			
			//출력
			System.out.println(q + " " + d + " " + n + " " + p);
	
			
		}
		
		
		
		
		
	}

}
