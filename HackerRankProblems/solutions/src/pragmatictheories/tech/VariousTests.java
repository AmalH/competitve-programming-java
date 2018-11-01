package pragmatictheories.tech;

public class VariousTests {

    public static void main(String[] args){
        System.out.println(hasAllUniqueChars("abcdefghijk"));
        System.out.println(hasAllUniqueChars("abcdefghijklmnoPsawo"));
    }



    /**
     * if a string has all unique characters
     * bad implementation, this is a O(n2) time solution
     */
    private static boolean hasAllUniqueChars(String s){

        for(int i=1;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }
    /** an O(n) solution could be **/
    public boolean isUniqueChars2(String str){
        if(str.length()>256) return false;
        boolean[] char_set = new boolean[256];
        for(int i=0;i<str.length();i++){
            int val = str.charAt(i);
            if(char_set[val])
                return false;
            char_set[val]=true;
        }
        return true;
    }

    /**
     * replace all spaces in a string with '%20'
     */

}
