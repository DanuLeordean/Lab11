import java.util.Scanner;

public class InchtoMeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of inches: ");
        float a = sc.nextFloat();
        System.out.println(a+"inches is "+(a*0.0254)+ "meters");

    }
}
