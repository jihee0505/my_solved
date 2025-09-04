import java.util.Scanner;

public class 영수증_25304 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//x: 총 금액
		//n: 물건 총 개수
		int x = sc.nextInt();;
		int n = sc.nextInt();
		
		//개별 값의 총합 변수
		int sum = 0;
		
		//반복문 시작
		for(int i=0; i<n; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			//차례 대로 a,b 입력 후 곱하기
			sum += a*b;
			
		}
		
		//sum이 x와 일치할 경우
		if(sum == x) {
			System.out.println("Yes");
			//일치하지 않는 경우
		} else {
			System.out.println("No");
		}
		
		
		
	}

}
