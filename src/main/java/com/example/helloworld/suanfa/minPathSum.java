package com.example.helloworld.suanfa;

/**
 * 给定一个矩阵 m，从左上角开始每次只能向右或者向下走，最后到达右下角的位置，路径上所有的数字累加起来就是路径和，返回所有的路径中最小的路径和。
 * */
public class minPathSum {
    public int minPathsum1(int[][] m){
        if (m == null || m.length == 0|| m[0] == null || m[0].length ==0){
            return 0;
        }
        int row = m.length;
        int col = m[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = m[0][0];
        for (int i = 1; i < row; i++) {
            dp[i][0] = dp[i-1][0] + m[i][0];
        }
        for(int j =1;j < col; j++){
            dp[0][j] = dp[0][j-1] + m[0][j];
        }
        /**每一个dp元素都会被判断，不会存在遗漏的过程，理解dp[i][j]的含义*/
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) +m[i][j];
                System.out.println(dp[i][j]);
            }
        }
        return dp[row-1][col-1];
    }

    public static void main(String[] args) {
        int[][] m =new int[][]{{4,3,1},{2,5,4},{6,3,6}};
        minPathSum minPathSum = new minPathSum();
        int n = minPathSum.minPathsum1(m);
        System.out.println(n);
        /**结果是18，并没有走42536，因为最后还是dp[i-1][j]和dp[i][j-1]去比较，所以4253被舍弃了*/
    }
}
