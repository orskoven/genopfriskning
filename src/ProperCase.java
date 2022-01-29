import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class ProperCase {

    static void modifySentenceEngine(String sentence){
        String modifiedSentence = "";
        String[] sentenceArray = sentence.split(" ");
        for (int i = 0; i < sentenceArray.length; i++) {
            for (int j = 0; j < sentenceArray[i].length(); j++) {
                if ( Character.isLowerCase(sentenceArray[i].charAt(j))
             && sentenceArray[i].length() > 3) {
                    sentenceArray[i] = sentenceArray[i].replace(sentenceArray[i].charAt(0),Character.toUpperCase(sentenceArray[i].charAt(0)));
                } else if(Character.isLowerCase(sentenceArray[i].charAt(j))
                        && sentenceArray[i].length() < 4) {
                    sentenceArray[i] = sentenceArray[i].toLowerCase(Locale.ROOT);
                }
            }
            modifiedSentence+=sentenceArray[i] + " ";
        }
        System.out.println(modifiedSentence);

    }

    public static void main(String[] args) {
        modifySentenceEngine("Skriv en metode, der som kan noget meget mærkeligt");
    }
}
