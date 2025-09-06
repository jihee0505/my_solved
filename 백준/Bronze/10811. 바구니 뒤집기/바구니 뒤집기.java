import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//n, m 입력
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//배열 생성
		//인덱스 값이 헷갈리기 때문에 n+1로 값과 맞춰주기
		int [] arr = new int[n+1];
		
		//1부터 담아주기
		for(int t=1; t<=n; t++) {
			arr[t] = t;
		}
		
		//바꿀 범위 설정하기
		for(int a=0; a<m; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			//j가 i보다 클 때까지 계속 반복
			while(i<j) {
				
				//값을 교환할 수 있도록 도와주는 임시 변수
				int tmp = 0;
				
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				
				//교환을 마치면 i++, j-- 해주기
				i++;
				j--;
			}
			
		}
		//출력
		for(int r=1; r<=n; r++) {
			System.out.print(arr[r] + " ");
		}
		
	}

}
