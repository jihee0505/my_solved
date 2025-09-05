import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//범위는 9로 제한되어 있음
		int n = 9;
		
		//배열 생성
		int [] arr = new int[n];
		
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//최대값 변수
		int max = 0;
		//위치 변수
		int posi = 0;
		
		//변수에 목표 값 담기
		for(int i=0; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
				posi = i+1;
			}
		}
		
		//출력
		System.out.println(max);
		System.out.println(posi);
		
		
		
	}

}
