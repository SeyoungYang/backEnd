package chap06;

import java.util.Arrays;

public class Lotto {
	int [] lotto = new int[6];

	void lotto(int [] lottoNum) {
		while(lottoNum[lottoNum.length-1]==0) {
			int random = (int)(Math.random()*44)+1;
			
			for(int i = 0; i<lottoNum.length;i++) {
				
				if(lottoNum[i]==random) {
					break;
				}
				else if(lottoNum[i]==0) {
					lottoNum[i] = random;
					break;
				}
			}
		}
		this.lotto = lottoNum;
	}
	
	void sort(int [] sort) {
		for (int i=0; i < sort.length; i++ ) {
			for(int j=0; j < sort.length-i-1; j++)
				if(sort[j] < sort[j+1]) {
					int tmp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = tmp;
			}
		}
		this.lotto = sort;
	}
	
	public String toString() {
		String result = "로또번호 :" + Arrays.toString(this.lotto);
		return result;
	}		
}

