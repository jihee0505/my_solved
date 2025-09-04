import java.util.Scanner;

public class 코딩은체육과목입니다_25314 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//n 입력
		int n = sc.nextInt();
		
		//int, long 변수 생성
		String in = "int";
		String lon = "long";
		
		//n/4만큼 반복
		for(int i=0; i<n/4; i++) {
			
			System.out.print(lon +" ");

		}
		
		//int는 한 번만 반복
		System.out.print(in);
	
	}

}
