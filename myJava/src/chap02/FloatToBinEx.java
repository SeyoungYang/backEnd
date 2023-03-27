package chap02;
class FloatToBinEx {
	public static void main(String args[]) {
		float f = -9.1234567f;
		int i = Float.floatToIntBits(f); //32bit : 1|8|23

		System.out.printf("%f%n", f);
		System.out.printf("[%13d]%n",i);
		System.out.printf("%#X%n", i); // 16진수로 출력
	} // main의 끝
}
