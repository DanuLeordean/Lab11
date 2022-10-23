public class LogicalOperations {

    public int getGreaterNumber(int first, int second) {
        if(first > second){
            return first;
        }
        else{
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
        if (textInput.equals("FastTrack")){
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }

    }
    public int checkBiggerNumber(int first, int second) {
        if(first > second) {
            return first;
        } else {
            return second;
        }
    }
    public String exCinci (String textInput, int numberInput){
        if(textInput.equals ("FastTrack") && numberInput <=3) {
            return textInput + numberInput;
        }
        else if (!textInput.equals("FastTrack") && numberInput >=4) {
            return numberInput + textInput;
        }
        else {
            return "no condition was met";
        }

    }
    public String winterSnow (int numberInput) {
        if (numberInput > 8) {
            return "The amount of snow this winter was(cm): " + numberInput;
        }else if (numberInput == 6) {
            return "The amount of snow this winter was(cm): " + numberInput;
        }
        else {
            return "The forecast snow is(cm): " + numberInput;
        }
    }
    public String greaterThanNotEqual ( int numberInput) {
        if(numberInput > 3 && numberInput !=4) {
            return "The number is greater than 3 and not equal to 4";
        }
        else if (numberInput == 4) {
            return "The number is equal to 4";
        }
        return "no condition was met";
    }
    public void switchCase (int numberInput) {
        switch (numberInput) {
            case 1: System.out.println("The number is:  1 !");break;
            case 2: System.out.println("The number is:  2 !");break;
            case 3: System.out.println("The number is:  3 !");break;
            case 4: System.out.println("The number is:  4 !");break;
            case 5: System.out.println("The number is:  5 !");break;
            case 6: System.out.println("The number is:  6 !");break;
            case 7: System.out.println("The number is:  7 !");break;
            case 8: System.out.println("The number is:  8 !");break;
            case 9: System.out.println("The number is:  9 !");break;
            default: System.out.println("The number is not between 1-9 !");
        }
    }

    public void isEvenNumber(int numberInput) {
        if (numberInput % 2 ==0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    public void isEligibleToVote (int numberInput) {
        if (numberInput >= 18) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public  int celMaiMareNumar (int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        }
        else if (second > first && second > third) {
            return second;
        }
        else if ( third > first && third > second) {
            return third;
        }
        return first;
    }

}