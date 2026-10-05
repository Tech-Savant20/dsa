
import java.util.*;

public class maxsubarraysumprefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,5,6,7,8};
        sc.close();
        subarr(arr);
    }
    public static void subarr(int arr[]){
        int prefixarr[] = new int[arr.length];
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            prefixarr[i] = sum;
        }

        int summax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sumcurr = prefixarr[j] - (i == 0 ? 0 : prefixarr[i - 1]);
                summax = Math.max(summax, sumcurr);
            }
        }
        System.out.println(summax);
    }
}
