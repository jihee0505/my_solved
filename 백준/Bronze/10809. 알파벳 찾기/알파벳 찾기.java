import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//문자열 입력
		String str = sc.next();
		
		//문자열 길이 변수
		int len = str.length();
		
		//key와 value를 함께 저장할 map 생성
		Map<Character, Integer> map = new HashMap<>();
		
		//반복문
		for(int i=0; i<len; i++) {
			
			//문자열 개별 문자를 c에 담기
			char c = str.charAt(i);
			
			//c가 등장한 적 없는지 확인 후 map에 담기
			//해당 조건이 없으면 중복 등장 시 인덱스가 갱신 됨
			if(!map.containsKey(c)) {
				map.put(c, i);
			}
		}
		
		//char는 정수 취급 가능하기 때문에 범위로도 사용 가능
		for(char ch ='a'; ch<='z'; ch++) {
			//ch를 포함할 시 ch 그대로 출력
			if(map.containsKey(ch)) {
				System.out.print(map.get(ch) + " ");
			//해당 문자가 없을 시 -1 출력
			} else {
				System.out.print(-1 + " ");
			}
		}
	}

}
