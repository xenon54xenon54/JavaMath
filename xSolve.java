import java.util.ArrayList;

public class xSolve {
    public static boolean x1e(int x) {
        return ((x)==(4536*8));
    }
    public static void x1() {
        ArrayList <Integer> answers = new ArrayList <Integer>();
        answers.add(562);
        answers.add(567);
        answers.add(32046);
        answers.add(36288);
        for (int answer : answers) {
            if (x1e(answer) == (true)) {
                System.out.println(answer);
                break;
            }
        }
    }
    public static void main(String[] args) {
        x1();
    }
}