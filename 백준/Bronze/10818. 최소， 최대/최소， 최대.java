import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//배열 생성
		int [] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//오름차순 정렬
		Arrays.sort(arr);
		
		//출력
		System.out.println(arr[0] + " " + arr[n-1]);
		
	}

}
