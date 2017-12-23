public class xBrute {
    public static boolean x1e(int x) {
        return ((5*x+4)==(9));
    }
    public static void x1() {
        for (int i = -200; i < 200; i = i + (1)) {
            if (x1e(i) == true) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        x1();
    }
}