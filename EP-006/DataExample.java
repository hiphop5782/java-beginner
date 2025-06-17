public class DataExample {
	public static void main(String[] args) {
		//변수 생성 방법

		//- 10을 변수에 저장한 뒤 출력하세요
		int number = 10;
		System.out.println(number);

		//int number = 20;//두 번은 생성할 수 없음
		number = 20;//덮어쓰기됨
		System.out.println(number);

		//int value;//값을 넣지 않았기 때문에 사용할 수 없는 상태
		int value = 30;
		System.out.println(value);

		int total = number + value;
		System.out.println(total);
	}
}
