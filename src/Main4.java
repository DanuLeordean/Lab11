public class Main4 {

    public static void main(String[] args) {

        LogicalOperations op = new LogicalOperations();

      int[] myArray = op.getArrayOfValues(100);
     //  op.printArray(myArray);
       int [] mySecondArray= {1,2,3,223,3,4,4444,4,45444,444,45553,22344};
      // op.printArray(mySecondArray);
      //  System.out.println();
      //  System.out.println(op.getAverrageFromArray(myArray));

       // System.out.println(op.gettIndexForValue(myArray, 200));
        int position = op.gettIndexForValue(mySecondArray, 45553);

        if(position== -1){
            System.out.println("Valoarea nu exista in array");
        }
        else {
            System.out.println(position);
        }
    }
}
