
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowManyStringaInStringb {
    public int howMany(String stringa, String stringb){
        int startIndex = 0;
        int count = 0;
        while ( true ){
            int currIndex = stringb.indexOf(stringa,startIndex);
            if (currIndex == -1){
                break;
            }
            count = count + 1;
            startIndex = currIndex + stringa.length();
        }
        return count;
    }
    
    public void testHowMany(){
        System.out.println("Count " + Integer.toString(howMany("AA","ATAAAA")));
    }
}
