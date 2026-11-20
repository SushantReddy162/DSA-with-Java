package Arrays;
import java.util.Arrays;
public class MoveZeroes {

    public static void moveZeroes(int[] nums){
        int zp =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0 ){
                if(i != zp){
                    int temp = nums[zp];
                    nums[zp] = nums[i];
                    nums[i] = temp;
                }
                zp++;
            }
        }


    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
