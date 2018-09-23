//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package pragmatictheories.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TorquetAndProduct {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        long j=n;

        String possibleValues = "1";
        for(long i=0;i<n;i++){
            if(n%2==0){
                possibleValues+=" "+String.valueOf(n/2);
                n=n/2;
            }
        }
        possibleValues+=" "+String.valueOf(j);
        System.out.println(possibleValues);
    }
}
