import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("First Element");
        myList.add("Second Element");
        myList.add(1,"Third Element");

        myList.set(1, "Lalala");
      //  myList.remove(0 );


        List<Integer> mySecondList = new ArrayList<>();

        mySecondList.add(1);
        mySecondList.add(2);
        mySecondList.add(3);
        mySecondList.add(55);
        mySecondList.add(89);

       // mySecondList.remove(Integer.valueOf(55));
        LogicalOperations op = new LogicalOperations();
     //    op.printListFromNumber(mySecondList, 2);
      //   System.out.println(mySecondList);
      //  op.addStringToList(myList, 1, "Added to the first index");
      //  boolean found = op.verifyTextInList(myList, "Lalala");
      //  System.out.println(found);

     //   op.printList(myList);
     //  op.addNumberToList(mySecondList,1456);
      //  System.out.println(mySecondList);
      //  op.printListByIndex(mySecondList, 0);
      //  op.printListReversed(mySecondList);
      //  op.addStringToMyList(myList, 1, "Tema este foarte grea");
       // System.out.println(myList);
       // op.addNumberToFirstIndex(mySecondList, 3456);
       // System.out.println(mySecondList);
       // op.printListIndexAndElements(mySecondList);
       // System.out.println(op.getBiggestValueFromList(mySecondList));


    }
}
