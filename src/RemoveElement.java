import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums={3,2,2,3,2,3,3};
        int val=3;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
                int t=nums[j];
                nums[j]=nums[i];
                nums[i]=t;
                j++;
            }
        }
        System.out.println(j+"  ,"+ Arrays.toString(nums)); ;
    }
}
