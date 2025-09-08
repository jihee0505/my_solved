import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		//과목 수
		int n = 20;
		
		Map<String, Double> map = new HashMap<>();
		
		//등급, 과목평점 map에 담기
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);
		
		//학점 * 과목 평점 누적 변수
		double totalScore = 0;
		
		//총 학점 누적 변수
		double totalCredits = 0;
				
		//반복문 시작
		for(int i=0; i<n; i++) {
			//차례대로 입력
			String subject = sc.next();
			double credit = sc.nextDouble();
			String grade = sc.next();
			
			//p인 경우를 제외하고 더하기
			if(!grade.equals("P")) {
				//학점 * 과목 평점
				totalScore += credit * map.get(grade);
				totalCredits += credit;
			}
			
			
		}
		
		//최종적으로 구하는 전공평점
		double result = totalScore / totalCredits;
		
		//출력
		System.out.printf("%.6f", result);
		 

		
	}

}
