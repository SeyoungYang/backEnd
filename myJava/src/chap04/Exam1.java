package chap04;
import java.util.*;
/* 사용자에게 영어와 수학 점수를 입력 받아 다음의 결과를 출력하는 코드를 작성하세요.
 	1) 영어와 수학점수 모두 80점 이상이면 합격
 	2) 영어와 수학점수 중 한 과목이라도 60점 미만이면 과락
 	3) 영어와 수학점수 모두 80점 이상이면 합격 단, 논리 AND 연산자 사용불가   */
public class Exam1 {

	public static void main(String[] args) {
		int math, eng;
		String result;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어, 수학 점수를 입력하세요 >>>> ");
		eng = sc.nextInt();
		math = sc.nextInt(); 
		
		sc.close();
		
		//1)
		if(math>=80 & eng>=80) {
			result = "합격";
		}
		else {
			result = "불합격";
		}
		System.out.println(result);
		
		//2)
		if(eng < 60 | math < 60){
			result = "과락이 있습니다.";
		}
		else {
			result = "과락이 없습니다.";
		}
		System.out.println(result);
		
		//3)
		if(!(math < 80 | eng < 80)) {
			result = "합격";
		}
		else {
			result = "불합격";
		}
		System.out.println(result);
		
	}

}
