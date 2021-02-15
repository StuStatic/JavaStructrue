package leetcode;

/**
 * Created by chengpiyan on 2021/2/13 2:37 PM
 *
 * @DESCRIPTION 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * @NOTICE 此题若为非排序数组循环次数要增加
 */
public class leetcode02 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 5, 5, 6};
        int i = delDuplicates(nums);
        System.out.println(i);
    }

    public static int delDuplicates(int[] nums) {
        if (nums == null || nums.length == 1) {
            return nums.length;
        }

        //关键步骤：定义两个下标变量，根据条件进行自增
        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }
}
