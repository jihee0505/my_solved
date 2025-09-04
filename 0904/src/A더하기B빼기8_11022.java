import java.util.Scanner;

public class A더하기B빼기8_11022 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		//n 입력 받기
		int n = sc.nextInt();
		
		//반복문 시작
		for(int t=1; t<=n; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			//입력 값 합계
			int sum = a+b;
			
			System.out.println("Case #" + t + ": " + a + " + " + b + " = " + sum);
			
			
			
		}
	}

}
