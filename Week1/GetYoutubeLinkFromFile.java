import edu.duke.*;
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GetYoutubeLinkFromFile {
    public void check(){ 
    URLResource ur = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
     for (String word : ur.words()){
         if (word.contains("youtube.com")){
                int startIndex = word.indexOf("\"");
                int stopIndex = word.lastIndexOf("\"");
                String result = word.substring(startIndex+1, stopIndex);
                System.out.println(result);
            }
        
    }
}
}
