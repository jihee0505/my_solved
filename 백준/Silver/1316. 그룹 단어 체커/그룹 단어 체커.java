import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//n 입력
		int n = sc.nextInt();
		
		//문제에 맞는 단어 수
		int result = 0;
		
		//n만큼 반복
		for(int i=0; i<n; i++) {
			String s = sc.next();
			
			//real 함수가 true면 result++
			if(real(s)) {
				result++;
			}
		}
		
		//출력
		System.out.println(result);
		
	}
	
	//그룹 단어인지 판별하는 메서드
	public static boolean real(String str) {
		
		//알파벳 26자를 고려하여 크기 26인 배열 생성
		boolean[] visited = new boolean[26];
		
		//이전 값의 초기 값은 공백
		char prev = ' ';
		
		//문자열 길이만큼 반복
		for(int i=0; i<str.length(); i++) {
			//현재 문자 값 입력 받기
			char now = str.charAt(i);
			
			//현재와 이전 단어가 같지 않을 때
			if(now != prev) {
				//이미 방문한 적 있으면 false
				if(visited[now-'a']) {
					return false;
				}
				
				//방문한 적 없다면 갱신
				visited[now-'a'] = true;
			}
			
			//현재 글자를 이전으로 바꾸기
			prev = now;
			
		}
		
		return true;
	}

}
