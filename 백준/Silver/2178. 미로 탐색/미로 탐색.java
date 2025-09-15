import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	//전역 변수 설정
	static int n, m;
	static int maze[][];
	static boolean visited[][];
	
	//이동 방향 설정
	//4방향
	static int [] dx = {-1, 1, 0, 0};
	static int [] dy = {0, 0, -1, 1};
	
	//큐에 담을 클래스 생성
	static class Node {
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
		
		//n, m 입력
		n = sc.nextInt();
		m = sc.nextInt();
		//배열 초기화 
		maze = new int[n][m];
		visited = new boolean[n][m];
		
		//미로 만들기
		for(int i=0; i<n; i++) {
			//숫자가 붙어 오기 때문에 문자열로 받기
			String line = sc.next();
			for(int j=0; j<m; j++) {
				//문자에 '0'을 빼서 정수 담기
				maze[i][j] = line.charAt(j)-'0';
			}
		}
		
		//시작 좌표 0,0
		int startX = 0;
		int startY = 0;
		
		//결과는 bfs 반환 값
		int result = bfs(startX, startY);
		
		
		//출력
		System.out.println(result);
		

	}
	static int bfs(int x, int y) {
		
		//큐 생성
		Queue<Node> q = new LinkedList<>();
		
		//큐에 새로운 노드 넣기
		q.offer(new Node(x,y,1));
		
		//큐에 넣을 때 방문 체크
		visited[x][y] = true;
		
		//큐가 빌 때까지 반복
		while(!q.isEmpty()) {
			//큐 안의 값 빼기
			Node curr = q.poll();
			
			//만약 마지막 좌표에 도달하면 curr.dist 반환하기
			if(curr.x == n-1 && curr.y == m-1) {
				return curr.dist;
			}
			
			//마지막 좌표 아니라면 4방향 돌면서 길 찾기
			for(int dir=0; dir<4; dir++) {
				int nx = curr.x + dx[dir];
				int ny = curr.y + dy[dir];
				
				//아래 조건 만족할 때
				if(nx>=0 && nx<n && ny>=0 && ny<m && maze[nx][ny] == 1 && !visited[nx][ny]) {
					//반문 체크
					visited[nx][ny] = true;
					//새로운 좌표 값 다시 넣기
					//dist는 누적되서 최단 거리를 찾아야 하기 때문에 +1 해줌
					q.offer(new Node(nx, ny, curr.dist+1));
				}
			}
		}
		
		//해당하지 않는 경우 -1로 출력
		return -1;
		
	}

}
