package leetcode;

/**
 * Created by chengpiyan on 2021/2/13 3:42 PM
 *
 * @DESCRIPTION 给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）
 * 示例 1：
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 * 输入：x = 120
 * 输出：21
 * 示例 4：
 * 输入：x = 0
 * 输出：0
 *
 *
 * @NOTICE 求模运算结果的符号和b一致(%)，求余运算结果的符号和a一致(Math.floorMode(x,y))
 *
 * 左移（10<<3后面补3个0）：1010<<3 = 1010000 = 16+64=80
 * 右移：(10>>3干掉后面3位)：1010>>3 = 1
 */
public class leetcode03 {

    public static void main(String args[]){
      int x = -235;
      int result = revert(x);
      System.out.println(result);
    }

    public static int revert(int x){
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;//-5     -53    -532
            x = x/10;       //-23.5  -2.35  -0.235
        }
        return (int)n==n? (int)n:0;
    }
}
