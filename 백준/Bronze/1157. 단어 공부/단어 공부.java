import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//문자열 입력
		//모두 대문자로 입려 받기
		String str = sc.next().toUpperCase();
		
		//A~Z까지 count 배열 생성
		int []  count = new int[26];
		
		//'A'를 빼면서 인덱스와 값 설정
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i) - 'A']++;
		}
		
		//갱신할 최대값
		int max = 0;
		
		//갱신할 문자열
		char ans = '?';

		//문자열 길이만큼 반복문 시작
		for(int i=0; i<26; i++) {
			
			//count[i]가 더 크면 max 갱신하기
			if(count[i] > max) {
				max = count[i];
				
				//숫자로 계산된 값을 문자로 강제 변환
				ans = (char)(i+'A');
				
				//max와 값이 같을 경우 기본값 유지
			} else if(count[i] == max){
				ans = '?';
			}
			
		}
		
		//출력
		System.out.println(ans);

		
	}

}
