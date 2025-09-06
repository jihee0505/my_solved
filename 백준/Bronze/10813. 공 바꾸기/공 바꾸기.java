import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//n, m 입력
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//arr 배열 생성
		int [] arr = new int[n];
		
		for(int a=0; a<n; a++) {
			arr[a] = a+1;
		}
		
		//m만큼 i, j 반복 입력
		for(int tc=0; tc<m; tc++) {	
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			//각 회차마다 한 번만 바꾸면 되기 떄문에 a는 1번만 회전
			for(int a=0; a<1; a++) {
				//임시 변수 생성을 통해 arr[i-1]과 arr[j-1] 값을 교환
				int tmp = arr[i-1];
				arr[i-1] = arr[j-1];
				arr[j-1] = tmp;
				
			}
		}
		
		//차례대로 값 출력하기
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		
	}

}
