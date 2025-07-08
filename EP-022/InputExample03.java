import java.util.Scanner;

public class InputExample03 {
    public static void main(String[] args) {
        //입력 - 이름(String), 부서(String), 연봉(int/long)
        Scanner sc = new Scanner(System.in);
        
        System.out.println("이름 입력");
        String name = sc.next();
        System.out.println("부서 입력");
        String dept = sc.next();
        System.out.println("연봉 입력");
        int salary = sc.nextInt();
        
        sc.close();
        
        //계산
        int before = salary / 12;
        
        //int after = before - (int)(before * 0.15);
        int after = before - before * 15 / 100;
        
        //출력
        System.out.println("이름 : " + name);
        System.out.println("부서 : " + dept);
        System.out.println("급여(세전) : " + before + "원");
        System.out.println("급여(세후) : " + after + "원");
    }
}
