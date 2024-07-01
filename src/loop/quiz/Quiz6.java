package loop.quiz;

public class Quiz6 {
	public static void main(String[] args) {
	int sum=0;
	for(int num =1;num<=100;num++) {
		
		sum+=num;
		
		if (sum>500) {
			System.out.println("sum : " + sum+ ", num : " + num);
			break;
		}
	}

}}
