import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		//A, B, V 입력
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		//마지막 날 V-B까지 와야 정확한 날을 계산할 수 있음
		int days = (V - B) / (A - B); 
		
		//만약 0으로 딱 떨어지지 않는다면 day를 플러스 해주기
		if((V - B) % (A - B) >0) {
			days++;
		}
		
		//출력
		System.out.println(days);
		
		
	}

}
