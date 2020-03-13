import java.util.Arrays;
/**
 * Name ex14.java
 * Description ソート
 */
public class ex14 {
    public static void main(String[] args) {
        int[] nums = {5,8,2,9,4,0,1,7,6,3};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
