package pragmatictheories.tech;

import java.util.HashMap;
import java.util.List;
import java.util.HashMap;

public class PDFviewer {

    // Complete the designerPdfViewer function below.H
    static int designerPdfViewer(int[] h, String word) {

        int height=1;

        String[] alphabets=new  String[]{"a", "b", "c","d","e", "f", "g","h","i", "j", "k","l","m", "n",   "o","p","q", "r", "s","t","u", "v", "w","x","y", "z"};

        HashMap<String,Integer> heights = new HashMap();

        for (int i=0;i<h.length;i++)
            heights.put(alphabets[i],h[i]);

        for(int i=0;i<word.length();i++)
            if(heights.get(Character.toString(word.charAt(i)))>height)
                height=heights.get(Character.toString(word.charAt(i)));

        return height*word.length();
    }


}
