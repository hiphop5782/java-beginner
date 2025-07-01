public class DataExample06 {
    public static void main(String[] args) {
        //논리(boolean)
        boolean a = true;
        boolean b = false;
        System.out.println(a);
        System.out.println(b);
        
        //숫자와 비교연산을 통해 논리를 계산해낼 수 있다
        //논리와 논리연산을 통해 논리를 합성할 수 있다
        
        //(ex) 어떤 사람의 나이가 성인인가요? (성인은 20세 이상)
        int man = 23;
        boolean adult = man >= 20;
        System.out.println(adult);
        
        //(ex) 어떤 사람의 나이가 청소년인가요? (14세 이상 20세 미만)
        int student = 17;
        //boolean teen = 14 <= student < 20;
        boolean teen = 14 <= student && student < 20;
        System.out.println("청소년인가요?");
        System.out.println(teen);
        
        //(ex) 지하철 무임승차 대상인가요? (8세 미만 또는 65세 이상)
        int people = 70;
        boolean free = people < 8 || people >= 65;
        System.out.println("무임승차 대상인가요?");
        System.out.println(free);
        
        boolean free2 = !(people >= 8 && people < 65);
        System.out.println(free2);
    }
}
