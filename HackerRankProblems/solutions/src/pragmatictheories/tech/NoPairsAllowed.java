//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package pragmatictheories.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoPairsAllowed {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("keyhbmeknckfavrpqyyfjxjjmivtsftikovkcdcwefctqrqjryhtlcvstm");
        System.out.println(minimalOperations(words).toString());
    }

    static List<Integer> minimalOperations(List<String> words) {
        List<Integer> result = new ArrayList();

        for(int i = 0; i < words.size(); ++i) {
            int nbOfOps = 0;

            for(int j = 1; j < ((String)words.get(i)).length(); ++j) {
                if (((String)words.get(i)).charAt(j) == ((String)words.get(i)).charAt(j - 1)) {
                    ++nbOfOps;
                }
            }

            result.add(nbOfOps);
        }

        return result;
    }
}
