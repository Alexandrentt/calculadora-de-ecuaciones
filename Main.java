import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        double a = sc.nextDouble();
        System.out.println("b: ");
        double b = sc.nextDouble();
        System.out.println("c: ");
        double c = sc.nextDouble();
        if (a == 0){
            if (b == 0){
                System.out.println("The equation has no solution");
            } else {
                double x = -c / b;
                System.out.println("The solution is: " + x);    
            }
        } else {
            double discri = (b*b) - (4*a*c);
            System.out.println(">> The discriminant is " + discri);
            if (discri >= 0){
                double x1 = (-b + Math.sqrt(discri)) / (2*a);
                double x2 = (-b - Math.sqrt(discri)) / (2*a);
                System.out.println("The solutions are: " + x1 + " and " + x2);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discri) / (2 * a);
    
                System.out.println("The solutions are imaginary and are:");
                System.out.println(realPart + " + " + imaginaryPart + "i");
                System.out.println(realPart + " - " + imaginaryPart + "i");
            }
        }
        
        sc.close();
    }
}

