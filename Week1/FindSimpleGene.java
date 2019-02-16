
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class FindSimpleGene {
    public String findSimpleGene(String dna, String startCodon, String stopCodon){
        //start codon
        String gene = "";
        if (dna.toUpperCase() == dna){
            dna = dna.toUpperCase();
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toUpperCase();
        } else if (dna.toLowerCase() == dna){
            dna = dna.toLowerCase();
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        }
        int startIndex = dna.indexOf(startCodon);
        if (startIndex == -1){
            return "";
        }
        int stopIndex = dna.indexOf(stopCodon, startIndex + 3);
        if (stopIndex == -1){
            return "";
        }
        
        if ((startIndex - stopIndex) % 3 == 0) {
            gene = dna.substring(startIndex, stopIndex + 3);
        }
        else {
            System.out.println("Invalid Gene");
        }
        return gene;
    }
    
     public void testSimpleGene(){
        //no ATG
         String dna = "TCGTAA";
        System.out.println("DNA Strand is "+dna);
        System.out.println("Gene is "+ findSimpleGene(dna,"ATG","TAA"));
        //no TAA
        dna = "TCGATGCAA";
        System.out.println("DNA Strand is "+dna);
        System.out.println("Gene is "+ findSimpleGene(dna,"ATG","TAA"));
        //no ATG AND TAA 
        dna = "TCGACTGCAA";
        System.out.println("DNA Strand is "+dna);
        System.out.println("Gene is "+ findSimpleGene(dna,"ATG","TAA"));
        //WITH ATG AND TGA AND MULTIPLE OF 3
        //dna = "TCGATGCAATGATAA";
        dna = "tccatgcaatgataa";
        System.out.println("DNA Strand is "+dna);
        System.out.println("Gene is "+ findSimpleGene(dna,"ATG","TAA"));
        //WITH ATG AND TGA AND NOT A MULTPLE OF 3
        dna = "TCGATGCAATATAA";
        System.out.println("DNA Strand is "+dna);
        System.out.println("Gene is "+ findSimpleGene(dna,"ATG","TAA"));
        }
        
}
