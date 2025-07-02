public class DataExample07 {
    public static void main(String[] args) {
        //문자열(String) - 문자를 여러개 보관하는 데이터 유형 (참조형)
        //int a = 10;
        String b = "hello";
        System.out.println(b);
        
        String c = "askdjfiasdjfijqwoeirjqoijdfasdifjasdifjqowierjasdf";
        System.out.println(c);
        System.out.println(c.length());//글자 수
        System.out.println(c.toUpperCase());//대문자 변환 명령
        
        //escape 문자 사용 가능
        String d = "안\n녕\n하\n세\n요";
        System.out.println(d);
        
        String e = "오늘 저녁은 \"떡볶이\"를 먹을거에요";
        System.out.println(e);
        
        String f = "C:\\Windows";
        System.out.println(f);
        
        //덧셈만 가능
        String g = "안녕" + "하세요";
        System.out.println(g);
        
        String h = "hello";
        System.out.println("h = " + h);
        
    }
}
