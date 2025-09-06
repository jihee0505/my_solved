import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//문자열 입력
		String str = sc.next();
		
		//n 입력
		int n = sc.nextInt();
		
		//문자의 n번째 글자 출력
		System.out.println(str.charAt(n-1));
		
		
	}

}
