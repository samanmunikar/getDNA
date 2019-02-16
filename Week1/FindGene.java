
/**
 * Write a description of Part1 here.
 * 
 * @author (saman) 
 * @version ()
 */
/*
  Write the method findSimpleGene that has one String parameter dna, representing a string of DNA. This method does the following:

Finds the index position of the start codon “ATG”. If there is no “ATG”, return the empty string.
Finds the index position of the first stop codon “TAA” appearing after the “ATG” that was found. 
If there is no such “TAA”, return the empty string.
If the length of the substring between the “ATG” and “TAA” is a multiple of 3, 
then return the substring that starts with that “ATG” and ends with that “TAA”.  
 */
public class FindGene {
    public String findSimpleGene(String dna){
        //start codon
        String gene = "";
        int startCodon = dna.indexOf("ATG");
        if (startCodon == -1){
            return "";
        }
        int stopCodon = dna.indexOf("TAA", startCodon + 3);
        if (stopCodon == -1){
            return "";
        }
        
        if ((startCodon - stopCodon) % 3 == 0) {
            gene = dna.substring(startCodon, stopCodon + 3);
        }
        else {
            System.out.println("Invalid Gene");
        }
        return gene;
    }
    /*
     Write the void method testSimpleGene that has no parameters. You should create five DNA strings. 
     The strings should have specific test cases, such as: DNA with no “ATG”, DNA with no “TAA”, DNA with no “ATG” or “TAA”,
     DNA with ATG, TAA and the substring between them is a multiple of 3 (a gene), and DNA with ATG, TAA and the substring between them
     is not a multiple of 3. For each DNA string you should
     Print the DNA string.
See if there is a gene by calling findSimpleGene with this string as the parameter. 
If a gene exists following our algorithm above, then print the gene, otherwise print the empty string.
       */
     public void testSimpleGene(){
        //no ATG
         String dna = "TCGTAA";
        System.out.println("DNA Strand is "+dna);
        System.out.println("Gene is "+ findSimpleGene(dna));
        //no TAA
        dna = "TCGATGCAA";
        System.out.println("DNA Strand is "+dna);
        System.out.println("Gene is "+ findSimpleGene(dna));
        //no ATG AND TAA 
        dna = "TCGACTGCAA";
        System.out.println("DNA Strand is "+dna);
        System.out.println("Gene is "+ findSimpleGene(dna));
        //WITH ATG AND TGA AND MULTIPLE OF 3
        dna = "TCGATGCAATGATAA";
        System.out.println("DNA Strand is "+dna);
        System.out.println("Gene is "+ findSimpleGene(dna));
        //WITH ATG AND TGA AND NOT A MULTPLE OF 3
        dna = "TCGATGCAATATAA";
        System.out.println("DNA Strand is "+dna);
        System.out.println("Gene is "+ findSimpleGene(dna));
        }
        
}
