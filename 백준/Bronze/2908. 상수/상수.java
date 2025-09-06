import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//최대값 갱신
		int max = 0;
		
		//두 수만 비교하므로 2번 반복
		for(int i=0; i<2; i++) {
			
			//값 입력
			String n = sc.next();
			
			//stringbuilder로 세 자리 숫자 앞 뒤 바꾸기
			StringBuilder sb = new StringBuilder();
			
			sb.append(n.charAt(2)).append(n.charAt(1)).append(n.charAt(0));
			
			//sb를 정수로 변환하기
			int num = Integer.parseInt(sb.toString());
			
			//max와 비교해서 큰 값 갱신
			if(num>max) {
				max = num;
			}
			
		}
		//출력
		System.out.println(max);
		
		
	}

}
