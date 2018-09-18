package pragmatictheories.tech;

import java.util.List;

public class BonAppetit {

    // Complete the bonAppetit function below.
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum=0;
        for(int i=0;i<bill.size();i++)
            sum+=bill.get(i);
        if(b==(sum-bill.get(k))/2) System.out.println("Bon Appetit");
        else System.out.println((sum/2)-(sum-bill.get(k))/2);
    }

}
