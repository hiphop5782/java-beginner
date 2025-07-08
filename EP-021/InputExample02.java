import java.util.Scanner;

public class InputExample02 {
    public static void main(String[] args) {
        //다양한 형태의 데이터 입력
        Scanner sc = new Scanner(System.in);
        
        //정수, 실수, 문자열에 대한 입력
        System.out.println("long 입력");
        long a = sc.nextLong();
        System.out.println("a = " + a);
        
        System.out.println("float 입력");
        float b = sc.nextFloat();
        System.out.println("b = " + b);
        
        System.out.println("double 입력");
        double c = sc.nextDouble();
        System.out.println("c = " + c);
        
        System.out.println("문자열 입력");
        String d = sc.next();//띄어쓰기 전까지만 입력받음
        System.out.println("d = " + d);
        
        System.out.println("문장 입력");
        String e = sc.nextLine();
        System.out.println("e = " + e);
        
        //정리
        sc.close();
    }
}
