package search;

/**
 * Created by admin on 2017/9/19.
 */
public class SearchTest {
    public static void main(String[] args){

        int len = 10;
        int[] a = new int[len];

        //Scanner sc = new Scanner(System.in);
        a[0] = 1878;
        a[1] = 31;
        a[2] = 100;
        a[3] = 79;
        a[4] = 15;
        a[5] = 39080;
        a[6] = 20;
        a[7] = 965;
        a[8] = 34;
        a[9] = 126;
        for(int i =0;i<len;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int index = SearchUtils.binarySearch(a,15);
            System.out.print("下标为："+index);
    }
}
