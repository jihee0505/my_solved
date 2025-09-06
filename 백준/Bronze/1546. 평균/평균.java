import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//n 입력 
		int n = sc.nextInt();
		
		//배열 생성
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//오름차순 정렬
		Arrays.sort(arr);
		
		//최대값 변수 생성
		int max = arr[arr.length-1];
		
		//평균 값 받을 합계
		double sum = 0;
		
		//각 점수마다 최대 값으로 나눈 후 100 곱한 값을 sum 변수에 누적하며 더하기
		for(int i=0; i<n; i++) {
			
			sum += ((double)arr[i]/max)*100;
			
		}
		
		//평균 변수
		double avg = sum/n;
		
		//출력
		System.out.println(avg);
		
		
	}

}
