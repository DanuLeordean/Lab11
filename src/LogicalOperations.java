public class LogicalOperations {

    public int getGreaterNumber(int first, int second) {


        if(first > second) {
            return first;
        }
        else{
            return second;
        }


        }

    public String aab(String textInput, int numberInput){
        if (textInput.equals("FastTrack") && numberInput <= 3){
            return textInput + numberInput;
        }
        else if (!textInput.equals("FastTrack") && numberInput>= 4) {
            return numberInput + textInput;
        }
        return "No condition was met";
    }
    public String textComparison (String textInput){

        if (textInput.equals("FastTrack")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }
}
