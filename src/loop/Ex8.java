package loop;

public class Ex8 {

	public static void main(String[] args) {
		// comtinue를 사용하여 1~10 사이의 홀수들의 합 ㄱ하기
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 10까지의 홀수들의 합은 " + sum);
	}

}
