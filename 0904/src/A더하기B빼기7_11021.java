import java.util.Scanner;

public class A더하기B빼기7_11021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		//n 입력 받기
		int n = sc.nextInt();
		
		//반복문 시작
		for(int t=1; t<=n; t++) {
			
			//배열 생성
			int [] a = new int [2];
			
			//합을 담을 변수
			int sum = 0;
			
			//반복문 시작
			for(int j=0; j<2; j++) {
				a[j] = sc.nextInt();
				//a 배열 값 순차적으로 더하기
				sum += a[j];
			}
			
			//출력
			System.out.println("Case #" + t+ ": " + sum);
			
		}
		
	}

}
