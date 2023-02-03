import java.util.Scanner;

//1
public class Method {
    //2
    public static void main(String[] args) {
        //3a
        int add2result = add(1,2);
        System.out.println(add2result);
        //4a
        int add4result = add(3,8,4,9);
        System.out.println(add4result);
        //5a
        String morningGreeting1 = morningGreeting("E");
        System.out.println(morningGreeting1);
        //6a
        String afternoonGreeting1 = afternoonGreeting("F");
        System.out.println(afternoonGreeting1);
        //7a
        String triple1 = triple("gg");
        System.out.println(triple1);
        //8a
        double half1 = half(17);
        System.out.println(half1);
        //9a
        int roundingpos1 = roundPositiveValueToNearestInteger(9.78);
        System.out.println(roundingpos1);
        //10a
        int roundingneg1 = roundNegativeValueToNearestInteger(-9.78);
        System.out.println(roundingneg1);


    }
    //3b
    public static int add(int a, int b) {
        return a + b;
    }
    //4b
    public static int add(int a, int b, int c, int d){
        return a + b + c + d;
    }
    //5b
    public static String morningGreeting(String e){
        return "早上好, " + e + "!";
    }
    //6b
    public static String afternoonGreeting(String f){
        return "下午好, " + f + "!";
    }
    //7b
    public static String triple(String g){
        return g + g + g;
    }
    //8b
    public static double half(int h){
        double hdouble = (double)h;
        return hdouble / 2;
    }
    //9b
    public static int roundPositiveValueToNearestInteger(double i){
        i = i + 0.5;
        int inti = (int)i;
        return inti;
    }
    //10b
    public static int roundNegativeValueToNearestInteger(double j) {
        j = j - 0.5;
        int intj = (int) j;
        return intj;
    }
}
