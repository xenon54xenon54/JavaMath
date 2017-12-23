
public class x1_20 {
    public static void print1_20() {
        for (int i = 0; i <= 20; i = i + 1) {
            int base = 2;//change to match the base of your choice
            switch (i) {
            case 1:
                System.out.println("The " + i + "st power of " + base + " is " + Math.round(Math.pow(base, i)));
                break;
            case 2:
                System.out.println("The " + i + "nd power of " + base + " is " + Math.round(Math.pow(base, i)));
                break;
            case 3:
                System.out.println("The " + i + "rd power of " + base + " is " + Math.round(Math.pow(base, i)));
                break;
            default:
                System.out.println("The " + i + "th power of " + base + " is " + Math.round(Math.pow(base, i)));
                break;
            }
        }
    }
    public static void main(String[] args) {
        print1_20();
    }
}