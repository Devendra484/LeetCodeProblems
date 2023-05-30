import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int nums[]={2,3,4,8,9,13,14,16};
        int target=17;
        int f=0,l=nums.length-1;
        while(f<=l){
            int m=(f+l)/2;
            if(nums[m]<target) f=m+1;
            else if(nums[m]>target) l=m-1;
            else {
                System.out.println(m);
                break;
            }
        }
        System.out.println(f);
    }
}



