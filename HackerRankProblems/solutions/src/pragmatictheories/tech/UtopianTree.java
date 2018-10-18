package pragmatictheories.tech;

public class UtopianTree {



    // Complete the utopianTree function below.
    static int utopianTree(int n) {

        int h=1;

        for(int i=0;i<n;i++){
            if(i%2!=0)
                h=h*2;
            else h=h+1;
            System.out.println(h);
        }

        return h;

    }

}
