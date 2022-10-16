import java.util.Scanner;


public class FarenheittoCelsius {

    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);
        System.out.println("Farenheit to Celsius (1) or Celsius to Farenheit (2)");
        int result = scan.nextInt();

        if (result ==1) {
            //calculate Farenheit to Celsius

            System.out.println("You have chosen Farenheit to Celsius");
            System.out.println("Enter Farenheit Value: ");
            double value = scan.nextDouble();
            double valueFinal = (value - 32) *5/9;
            System.out.print("Celsius is: ");
            System.out.println(Math.round(valueFinal*10.0)/10.0);

            System.out.println();
        } else if (result == 2) {
            //calculate Celsius to Farenheit

            System.out.println("You have chosen Celsius to Farenheit");
            System.out.println("Enter Celsius value: ");
            double value2 = scan.nextDouble();
            double finalResult = value2 * 1.8 + 32;
            System.out.print("Farenhioet is: ");
            System.out.println(Math.round(finalResult*10.0)/10.0);


        } else {
            //Any number that is not 1 or 2
            System.out.println("Not a valid choice!");
        }
    }
}
