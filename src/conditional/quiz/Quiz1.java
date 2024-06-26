package conditional.quiz;

public class Quiz1 {
	public static void main(String[] args){
		int x = 4;
		if ((x%2 == 0) || (x%3==0)) { //x가 2 또는 3의배수라면
			System.out.println("x는 2 또는 3의 배수입니다: " + x);
		}
	}
}
