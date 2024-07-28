
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class IntSort implements Comparator<double[]>
{

    IntSort()
    {

    }
    // @Override
    public int compare(double[] obj1, double[] obj2) {
        if(obj1[2] < obj2[2]) return  -1;

        if(obj1[2] > obj2[2]) return  1;

        return  0;
    }

    @Override
    public String toString() {
        return "IntSort []";
    }
}


class Triplets implements Comparator<Triplets>{
    int w , p;
    double w_p;

    Triplets()
    {

    }

    Triplets(int w,int p,double w_p)
    {
        this.w = w;
        this.p = p;
        this.w_p = w_p;
    }

    @Override
    public  String toString()
    {
        return "Element [Weight:"+w+" ,Price:"+p+" ,Weight_Per_price:"+w_p+"]";
    }

    @Override
    public int compare(Triplets obj1, Triplets obj2) {
        if(obj1.w_p < obj2.w_p) return -1;

        if(obj1.w_p > obj2.w_p) return 1;

        return  0;
    }
}


public class KnapSack_0_1 {
    public static void main(String[] args) {
        int[] weights = {10,5,8,5,7};
        int[] prices = {3,4,3,2,7};

        ArrayList<Triplets> arr = new ArrayList<>();
        double[][] dp = new double[weights.length][3];

        for(int i=0;i<weights.length;i++)
        {
            double d = (double)weights[i] / prices[i];
            arr.add(new Triplets(weights[i], prices[i], d));

            dp[i][0] = weights[i];
            dp[i][1] = prices[i];
            dp[i][2] = d;
        }

        for(Triplets t :arr)
        {
            System.out.println(t);
        }

        System.out.println(".................................");

        for(int i=0;i<dp.length;i++)
        {
            System.out.println(dp[i][0]+" "+dp[i][1]+" "+dp[i][2]);
        }

        System.out.println("After Sorting..........................................");

        Collections.sort(arr,new Triplets());

        for(Triplets t :arr)
        {
            System.out.println(t);
        }

       Arrays.sort(dp, new IntSort());

       System.out.println(".................................");

       for(int i=0;i<dp.length;i++)
       {
           System.out.println(dp[i][0]+" "+dp[i][1]+" "+dp[i][2]);
       }
        
    }
}
