public class DataExample02 {
    public static void main(String[] args) {
        //입력 - 문제를 풀기 위해서 기본적으로 주어진 값들
        int guardianPrice = 8000;//보호자 요금
        int childrenPrice = 20000;//아동 요금
        int guardianCount = 3;//보호자 인원 수
        int childrenCount = 2;//아동 인원 수
        
        //처리 - 결과를 만들어내기 위한 계산 과정
        int guardianTotal = guardianPrice * guardianCount;//보호자 요금 합계
        int childrenTotal = childrenPrice * childrenCount;//아동 요금 합계
        int total = guardianTotal + childrenTotal;//총 요금 합계
        
        //출력 - 완성된 결과를 사용자가 볼 수 있도록 표시
        System.out.println(total);
    }
}
