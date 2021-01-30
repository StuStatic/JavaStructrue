package class1;

/**
 * SparseArray相关内容
 */
public class SparseArray_01 {

    public static void main(String[] args) {
//        method1();
        method2();
    }

    /**
     * SparseArray相关内容
     * 创建一个二维数组11*11
     * 0：表示没有棋子，1表示黑子，2表示白子
     */
    public static void method1() {
        int chessArray[][] = new int[11][11];
        chessArray[1][2] = 1;
        chessArray[2][3] = 2;
        //输出遍历二维数组
        for (int[] row : chessArray) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        System.out.println();
        //另一种遍历方式：
        for (int i = 0; i < chessArray.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t\n", chessArray[i][0],
                    chessArray[i][1], chessArray[i][2], chessArray[i][3], chessArray[i][4], chessArray[i][5],
                    chessArray[i][6], chessArray[i][7], chessArray[i][8], chessArray[i][9], chessArray[i][10]);

        }

        //将二维数组转化为稀疏数组
        //1先遍历二维数组得到非0的元素个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArray[i][j] != 0) {
                    sum++;
                }
            }
        }
        //2创建对应的稀疏数组
        int sparseArray[][] = new int[sum + 1][3];
        //给稀疏数组赋值
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;
        //遍历二维数组，将非零的值赋值到sparseArray
        int count = 0;//用于记录所在的行
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArray[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArray[i][j];
                }
            }
        }

        //输出稀疏数组的形式
        System.out.println();
        System.out.println("输出稀疏数组为：");
        for (int i = 0; i < sparseArray.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArray[i][0], sparseArray[i][1], sparseArray[i][2]);
        }
        System.out.println();

        //将稀疏数组恢复成原始的二维数组
        //1先读取稀疏数组的第一行，完成二维数组的创建
        //2将稀疏数组的后面几行并赋值给二维数组
        int chessArray2[][] = new int[sparseArray[0][0]][sparseArray[0][1]];
        //从稀疏数组的第二行开始遍历
        for (int i = 1; i < sparseArray.length; i++) {
            chessArray2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        System.out.println();
        System.out.println("输出恢复后二维数组为：");
        for (int[] row : chessArray2) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }

    /**
     * 另：创建数组的三种方式：
     * 1.方式一  声明 分配空间并赋值 int[] arr1 = {1,2,3};
     * 2.方式二 显示初始化 int[] arr2; arr2 = new int[]{1,2,3};
     * 3.方式三 显示初始化 int[] arr3; arr3 = new int[3];
     */
    private static void method2() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[3];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1元素为：" + arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2元素为：" + arr2[i]);
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("arr3元素为：" + arr3[i]);
            System.out.println("arr3长度为：" + arr3.length);
        }
    }
}
