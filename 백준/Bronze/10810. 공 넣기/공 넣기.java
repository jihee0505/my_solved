import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//n, m 입력
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//배열 생성
		int [] arr = new int [n];
		
		//m만큼 반복문 시작
		for(int tc=0; tc<m; tc++) {
			
			//i,j,k 차례대로 입력
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			//i에서 j만큼 m번 반복
			//이때 인덱스는 0부터 시작함으로 a-1해 주기
			for(int a=i; a<=j; a++) {
				arr[a-1] = k;
			}
	
		}
		
		//배열이 아닌 값으로 출력하기
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
	}

}
