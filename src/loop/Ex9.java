package loop;

public class Ex9 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		// break는 특정조건에서 빠져나와야할때 사용할 것
		for (i=1;i<20;i++) {
			sum+=i;
			System.out.println("i : " + i + " , sum : " + sum);
			if(sum>=100) {
				break;
			}
			
		}

		System.out.println("i : " + i);
		System.out.println("sum : " + sum);
	}

}
