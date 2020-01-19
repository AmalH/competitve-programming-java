package ArraysAndStrings;

public class StringCompression {

    /**
     * implement a method to perform basic string compression using the counts of repeated characters
     * if the compressed string would not become smaller than the original stringm your method should return the original string
     * */

    private static  String compress(String str){

        /** check if compression would create a longer string */
        int size = countCompression(str);
        if(size>= str.length()){
            return str;
        }

        StringBuffer mystr = new StringBuffer();
        char last = str.charAt(0);
        int count = 1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==last){
                count++;
            }else{
                mystr.append(last);
                mystr.append(count);
                last = str.charAt(i);
                count = 1;
            }
        }
        mystr.append(last);
        mystr.append(count);
        return  mystr.toString();
    }

    private static int countCompression(String str){
        char last = str.charAt(0);
        int size = 0;
        int count = 1;
        for(int i=1;i<str.length();i++){
            if (str.charAt(i)==last)
                count++;
            else {
                last= str.charAt(i);
                size+= 1+String.valueOf(count).length();
                count=1;
            }
        }
        return size;
    }
}
