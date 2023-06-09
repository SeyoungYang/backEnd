package chap05;
class ArrayEx4 {
	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D'};
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);

		// 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length+num.length];
		
		System.arraycopy(abc, 0, result, 0, abc.length);
						//abc배열의, 0번째 부터,result 배열의, 0번째 위치로, abc.lenth만큼 복사해라
		// => result = 'A', 'B', 'C', 'D', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
		
		System.arraycopy(num, 0, result, abc.length, num.length);
		// => result = 'A','B','C','D','0','1','2','3','4','5','6','7','8','9'
		
		System.out.println(result);

		// 배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);	
		// => num = 'A','B','C','D','4','5','6','7','8','9'
		System.out.println(num);

	     // number의 인덱스6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		//=> num = 'A','B','C','D','4','5','A','B','C','D'
		
		System.out.println(num);
	}
}
