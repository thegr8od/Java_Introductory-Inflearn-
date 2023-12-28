package loop;

public class Continue1 {

    public static void main(String[] args) {
        int i = 1;

        while(i<=5){
            if(i==3){
                i++;
                continue; //3일때는 빠져나간다. 밑에 조건문 무시
            }
            System.out.println(i);
            i++;
        }
    }
}
