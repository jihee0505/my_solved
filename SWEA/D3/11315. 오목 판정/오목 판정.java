import java.util.Scanner;

public class Solution {
	
	//전역 변수 설정
	static int n;
	static char[][] omok;
	
	//이동 방향
	static int[] dx = {0, 1, 1, 1};
	static int[] dy = {1, 0, 1,-1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 입력
		int t = sc.nextInt();
		
		//테스트케이스 시작
		for(int tc=1; tc<=t; tc++) {
			n = sc.nextInt();
			//오목 초기화
			omok = new char[n][n];
			
			//오목 배열 값 담기
			for(int i=0; i<n; i++) {
				//입력 값이 붙어 있으므로 문자열로 받기
				String line = sc.next();
				for(int j=0; j<n; j++) {
					//문자로 나눠서 넣기
					omok[i][j] = line.charAt(j);
				}
			}
			
			//isTrue 메서드에 넣고 true면 YES, 아니면 NO 출력
			if(isTrue(omok)) {
				System.out.println("#" + tc + " " + "YES");
			} else {
				System.out.println("#" + tc + " " + "NO");
			}
		}
	}
	
	//연속된 o를 찾았는지 체크하는 메서드
	static boolean isTrue(char[][] arr) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				//만약 o를 못 찾았다면 넘기기
				if(arr[i][j] != 'o') {
					continue;
				}
				//찾았을 경우 방향 설정
				for(int dir=0; dir<4; dir++) {
					//o를 찾을 때마다 카운트 할 변수
					int cnt = 1;
					//연속된 5가지 o가 나오는지 체크
					for(int k=1; k<=5; k++) {
						int nx = i + dx[dir] * k;
						int ny = j + dy[dir] * k;
						
						//범위를 벗어날 경우 for문 빠져 나가기
						if(nx<0 || nx>=n || ny<0 || ny>=n) {
							break;
						}
						//o가 맞다면 카운트
						if(arr[nx][ny] == 'o') {
							cnt++;
							//아닐 경우 빠져 나가기
						} else {
							break;
						}
					}
					//cnt가 5 이상이면 true
					if(cnt >= 5) {
						return true;
					}
				}
			}
		}
		//cnt가 5 미만인 경우 false 출력
		return false;
	}
	
	
}

