public class DataExample05 {
    public static void main(String[] args) {
        //글자(char)
        //- 유니코드를 저장하기 위한 데이터 형태
        //- 숫자로 분류 (0 ~ 65535)
        //- 향후 문자열(String)이라는 형태의 기초 데이터가 됨
        
        char a = 65;
        System.out.println(a);
        
        char b = 'B';
        System.out.println(b);
        
        System.out.println((int)a);
        System.out.println((int)b);
        
        //ex : 한글은 어떤 번호를 가지고 있는가?
        char c = '가';
        char d = '힣';
        System.out.println((int)c);
        System.out.println((int)d);
    }
}
