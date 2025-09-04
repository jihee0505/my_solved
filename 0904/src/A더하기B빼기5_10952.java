import java.util.Scanner;

public class A더하기B빼기5_10952 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		//반복문 시작
		for(int i=0; i<100; i++) {
			
			//변수 입력
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			//총 합계 변수 생성
			int sum = a+b;
			if(a+b >0) {
				System.out.println(sum);
				//합계가 0이 아닌 경우 탈출
			} else {
				break;
			}
			
		}
		
	}

}
