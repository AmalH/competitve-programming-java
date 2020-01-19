package ArraysAndStrings;

public class ReplaceSpaces {

    /**
     * Write a method to replace all spaces in a string with '%20' .
     * You may assume that the string has sufficient space at the end of the string to hold the additional characters,
     * and that you are given the 'true' length of the string
     * */


    /**
     * a commun approach to string manipulation problems is to edit the string starting from the end and work backwards.
     * This is useful because we have extra buffer at the end, which allows us to change characters without worriying about what we`re overwrting
     */


    /**
     * the algorithm works on two scans . we count how many spaces there are in the string. This is used to compute how long the string should be
     * in the second pass which is done in reverse order, we actually edit the string.
     */

    public static void replaceSpaces(char[] str, int length) {
        int spaceCount = 0, newLength,i=0;
        for(i=0;i<length;i++){
            if(str[i]==' '){
                spaceCount++;
            }
        }
        newLength = length+spaceCount*2;
        str[newLength]= '\0';
        for(i=length-1;i>=0;i--){
            if(str[i]== ' ' )
            {
                str[newLength-1]='0';
                str[newLength-2]='2';
                str[newLength-3]='%';
                newLength = newLength - 3;
            }else{
                str[newLength-1]=str[i];
                newLength = newLength -1;
            }
        }
    }

    public static void main(String[] args){
        String str = "ad mal ";
        replaceSpaces(str.toCharArray(),7);
        System.out.println("replaceSpaces('ad mal ',7): "+str);
    }

    /**
     * this solution was implemented with character arrays, since Java strings are immutable.
     * If we used strings directly this would require returning a new copy of the string but we would implement this
     * in just one pass
     * */

}
