package pragmatictheories.tech;

public class PlusMinus {

    // Complete the plusMinus function below.
    public static void plusMinus(int[] arr) {

        int nbOfPOsitives=0,nbOfNegatives=0,nbOfNulls=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                nbOfNulls++;
            if(arr[i]>0)
                nbOfPOsitives++;
            if(arr[i]<0)
                nbOfNegatives++;
        }
        System.out.println(String.format("%.06f", (double)nbOfPOsitives/arr.length)+"\n"
                +String.format("%.06f", (double)nbOfNegatives/arr.length)+"\n"
                +String.format("%.06f", (double)nbOfNulls/arr.length));
    }

}
