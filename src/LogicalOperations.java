public class LogicalOperations {

        public int getGreaterNumber(int first, int second){
            if(first > second){
                return first;
            }
            else{
                return second;
            }
        }

        public String textAndNumberComp(String textInput, int numberInput){
            if(textInput.equals("FastTrack") && numberInput <= 3){
                return textInput + numberInput;
            }
            else if (!textInput.equals("FastTrack") && numberInput >= 4){
                return numberInput + textInput;
            }
            return "No condition was met";
        }

        //Given a text input, if it is “FastTrack”,
        // then print “Learning text comparison”. If not, print “Got to try some more”

        public String textComparison(String textInput){
            if(textInput.equals("FastTrack")){
                return "Learning text comparison";
            }else {
                return "Got to try some more";
            }
        }
    }
