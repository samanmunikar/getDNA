
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TwoOccurence {
    public boolean twoOccurences(String stringa, String stringb){
        int stringaIndex = stringb.indexOf(stringa);
        int secondOcc = 0;
        secondOcc = stringb.indexOf(stringa,stringaIndex+stringa.length());
        if (secondOcc == 0){
            return false;
        } else if (secondOcc > 0){
            return true;
        }
        return false;
    }
    
    public String lastPart(String stringa, String stringb){
        String result ="";
        int stringaIndex = stringb.indexOf(stringa);
        if (stringaIndex == -1){
            result = stringb;
        } else {
        result = stringb.substring(stringaIndex, stringaIndex + stringa.length() + 1);
          }
        return result;
    }
    
    public void testing(){
     String stringa = "a";
     String stringb = "banana";
     System.out.println("Stringa " + stringa );
     System.out.println("Stringb " + stringb );
     System.out.println("twoOccurences" + twoOccurences(stringa, stringb));
     System.out.println("lastPart " + lastPart(stringa,stringb));
     stringa = "atg";
     stringb = "ctgatgttgtaaa";
     System.out.println("Stringa " + stringa );
     System.out.println("Stringb " + stringb );
     System.out.println("twoOccurences" + twoOccurences(stringa, stringb));
     stringa = "zoo";
     stringb = "forest";
     System.out.println("lastPart " + lastPart(stringa,stringb));
    }
}
