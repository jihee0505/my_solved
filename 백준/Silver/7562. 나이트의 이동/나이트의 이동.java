import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	//전역 변수 설정
	static int n;
	static boolean[][] visited;
	static int cnt;
	
	//이동 방향 설정
	static int [] dx = {-2, -2, -1, 1, 2, 2, 1, -1};
	static int [] dy = {-1, 1, 2, 2, 1, -1, -2, -2};
	
	//큐에 사용할 클래스 생성
	static class Node{
		int x, y, dist;

		//생성자
		public Node(int x, int y, int dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}

		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		//테스트케이스 시작
		for(int tc=1; tc<=t; tc++) {
			n = sc.nextInt();
			
			cnt = 0;
			
			visited = new boolean[n][n];
			
			//시작 좌표, 끝나는 좌표
			int startX = sc.nextInt();
			int startY = sc.nextInt();
			
			int goalX = sc.nextInt();
			int goalY = sc.nextInt();

			
			//결과 
			int result = bfs(startX, startY, goalX, goalY);
			
			//출력
			System.out.println(result);
			
			
		}
	
		
	}
	
	//bfs 
	private static int bfs(int x, int y, int gx, int gy) {

		//방문 초기화
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
			visited[i][j] = false;
			}
		}
		
		//큐 생성
		Queue<Node> q = new LinkedList<>();
		
		//큐에 새로운 Node 담기
		q.offer(new Node(x, y, 0));
		
		//x,y는 방문 체크
		visited[x][y] = true;
		
		//큐가 빌 때까지 반복
		while(!q.isEmpty()) {
			//큐 빼기
			Node curr = q.poll();
			
			//현재 좌표와 목표 좌표가 같다면 curr.dist 반환하기
			if(curr.x == gx && curr.y == gy) {
				return curr.dist;
			}
			
			//목표 좌표가 아니라면 8방향 돌면서 반복
			for(int dir=0; dir<8; dir++) {
				int nx = curr.x + dx[dir];
				int ny = curr.y + dy[dir];
				
				//범위 이내라면 방문 체크 
				//큐에 새로운 nx, ny 넣기
				//몇 번 이동했는지 확인하기 위해 dist+1
				if(nx>=0 && nx<n && ny>=0 && ny<n) {
					if(!visited[nx][ny]) {
						visited[nx][ny] = true;
						q.offer(new Node(nx, ny, curr.dist+1));
					}
				}
			}
			
		}
		//값이 없을 경우 0 출력
		return 0;
	
	}

}
