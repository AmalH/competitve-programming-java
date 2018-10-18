package pragmatictheories.tech;

public class AbsolutePermutation {

    // Complete the absolutePermutation function below.
    static int[] absolutePermutation(int n, int k) {

        int permutationsCount=0;
        int[] res= new int[n];
        int[] initialValues = new int[n];

        for (int i=1;i<=n;i++)
            initialValues[i-1]=i;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                if(Math.abs(initialValues[j-1]-i)==k){
                    res[i-1]=initialValues[j-1];
                    permutationsCount++;
                    break;
                }
        }

        if(permutationsCount==n)
            return res;
        return new int[]{-1};

    }

}
