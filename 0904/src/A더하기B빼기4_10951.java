import java.util.Scanner;

public class A더하기B빼기4_10951 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//반복문
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			//총 합계 변수
			int sum = a + b;
			
			//출력
			System.out.println(sum);
		}
		
		
		
	}

}
