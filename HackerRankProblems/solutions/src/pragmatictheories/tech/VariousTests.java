package pragmatictheories.tech;

public class VariousTests {

    public static void main(String[] args){
        System.out.println(hasAllUniqueChars("abcdefghijk"));
        System.out.println(hasAllUniqueChars("abcdefghijklmnoPsawo"));
    }



    /**
     * if a string has all unique characters
     * bad implementation, this is a 2*/
    private static boolean hasAllUniqueChars(String s){

        boolean res=true;

        outerloop:
        for(int i=1;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    res = false;
                    break outerloop;
                }
            }
        }

        return res;
    }

}
