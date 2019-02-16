import java.util.*;
import edu.duke.*;
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProcessGene {
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
    
    public void processGenes (StorageResource sr){
        int count = 0;
        int cgcount = 0;
        int longest_gene = 0;
        String gene = "";
        for (String s: sr.data()){
            if (s.length() > 9){
                count += 1;
                System.out.println("Gene longer the 9"+ s);
            }
            if (cgRatio(s) > 0.35){
               cgcount += 1; 
               System.out.println("Gene with CGRatio > 0.35" + s);
            }
            if (s.length() > longest_gene){
                gene = s;
            }
        }
        System.out.println("Gene with longer the 9" + String.valueOf(count));
        System.out.println("Gene with CGRatio > 0.35" + String.valueOf(cgcount));
        System.out.println("Longest Gene is "+ gene);
    }
    
}
