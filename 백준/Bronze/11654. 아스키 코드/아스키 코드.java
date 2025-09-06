import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//문자 입력
		String str = sc.next();
		
		//사칙연산을 더하거나 빼면 아스키 코드로 출력됨
		System.out.println(str.charAt(0)-0);
	}

}
