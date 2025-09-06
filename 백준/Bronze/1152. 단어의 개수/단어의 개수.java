import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//공백도 포함하는 nextLine으로 문자열 입력
		String str = sc.nextLine();
		
		//앞뒤 공백 제거하기
		str = str.trim();
		
		//공백+1을 해야 원하는 답이 출력됨
		//찾을 때마다 카운트
		int cnt = 1;
		
		//공백만 있을 경우 0 출력
		if(str.isEmpty()) {
			System.out.println(0);
			return;
		} else {
			//반복문 
			for(int i=0; i<str.length(); i++) {
				//현재 글자가 공백이고 다음 글자가 공백이 아닐 경우 카운트
				if(str.charAt(i) == ' ') {
					cnt++;
				}
			}
		}
		
		
		//출력
		System.out.println(cnt);
		
		
	}

}
