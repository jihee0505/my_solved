import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//문자 받기
		String str = sc.next();
		
		//각 문자 구간을 배열로 생성
		String []  dial = { 
				"ABC", "DEF", "GHI",
				"JKL", "MNO", "PQRS",
				"TUV", "WXYZ"
		};
		
		//시간 합계 변수
		int total = 0;
		
		//글자 하나씩 확인하는 반복문
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			//dial에 해당 글자가 있는지 확인
			//-1이 아닐 경우 해당 글자가 있다는 뜻이니까 j+3을 해줌
			for(int j=0; j<dial.length; j++) {
				if(dial[j].indexOf(c) != -1) {
					total += j+3;
					
					//문자 찾으면 바로 다음 문자 찾기
					break;
				}
			}
		}
		//출력
		System.out.println(total);

	}

}
