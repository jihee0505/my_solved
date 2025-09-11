import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 입력
		int t = sc.nextInt();
		
		//테스트케이스 시작
		for(int tc=1; tc<=t; tc++) {
			
			//n 입력
			int n = sc.nextInt();
			
			//배열 입력
			int[][] arr = new int[n][n];
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			//합계를 갱신할 가장 최소값 
			int min = Integer.MAX_VALUE;
			//모든 경우의 수 
			for(int i=1; i<(1<<n); i++) {
				//i가 절반인 경우면 확인
				if(Integer.bitCount(i) == n/2) {
					
					//원하는 대로 넣을 수 있는 배열
					ArrayList<Integer> A = new ArrayList<>();
					ArrayList<Integer> B = new ArrayList<>();
					
					//j는 재료
					//1일 때와 0으로 나누기
					for(int j=0; j<n; j++) {
						if((i&(1<<j)) != 0) {
							A.add(j);
						} else {
							B.add(j);
						}
					}
					
					//두 팀의 합계 변수
					int sumA = 0;
					int sumB = 0;
					
					//n/2만큼만 돌아서 해당 값을 배열의 인덱스로 활용
					//팀A
					for(int j=0; j<n/2; j++) {
						for(int k=j+1; k<n/2; k++) {
							int r1 = A.get(j);
							int c1 = A.get(k);
							sumA += arr[r1][c1] + arr[c1][r1];
						}
					}
					
					//팀B
					for(int j=0; j<n/2; j++) {
						for(int k=j+1; k<n/2; k++) {
							int r2 = B.get(j);
							int c2 = B.get(k);
							sumB += arr[r2][c2] + arr[c2][r2];
						}
					}
					
					//합계 차 계산
					int diff = Math.abs(sumA-sumB);
					
					//가장 작은 숫자로 갱신
					min = Math.min(min, diff);
					
				}
	
			}
			
			//출력
			System.out.println("#" + tc + " " + min);
			
		}
	
	
	
	}

}
