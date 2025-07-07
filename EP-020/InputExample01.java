import java.util.Scanner;

public class InputExample01 {
    public static void main(String[] args) {
        //표준 입력
        //- System.in 통로 사용
        //- 한 글자를 코드표 값으로 읽을 수 있음
        //- 123을 읽으려면 세 번 읽어야 한다는 문제가 있음
        //- 여러 가지 문제점을 해결하기 위한 도구 중 Scanner를 사용
        //- 의미있게 글자를 모아서 형태에 맞춰 반환하는 기능을 제공
        
        
        //도구 생성 (import 확인)
        Scanner sc = new Scanner(System.in);
        
        System.out.println("정수 한 개를 입력하세요");
        int a = sc.nextInt();//정수 한 개를 입력받아라
        System.out.println("a = " + a);
        
        sc.close();//사용한 도구(통로) 제거, 메모리 절감을 위해 습관을 들여야함
    }
}
