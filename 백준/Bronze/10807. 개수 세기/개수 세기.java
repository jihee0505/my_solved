import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//배열 생성
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();

		}
		
		//찾을 값
		int v = sc.nextInt();
		
		//찾을 때 카운트
		int cnt = 0;
		
		//반복문 시작
		for(int i=0; i<n; i++) {
			if(arr[i] == v ) {
				cnt++;
			} 			
		}
		
		//출력
		System.out.println(cnt);
		
	}

}
