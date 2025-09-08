import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//배열 생성
		String [] arr = new String[5];
		
		//길이 최대값
		int maxLen = 0;
		
		//순서대로 값 입력
		for(int i=0; i<5; i++) {
			arr[i] = sc.next();
			//maxLen보다 길이가 길면 갱신
			if(arr[i].length() > maxLen) {
				maxLen = arr[i].length();
			}
		}
		
		
		//바깥 for문은 maxLen까지
		for(int i=0; i<maxLen; i++) {
			//안쪽 for문은 5까지
			for(int j=0; j<5; j++) {
				if(i < arr[j].length()) {
					System.out.print(arr[j].charAt(i));
				}
			}
		}
		
	}

}
