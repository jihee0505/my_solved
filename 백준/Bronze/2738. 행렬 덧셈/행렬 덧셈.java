import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//n, m 입력
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//A, B 배열 생성하기
		int [][] A = new int[n][m];
		int [][] B = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		//합계를 저장할 배열 생성
		int[][] sum = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				sum[i][j] = A[i][j] + B[i][j]; 
				//한 줄 출력해 가기
				System.out.print(sum[i][j] + " ");
			}
			//한 줄 완성하면 줄 바꾸기
			System.out.println();
		}
		
		
		
	}

}
