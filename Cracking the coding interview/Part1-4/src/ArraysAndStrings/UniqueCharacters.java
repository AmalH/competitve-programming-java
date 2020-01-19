package ArraysAndStrings;

public class UniqueCharacters {

    /**
     * Implement an algorithm to determine if a string has all unique characters.
     * */


    /**
     * ask your interviewer if the string is an ASCII or a Unicode string to increase/decrease the storage size
     * */


    /**
     * automatically return false if the length of the string is greater than the number of unique characters 256
     * */

    /**
     * create an array of boolean values, where the flag at index i indicates wether character i in the alphabet is contained in the string.
     * if you run accros the character a second time, you can immediately return false
     * */

    public static boolean isUniqueChars(String str){
        if (str.length()>256) return false;
        boolean [] char_set = new boolean[256];
        for(int i=0;i<str.length();i++){
            int val = str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val]=true;
        }
        return  true;
    }


    public static void main(String[] args){
        System.out.println("isUniqueChars('admal'): "+isUniqueChars("amal"));
    }

    /** alternatively
     * we can compare every character of the string to every other character --> O(n2)
     * we can sort the string O(n log(n)) and then linearly check the string for neighboring characters that are identical.
     * */
}
