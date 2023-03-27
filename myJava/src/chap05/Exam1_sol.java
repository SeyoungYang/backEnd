package chap05;

import java.util.Arrays;

public class Exam1_sol {

	public static void main(String[] args) {
		int []lotto=new int[6];
		int lottoNum, temp;
		
		for(int i = 0; i < lotto.length ; i ++) {
			while(true) {
				boolean isDuplicate = false;
				lottoNum = (int)(Math.random()*44)+1;
				for(int j=0; j < lotto.length; j++) {
					if(lottoNum == lotto[j]) {
						isDuplicate = true;
						break;
					}
				}
				
				if(!isDuplicate) {
					lotto[i] = lottoNum;
					break;
				}
			}
		}
		
		for(int i = 0; i<lotto.length -1; i++) {
			for(int j = i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		} 
		System.out.println("로또 번호: " +Arrays.toString(lotto));
	}
	
}
