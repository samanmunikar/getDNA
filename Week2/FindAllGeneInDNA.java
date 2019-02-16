
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindAllGeneInDNA {
    public int findStopCodon(String dna, int startIndex,String stopCodon){
        int currIndex = dna.indexOf(stopCodon,startIndex+3);
        while (startIndex  != -1){
            if ( (currIndex- startIndex)%3==0) {
                return currIndex;
            }
            else{
                currIndex = dna.indexOf(stopCodon,currIndex + 1);
            }
        }
        //return dna.length();
        return -1;
    }
    
    public String findGene(String dna, int where){
        int startIndex = dna.indexOf("ATG",where);
        if (startIndex == -1){
            return "";
        }
        
        int taaIndex = findStopCodon(dna,startIndex,"TAA");
        int tagIndex = findStopCodon(dna,startIndex,"TAG");
        int tgaIndex = findStopCodon(dna,startIndex,"TGA");
        
        int minIndex = 0;
        if (taaIndex == -1 ||
                (tgaIndex != -1 && tgaIndex < taaIndex)){
                    minIndex = tgaIndex;
                } else {
                    minIndex = taaIndex;
                }
          
        if (minIndex == -1 ||
                (tagIndex != -1 && tagIndex < minIndex)){
                    minIndex = tagIndex;
        }
                
        if (minIndex == -1){
            return "";
        } 
        return dna.substring(startIndex, minIndex+3);
    }
    
    public void testFindGene(){
        String result = findGene("ATGCTGAATTAATAGGTATGA",0);
        if (result.isEmpty()){
            System.out.println("");
        } else {
            System.out.println(result);
        }
    }
    
    public void printAllGenes(String dna){
        int startIndex = 0;
        while ( true ){
            String gene = findGene(dna,startIndex);
            if (gene.isEmpty()){
                break;
            }
            System.out.println(gene);
            int currIndex = dna.indexOf(gene,startIndex) +
                                gene.length();
        }
    }

    public int countGene(String dna){
        int startIndex = 0;
        int count = 0;
        while ( true ){
            String gene = findGene(dna,startIndex);
            if (gene.isEmpty()){
                break;
            }
            count += 1;
            int currIndex = dna.indexOf(gene,startIndex) +
                                gene.length();
        } 
        return count;
    }
    
    public void testCountGene(){
        System.out.println("Count " + Integer.toString(countGene("ATGTAAGATGCCCTAGT")));
    }
}
