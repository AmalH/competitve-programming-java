package pragmatictheories.tech;

public class ArrayRotation {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        int[] res = new int[queries.length];

        for(int i=0;i<k;i++)
            permutation(a);
        for(int i=0;i<queries.length;i++)
            res[i]=a[queries[i]];

        return res;
    }

    private static void permutation(int [] a){
        int lastItem = a[a.length-1];
        for(int i=a.length-1;i>0;i--)
            a[i]=a[i-1];
        a[0]=lastItem;
    }

}
