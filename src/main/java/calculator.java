import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Quadratic Formula Calculator!");
        System.out.println("Enter values for a, b, and c as decimal numbers:\n");
        Scanner sc = new Scanner(System.in);
        double result1;
        double result2;

        System.out.println("a: ");
        double a = sc.nextDouble();
        System.out.println("b: ");
        double b = sc.nextDouble();
        System.out.println("c: ");
        double c = sc.nextDouble();
        System.out.println("What units will your result be in?");
        String units = sc.nextLine();

        // calculate square root and inside
        double sqrt = Math.sqrt((Math.pow(b,2) - (4 * a * c)));
        result1 = ((-1 * b) + sqrt)/(2 * a);
        result2 = ((-1 * b) - sqrt)/(2 * a);

        System.out.println("Result 1: "+result1+" "+units);
        System.out.println("Result 1: "+result2+" "+units);

    }
}
