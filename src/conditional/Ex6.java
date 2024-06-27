package conditional;

public class Ex6 {

	public static void main(String[] args) {
		String rank = "1";
		switch (rank) {
		case "1": // rank 값이 1이면
			System.out.println("메달 색은 금입니다");
			break;
		case "2": // rank 값이 2이면
			System.out.println("메달 색은 은입니다");
			break;
		case "3": // rank 값이 3이면
			System.out.println("메달 색은 동입니다");
			break;
		default: // 변수와 일치하는 값이 없으면
			System.out.println("메달이 없습니다");
			break;

		}
//		float r = 1.1f;
//		
//		switch(r) { // 에러남 실수 타입 사용 불가
//		case 1.5f:
//			break;
//		}
	}

}
