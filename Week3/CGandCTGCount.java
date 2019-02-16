import java.util.*;
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CGandCTGCount {
     
    public double cgRatio(String dna){
        int len = dna.length();
        double cgratio;
        Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(len, 26));
 
        for (int i = 0; i < len; ++i)
        {
            char charAt = dna.charAt(i);
 
            if (!numChars.containsKey(charAt))
            {
                numChars.put(charAt, 1);
            }
            else
            {
                numChars.put(charAt, numChars.get(charAt) + 1);
            }
        }
 
        cgratio = (numChars.get('C')+numChars.get('G'))/len;
        return cgratio;
    }
    
    public int ctgCount(String dna){
        int startIndex = 0;
        int count = 0;
        while ( true ){
            int currIndex = dna.indexOf("CTG",startIndex);
            if (currIndex == -1){
                break;
            }
            count += 1;
            startIndex = currIndex + 3;
        }
        return count;
    }
}