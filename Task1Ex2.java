import java.util.Scanner;

public class Task1Ex2 {

    public static boolean isDouble(String a) throws NumberFormatException {
        try {
            Double.parseDouble(a);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static  double getRes(double a, double b, double c){
        double res = ((b + Math.sqrt((b * b) + (4 * a * c))) / (2 * a)) - ((a * a * a) * c + (1 / (b * b)));
        System.out.println("Result = " + res);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check;
        check = true;

        double x = 0;
            do {
                System.out.println("Enter A = ");
                String a = sc.nextLine();
                if (isDouble(a)) {
                    x = Double.parseDouble(a);
                    check = false;
                } else {
                    System.out.println("String not a number!!!");
                    check = true;
                }
            } while(check);


        double y = 0;
        do {
            System.out.println("Enter B = ");
            String b = sc.nextLine();
            if (isDouble(b)) {
                y = Double.parseDouble(b);
                check = false;
            } else {
                System.out.println("String not a number!!!");
                check = true;
            }
        } while(check);

        double z = 0;
        do {
            System.out.println("Enter C = ");
            String c = sc.nextLine();
            if (isDouble(c)) {
                z = Double.parseDouble(c);
                check = false;
            } else {
                System.out.println("String not a number!!!");
                check = true;
            }
        } while(check);

        getRes(z, y, x);

    }
}
