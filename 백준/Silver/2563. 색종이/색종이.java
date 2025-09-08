import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//n 입력
		int n = sc.nextInt();
		
		//전체 칸을 세는 배열 생성
		int[][] paper = new int [100][100];  
		
		
		//left, bottom을 순서대로 입력하기
		for(int i=0; i<n; i++) {
			int left = sc.nextInt();
			int bottom = sc.nextInt();
			
			//해당 구역을 1로 채우기
			for(int j=left; j<left+10; j++) {
				for(int k=bottom; k<bottom+10; k++) {
					paper[j][k] = 1;
					
				}
			}

		}
		
		//전체 넓이
		int area = 0;
		
		//1을 발견하면서 면적 세기
		for(int j=0; j<100; j++) {
			for(int k=0; k<100; k++) {
				if(paper[j][k] == 1) {
					area++;
				}
			}
		}
		
		//출력
		System.out.println(area);
		
	}

}
