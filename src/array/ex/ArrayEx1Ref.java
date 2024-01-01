package array.ex;

public class ArrayEx1Ref {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total=0;
        for (int i =0; i<students.length; i++){
            total += students[i];
        } //alt + enter로 노란색 글씨 참ㄱ하기
        double average = (double) total / 5;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }

}
