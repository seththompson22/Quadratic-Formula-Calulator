import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Quadratic Formula Calculator!");
        System.out.println("Enter values for a, b, and c as decimal numbers:\n");
        Scanner sc = new Scanner(System.in);
        double result1;
        double result2;

        System.out.println("\nWhat units will your result be in?");
        String units = sc.nextLine();
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        // calculate square root and inside
        double sqrt = Math.sqrt((Math.pow(b,2) - (4 * a * c)));
        result1 = ((-1 * b) + sqrt)/(2 * a);
        result2 = ((-1 * b) - sqrt)/(2 * a);

        System.out.println("Result 1: "+result1+" "+units);
        System.out.println("Result 1: "+result2+" "+units);

    }
}
