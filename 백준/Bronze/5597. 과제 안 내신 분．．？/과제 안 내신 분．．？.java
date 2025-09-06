import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//제출했는지 확인하는 배열 생성
		boolean [] submitted = new boolean[31];
		
		//28개의 입력값을 인덱스로 받기
		for(int i=0; i<28; i++) {
			int num = sc.nextInt();
			submitted[num] = true;
		}
		
		//1부터 30까지 참, 거짓 여부 확인
		for(int i=1; i<31; i++) {
			if(!submitted[i]) {
				System.out.println(i);
			}
		}
 		
		
	}

}
