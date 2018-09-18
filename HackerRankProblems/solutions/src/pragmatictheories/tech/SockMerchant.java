package pragmatictheories.tech;

import java.util.ArrayList;

public class SockMerchant {

    // Complete the sockMerchant function below.
    public static int sockMerchant(int n, int[] ar) {

        ArrayList<Integer> checked = new ArrayList<Integer>();
        int nbOfPairs=0;

        for(int i=0;i<n;i++){
            int sameItem =1;
            if(!checked.contains(ar[i])){
                for(int j=i+1;j<n;j++)
                    if(ar[i]==ar[j]){
                        sameItem++;
                        checked.add(ar[i]);
                    }
            }
            nbOfPairs+=sameItem/2;
        }

        return nbOfPairs;

    }


}
