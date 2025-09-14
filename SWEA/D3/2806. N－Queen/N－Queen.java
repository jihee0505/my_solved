import java.util.Scanner;

public class Solution {
	
	//전역 변수 설정
	static int n, cnt;
	static int [] board;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		//테스트케이스 시작
		for(int tc=1; tc<=t; tc++) {
			//n 입력
			n = sc.nextInt();
			//cnt 0으로 초기화
			cnt = 0;
			board = new int[n];
			
			//dfs 불러오기
			dfs(0);
			
			//출력
			System.out.println("#" + tc + " " + cnt);
		}//tc
		
		
	}
	
	//dfs 시작
	static void dfs(int row) {
		//base case
		//row가 n과 같을 때 cnt 증가 후 종료
		//아직 구할 값이 남았다면 이전으로 재귀
		if(row == n) {
			cnt++;
			return;
		}
		
		//row, col에 아직 아무것도 없는지 확인
		//아무것도 없다면 board[row]에 col 넣기
		//인덱스 값은 row, 값은 col로 체크
		//확인 후 다음으로 넘어가기
		for(int col=0; col<n; col++) {
			if(isSafe(row, col)) {
				board[row] = col;
				dfs(row+1);
			}
		}
		
	}
	
	//row, col에 아무것도 없는지 확인하는 메서드
	private static boolean isSafe(int row, int col) {
		//이전 값과 현재 row 값을 비교해서 값이 겹치지 않는지 확인
		//겹치면 이미 거기에 말이 놓여진 것이므로 false
		for(int prev=0; prev<row; prev++) {
			if(board[prev] == col) {
				return false;
			}
			
			//대각선일 때 row와 col 값이 이전과 비교했을 때 차이가 1로 동일하다면 false
			if(Math.abs(prev-row) == Math.abs(board[prev] - col)) {
				return false;
			}
		}
		//위의 상황들이 아니면 true 반환
		return true;
		
		
	}

}
