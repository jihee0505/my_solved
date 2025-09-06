import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		//나눌 값
		int n = 42;
		
		//입력 받을 값의 개수
		int m = 10;
		
		//배열 생성
		int [] arr = new int[m];
		
		for(int i=0; i<m; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		//나머지 값을 담을 배열
		int [] cram = new int[m];

		for(int i=0; i<m; i++) {
			cram[i] = arr[i]%n;
		}
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<m; i++) {
			set.add(cram[i]);
		}
		
		List<Integer> list = new LinkedList<>(set);
		
		int cnt =0;
		
		for(int i=0; i<list.size(); i++) {
			if(!list.isEmpty()) {
				list.get(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
