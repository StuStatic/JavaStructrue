package leetcode;

import java.util.HashMap;

import static jdk.nashorn.internal.objects.Global.println;

/**
 * created by stu on 2021/2/12
 * 已知两数只和，返回数组中两个元素的下标
 *
 * @method1 暴力法：定义两个指针分别遍历数组
 * @method2 以此循环法：定义hashmap方法，外层循环遍历数组，内层循坏遍历hashmap，若发现数组中的值与map中的值和为9即返回下角标
 */
public class leetcode01 {

    public static void main(String args[]) {
        int[] nums = {2, 11, 6, 7, 15};
        int sum = 9;
        int[] indexs = twoSum(nums, sum);
        print(indexs);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(nums[i])){
                indexs[0] = i;
                indexs[1] = hashMap.get(nums[i]);
                return indexs;
            }
            hashMap.put(target-nums[i],i);
        }
        return indexs;
    }

    public static void print(int[] indexs){
        for(int i=0;i<indexs.length;i++){
            System.out.println(indexs[i]);
        }
    }
}
