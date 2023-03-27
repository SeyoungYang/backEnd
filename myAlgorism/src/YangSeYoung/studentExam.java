package YangSeYoung;

import java.util.LinkedList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class studentExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choose = 0, num;
		int [] score = new int[4];
		
		LinkedList<studentData> x = new LinkedList<studentData>();
		studentSearch ss = new studentSearch();

		do {
			while(true) {
			try {
				System.out.println("\n### 학생 성적 관리 프로그램 ###");
				System.out.println("1. 학생 정보 입력");
				System.out.println("2. 학생 정보 조회");
				System.out.println("3. 성적 변경");
				System.out.println("4. 학생 정보 삭제");
				System.out.println("5. 프로그램 종료");
				System.out.printf(">>> ");
				choose = sc.nextInt();
				if(choose>5) {
					System.out.println("!!! 잘못된 번호 입력입니다 !!!");
				}
				break;
				}catch(InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.println("!!! 잘못된 입력입니다. 다시 시도해 주세요 !!!");
				}
			}
			switch(choose) {
			case 1: 
				try {	
						System.out.println("\n학생 정보를 입력해 주세요");
						System.out.print("학번 : ");
						int id = sc.nextInt();
						if(id<0) {
							System.out.println("학번을 양수로 입력해주세요");
							break;
							}
						if(ss.IdSearch(x,id)>=0) {
							IdMismatchException im = new IdMismatchException();
							System.out.println("\n"+im.getMessage());
							break;
							}
						System.out.print("이름 : ");
						String name = sc.next();
						System.out.print("성별(1.남,2.여)) : ");
						//String gender = sc.next();
						int gender = sc.nextInt();
						if/*(gender != "남" & gender != "여")*/(gender != 1 & gender != 2) {
							GenderMismatchException gm = new GenderMismatchException();
							System.out.println("\n!!!"+gm.getMessage()+"!!! \n");
							break;
						}
						
						System.out.print("성적 (국어 영어 수학 과학) : ");
						score[0] = sc.nextInt();
						score[1] = sc.nextInt();
						score[2] = sc.nextInt();
						score[3] = sc.nextInt();
						
						boolean bol = false;
						for(int i = 0; i<4; i++) {
							if( score[i]<0 || 100<score[i]) {
								bol = true;
								break;
							}
						}
						
						if(bol) 
						{
							ScoreOutOfBoundaryException sb = new ScoreOutOfBoundaryException();
							System.out.println("\n!!!"+sb.getMessage()+"!!!\\n");
							break;
						}
						
						x.add(new studentData(id,name,gender,score));
						System.out.println("-----------------------------");
						System.out.println("학생 정보가 다음과 같이 저장되었습니다.");
						System.out.println(x.get(ss.IdSearch(x, id)).toString());
						System.out.println("-----------------------------");
						break;
					}catch(InputMismatchException e) {
						System.out.println("!!! 잘못된 입력입니다 !!!");
						break;
					}
					
			case 2: 
				try {
					System.out.println("어떤 방식으로 조회할까요? 1.전체 조회, 2.개별 조회");
					num = sc.nextInt();
								
					if(num==1) {
						ss.all(x);
					}else if(num==2) {
						System.out.println("조회할 학번을 입력하세요 : ");
						num = sc.nextInt();
						if(ss.IdSearch(x, num)<0) {
							throw new IdMismatchException();
						}else {
						System.out.println(num+"학번 학생의 정보입니다.");			
						System.out.println(x.get(ss.IdSearch(x, num)).toString());
						}
					}else {
						System.out.println("!!! 잘못된 번호 입력입니다 !!!");
					}
					break;
				}catch(InputMismatchException e) {
					System.out.println("!!! 잘못된 입력입니다 !!!");
					break;
				}catch(IdMismatchException im) {
					System.out.println("!!! 해당 학번이 조회되지 않습니다 !!!");
					break;
				}
			
			
			case 3: 
				try {
					
					while(true){
						try {
								System.out.println("성적변경을 진행할 학번을 입력하세요 : ");
								num = sc.nextInt();
								
								if(ss.IdSearch(x, num)<0) {
   									throw new IdMismatchException();
								}
							System.out.print("성적을 입력하세요 (국어 영어 수학 과학) : ");
							score[0] = sc.nextInt();
							score[1] = sc.nextInt();
							score[2] = sc.nextInt();
							score[3] = sc.nextInt();
							x.get(ss.IdSearch(x,num)).setScore(score);
							break;
							}catch(ScoreOutOfBoundaryException s) {
								sc = new Scanner(System.in);
								System.out.println("\n!!!"+s.getMessage()+"!!!\\n");
							}
						}
					System.out.println("-----------------------------");
					System.out.println("성적 변경이 완료되었습니다.");
					System.out.println(x.get(ss.IdSearch(x, num)));
					System.out.println("-----------------------------");
					
				}catch(InputMismatchException e) {
					System.out.println("!!! 잘못된 입력입니다 !!!");
				}catch(IdMismatchException im) {
					System.out.println("!!! 해당 학번이 조회되지 않습니다 !!!");
				}
				break;
			case 4: 
				try {
					System.out.println("삭제할 학생의 학번을 입력하세요 : ");
					num = sc.nextInt();
					if(ss.IdSearch(x, num)<0) {
							throw new IdMismatchException();
					}
					System.out.println(x.get(ss.IdSearch(x, num)).getName()+"학생의 정보가 삭제되었습니다.");
					x.remove(ss.IdSearch(x,num));
					
				}catch(InputMismatchException e) {
					System.out.println("!!! 잘못된 입력입니다 !!!");
					
				}catch(IdMismatchException im) {
					System.out.println("!!! 해당 학번이 조회되지 않습니다 !!!");
				}
				break;
			case 5: break;
			
			default : break;
			
			}
		}while(choose!= 5);
		
		System.out.println("프로그램이 종료되었습니다. 감사합니다.");
		sc.close();
		
	}

}
