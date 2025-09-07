import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//총 개수
		int n = 6;
		
		//옳은 개수
		int [] origin = {1, 1, 2, 2, 2, 8};
		
		//틀린 개수
		int [] fake = new int[6];
		
		//배열 입력
		for(int i=0; i<n; i++) {
			fake[i] = sc.nextInt();
		}
		
		//옳은 것과 틀린 것이 일치하지 않을 경우 옳은 것에서 틀린 것을 뺀 값 출력
		for(int i=0; i<n; i++) {
			if(origin[i] != fake[i]) {
				System.out.print(origin[i]-fake[i] + " ");
				//일치 할 때는 0 출력
			} else {
				System.out.print(0 + " ");
			}
		}
		
		
	}

}
