import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//n 입력
		int n = sc.nextInt();
		
		//반복문
		for(int i=0; i<n; i++) {
			String str = sc.next();
			
			//문자 길이를 담은 변수 생성
			int len = str.length();
			
			//길이가 1 이상이면 앞과 뒤만 출력하기
			if(str.length()>1) {
				System.out.println(str.charAt(0) + "" + str.charAt(len-1));
			//한 글자인 경우 같은 문자 한 번 더 붙여서 출력하기
			} else {
				System.out.println(str+str);
			}
		}
		
		
	}

}
