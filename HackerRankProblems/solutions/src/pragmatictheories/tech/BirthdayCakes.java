package pragmatictheories.tech;

public class BirthdayCakes {


    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int i = 0, res=0;
        for(int k =0;k<ar.length;k++){
            if(ar[k]>i){
                i=ar[k];
                res=1;
            }
            else if(ar[k]==i)
                res++;
        }
        return res;

    }

}
