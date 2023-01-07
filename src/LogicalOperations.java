import java.util.List;

public class LogicalOperations {

    public int getGreaterNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }

    }

    public String textAndNumberComp(String textInput, int numberInput) {

        if (textInput.equals("FastTrack") && numberInput <= 5) {
            return textInput + numberInput;
        } else if (!textInput.equals("FastTrack") && numberInput >= 4) {
            return numberInput + textInput;
        } else {
            return "no condition was met";
        }
    }

    public String learnTrySomeMore(String textInput) {
        if (textInput.equals("FastTrack")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }

    }

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String exCinci(String textInput, int numberInput) {
        if (textInput.equals("FastTrack") && numberInput <= 3) {
            return textInput + numberInput;
        } else if (!textInput.equals("FastTrack") && numberInput >= 4) {
            return numberInput + textInput;
        } else {
            return "no condition was met";
        }

    }

    public String winterSnow(int numberInput) {
        if (numberInput > 8) {
            return "The amount of snow this winter was(cm): " + numberInput;
        } else if (numberInput == 6) {
            return "The amount of snow this winter was(cm): " + numberInput;
        } else {
            return "The forecast snow is(cm): " + numberInput;
        }
    }

    public String greaterThanNotEqual(int numberInput) {
        if (numberInput > 3 && numberInput != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (numberInput == 4) {
            return "The number is equal to 4";
        }
        return "no condition was met";
    }

    public void switchCase(int numberInput) {
        switch (numberInput) {
            case 1: System.out.println("The number is:  1 !"); break;
            case 2: System.out.println("The number is:  2 !"); break;
            case 3: System.out.println("The number is:  3 !"); break;
            case 4: System.out.println("The number is:  4 !"); break;
            case 5: System.out.println("The number is:  5 !"); break;
            case 6: System.out.println("The number is:  6 !"); break;
            case 7: System.out.println("The number is:  7 !"); break;
            case 8: System.out.println("The number is:  8 !"); break;
            case 9: System.out.println("The number is:  9 !"); break;
            default: System.out.println("The number is not between 1-9 !");
        }
    }

    public void isEvenNumber(int numberInput) {
        if (numberInput % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public void isEligibleToVote(int numberInput) {
        if (numberInput >= 18) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public int celMaiMareNumar(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else if (third > first && third > second) {
            return third;
        }
        return first;
    }

    public void printNumberTo100(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public float sumAndAverage() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        float average = sum / 100f;
        return average;
    }

    public void numaratoareMinus100(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void printfromFirstToLast(int first, int last) {
        while (first <= last) {
            System.out.println(first);
            first++;
        }
    }

    public void verificaBiggerNumberNumaratoareCrescatoare(int x, int y) {
        if (x > y) {
            while (y <= x) {
                System.out.println(y);
                y++;
            }
        } else {
            while(x <= y) {
                System.out.println(x);
                x++;
            }
        }
        }
        public void numereParePanaLa100 (int number){
        for (int i=1; i<= number; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
        }

    public void numereImparePanaLa100 (int number){
        for (int i=1; i<= number; i++) {
            if (i%2!=0) {
                System.out.println(i);
            }
        }
    }

    public float averageFromNumberToNumber (int first, int last) {
        float sum = 0;
        int count = 0;
        while(first<=last){
            sum=sum + first;
            count ++;
            first ++;

        }
        return sum/count;
    }

    public void fibonacci () {
        int i =1, n= 20, firstTerm = 0, secondTerm = 1;
        while ( i <= n){
            System.out.println(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm=secondTerm;
            secondTerm = nextTerm;
            i++;

        }

    }

    public void cozaLozaWoza ( int numere, int randuri) {
        int i = 1;

        while (i <= 110) {
            boolean test = false;
            if (i % 3 == 0) {
                System.out.print("coza");
                test = true;
            }
            if (i % 5 == 0) {
                System.out.print("loza");
                test = true;
            }
            if (i % 7 == 0) {
                System.out.print("woza");
                test = true;
            }
            if (!test) {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }
     public int getIndexForValue (int[] array, int value) {
        for (int i = 0; i< array.length; i++){
            if (array[i] == value) {
                return i;
            }
        }
        return - 1;
     }

      public void printCLW () {
          int i = 1;
          while (i <= 110) {

              if (i % 3 == 0 && i % 5 == 0 & i % 7 == 0) {
                  System.out.print("CozaLozaWoza ");
              } else if (i % 3 == 0 && i % 5 == 0) {
                  System.out.print("CozaLoza ");
              } else if (i % 3 == 0 && i % 7 == 0) {
                  System.out.print("CozaWoza ");
              } else if (i % 5 == 0 && i % 7 == 0) {
                  System.out.print("LozaWoza ");
              } else if (i % 3 == 0) {
                  System.out.print("Coza ");
              } else if (i % 5 == 0) {
                  System.out.print("Loza ");
              } else if (i % 7 == 0) {
                  System.out.print("Woza ");
              } else {
                  System.out.print(i + " ");
              }
              if (i % 11 == 0) {
                  System.out.println();
              }

              i++;

          }
      }
      public float getaveragenumberininterval (int first, int second){
        float sum = 0;
        int count = 0;
        while (first <= second){
            if(first%7==0){
                sum+=first;
                count++;
            }
            first++;
        }
        return sum/count;

      }
      public int[] getArrayOfValues (int positions){
          int[] myArray = new int[positions];

          for (int i = 0; i< myArray.length; i++){
              myArray[i] = i + 1;
          }
          return myArray;
      }
      public void printArray(int [] myArray){
          for (int i = 0; i < myArray.length; i++) {
              System.out.print(myArray[i]+ " ");
          }
      }
      public float getAverrageFromArray(int[] myArray){
        float sum = 0;
        for (int i = 0; i < myArray.length; i++){
            sum +=myArray[i];
        }
        return sum/myArray.length;
      }

      public int gettIndexForValue(int[] myArray, int value){

        for (int i = 0; i< myArray.length; i++){
            if( myArray[i]== value){
                return i;
            }
        }
        return -1;
      }

      public void printListFromNumber(List<Integer> myList, int number) {
        for(int i = number; i < myList.size(); i++){
              System.out.println(myList.get(i));
              if (myList.get(i)==55){
                  myList.remove(i);
              }
          }
      }

      public void addStringToList ( List<String> myList, int position, String text){
        myList.add(position, text);
      }

      public boolean verifyTextInList (List<String> myList, String text){
        for(String x:myList){
            if (x.equals(text)){
                return true;
            }
        }
        return false;
      }

      public void printList (List<String> myList){
        for (int i =0; i< myList.size();i++){
            System.out.println(myList.get(i));
        }
      }
      public void addNumberToList( List<Integer> myList, int number){
        myList.add(number);
      }

      public void printListByIndex (List<Integer> myList, int position){
        for( int i = position; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
      }

      public void printListReversed(List<Integer> myList){
        for (int i = myList.size()-1;i>0; i--){
            System.out.println(myList.get(i));
        }
      }
      public void addStringToMyList (List<String> myList, int index, String text){
        myList.add(index, text);
      }

      public void addNumberToFirstIndex(List<Integer> myList, int number){
        myList.add(0,number);
      }

      public void printListIndexAndElements (List<Integer> myList) {
        for (int i = 0; i<myList.size(); i++){
            System.out.println("Pe pozitia "+i+" este elementul "+ myList.get(i));
        }
      }

      public int getBiggestValueFromList (List<Integer> myList){
        int biggest = myList.get(0);
        for (int i =0; i< myList.size(); i++){
            if(myList.get(i) > biggest){
                biggest =myList.get(i);
            }
        }
        return biggest;
      }

    public void readArrayIndex(int[] array, int number){
        try{
            System.out.println(array[number]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Inside catch, number too large");
        }
    }

    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    }
