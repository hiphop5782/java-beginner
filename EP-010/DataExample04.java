public class DataExample04 {
    public static void main(String[] args) {
        //입력
        int korean = 85;//국어점수
        int english = 90;//영어점수
        int math = 70;//수학점수
        int computer = 92;//컴퓨터점수
        
        //연산
        int total = korean + english + math + computer;
        //float average = total / 4.0f;
        //float average = total / 4f;
        float average = (float)total / 4;
        
        //출력
        System.out.println(total);
        System.out.println(average);
    }
}
