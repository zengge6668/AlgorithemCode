/**
 * Created by admin on 2017/9/19.
 */
public class SearchUtils {
    /**
     * 二分法查找
     */
    public static int binarySearch(int a[],int target){
        return binarySearch(a,0,a.length-1,target);
    }
    //递归（也可以换成迭代）
    public static int binarySearch(int a[],int left,int right,int target){
        if(left > right) return -1;
        int mid = (left + right)/2;
        if(a[mid] > target) return binarySearch(a,left,mid-1,target);
        else if(a[mid] < target) return  binarySearch(a, mid+1,right,target);
        else return mid;
    }
    //迭代版本
    public static int binarySearch2(int a[],int left,int right,int target){
        int mid  = 0;
        while(left <= right){
            mid =  (left + right)/2;
            if(a[mid] > target) return binarySearch2(a,left,mid-1,target);
            else if(a[mid] < target) return  binarySearch2(a, mid+1,right,target);
            else return mid;
        }
        return -1;
    }
}
