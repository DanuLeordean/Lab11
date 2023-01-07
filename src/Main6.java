import java.util.*;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] myArray = {123, 435, 3532, 5432};



//        try {
//            System.out.println("Enter a number: ");
//            int numberFromKeyboard = scan.nextInt();
//            System.out.println(myArray[numberFromKeyboard]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Numarul nu se afla in intervalul [0 - " + (myArray.length-1)+ "]");
//        } catch (InputMismatchException e) {
//            System.out.println("Valoarea introdusa ["+ scan.nextLine()+"] nu este un numar");
//        }
//        System.out.println("aici");


        Read read = new Read();
//        System.out.println("numarul introdus e: " + read.getInt());
//
       LogicalOperations op = new LogicalOperations();

//       int [] myArray2 = read.getArrayOfNumbers(3);
//       op.printArray(myArray2);


       int [] array = read.getPopulatedArray(5);
       for(int i : array){
           System.out.println(i);
       }

        List<Integer> list = read.getPopulatedList();
        System.out.println(list);

        array = new int[]{1, 2, 3, 4};
        op.readArrayIndex(array,5);

        op.wait(20);

    }
}
