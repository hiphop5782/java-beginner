public class OutputExample01 {
    public static void main(String[] args) {
        //표준 출력 명령
        //- System.out을 이용해서 메세지를 결과화면에 출력하는 명령
        
        //- System.out.print() : 괄호 안의 내용물을 있는 그대로 출력
        System.out.print("안녕");
        System.out.print("하세요");
        System.out.print("\n");
        System.out.print(100+200);
        System.out.print("\n");
        
        //- System.out.println() : 괄호 안의 내용물을 출력하고 줄바꿈(개행)
        System.out.println("안녕하세요");
        System.out.println(100 + 200);
        
        //- System.out.printf() : C언어에서 넘어온 문자열 형식 조합 출력
        //- %d(정수) , %f(실수), %c(글자), %s(문자열)
        int a = 100;
        int b = 200;
        int c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        System.out.println(a + " + " + b + " = " + c);
    }
}
