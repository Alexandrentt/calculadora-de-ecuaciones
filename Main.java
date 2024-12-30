import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese a: ");
        double a = sc.nextDouble();
        System.out.println("Ingrese b: ");
        double b = sc.nextDouble();
        System.out.println("Ingrese c: ");
        double c = sc.nextDouble();
        if (a == 0){
            if (b == 0){
                System.out.println("La ecuación no tiene solución");
            } else {
                double x = -c / b;
                System.out.println("La solución es: " + x);    
            }
        }else{
            double discri = (b*b) - (4*a*c);
            System.out.println(">> El discriminante es "+discri);
            if (discri>= 0){
                double x1 = (-b + Math.sqrt(discri)) / (2*a);
                double x2 = (-b - Math.sqrt(discri)) / (2*a);
                System.out.println("Las soluciones son: " + x1 + " y " + x2);
            } else{
                double parteReal = -b / (2 * a);
                double parteImaginaria = Math.sqrt(-discri) / (2 * a);
    
                System.out.println("Las soluciones son imaginarias y son:");
                System.out.println(parteReal + " + " + parteImaginaria + "i");
                System.out.println(parteReal + " - " + parteImaginaria + "i");
            }
        }
        
        sc.close();
    }
}
