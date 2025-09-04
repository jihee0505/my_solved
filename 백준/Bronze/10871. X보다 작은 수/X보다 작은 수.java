import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//입력값 받기
		int n = sc.nextInt();
		
		int x = sc.nextInt();
		
		int [] arr = new int[n];
		
		//배열 생성
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//반복문 시작
		for(int result : arr) {
			//x보다 작으면 출력
			if(result < x) {
				System.out.print(result + " ");
			}
		}
		
	}

}
