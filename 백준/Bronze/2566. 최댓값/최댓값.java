import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//전체 크기
		int n = 9;
		
		//배열 생성
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//갱신할 최댓값 변수
		int max = Integer.MIN_VALUE;
		
		//갱신할 행 변수
		int row = 0;
		//갱신할 열 변수
		int col = 0;
		
		//max보다 값이 클 때 갱신하기
		for(int i=0 ; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
					row = 1 + i;
					col = 1 + j;
					//같을 경우 지나가기
				}
			}
		}
		
		//출력
		System.out.printf("%d\n%d %d\n", max, row, col);
		
	}

}
