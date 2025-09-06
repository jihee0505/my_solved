import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//문자열 길이 입력
		int n = sc.nextInt();
		
		//문자열 입력
		String str = sc.next();
		
		//누적합 시킬 변수
		int sum = 0;
		
		//반복문을 통해 각 자리수 합하기
		for(int i=0; i<n; i++) {
			sum += str.charAt(i)-'0';
		}
		
		//출력
		System.out.println(sum);
		
	}

}
