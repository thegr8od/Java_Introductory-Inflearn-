package method;

public class Overloading3 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2,1.5));

    }

    public static int add(int a, int b){
        return a+b;
    }

    public static double add(double a, double b){
        return a+b;

    } //자기 형 없으면 자동 형변환 가능
}
