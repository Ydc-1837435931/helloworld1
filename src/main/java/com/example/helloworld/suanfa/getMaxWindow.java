package com.example.helloworld.suanfa;
/**
* @author YinDC
* */
import java.util.LinkedList;
import java.util.Random;

//题：滑动窗口的最大值：给定数组，以及窗口的大小，求每个窗口的最大值
public class getMaxWindow {
    public int[] GetMaxWindow(int[] arr,int w) {
        if (arr == null || w < 1 || arr.length < w){
            return null;
        }
        /**使用双向链表LinkList,记录当前窗口的最大值，并从大到小排列*/
        LinkedList<Integer> qmax = new LinkedList<Integer>();
        int[] res = new int[arr.length-w+1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
        /**arr[i]依次与qmax队尾值比较，如果大于就队尾值弹出队尾值，小于就将下标加入队尾
        arr[i]对qmax进行踢馆，大就提走，直到踢到比自己更大的或者老大的位置，小的认怂跟在后面*/
            while (!qmax.isEmpty()&&arr[qmax.peekLast()] <= arr[i]){
                qmax.pollLast();
            }
            qmax.addLast(i);
        /**qmax的老大得时时更新，即使没人比他强，但是规矩就是不允许连任w届，一旦超过w,就由老二担任*/
            if(qmax.peekFirst() == i-w){
                qmax.pollFirst();
            }
            if (i >= w-1){
                res[index++] = arr[qmax.peekFirst()];
            }
        }
        return res;
    }
    //Test
    public static void main(String[] args) {
        int[] app1 = new int[]{8,3,4,6,1,3,8,6,19,2,6,7};
        //正确的结果：{8，6，6，6,8,8,19,19,19,7}
        getMaxWindow getMaxWindow = new getMaxWindow();
        int[] res = getMaxWindow.GetMaxWindow(app1,3);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        System.out.println("====================================");
        System.out.println("随机数据生出的滑动窗口问题");
        int[] app2 = new int[9];
        for (int i = 0; i < app2.length; i++) {
            Random random =new Random();
            app2[i] = random.nextInt(100);
        }
        for (int i = 0; i < app2.length; i++) {
            System.out.println(app2[i]);
        }
        System.out.println("生成的最大值数列为：");
        int[] res2 = getMaxWindow.GetMaxWindow(app2,4);
        for (int i = 0; i < res2.length; i++) {
            System.out.println(res2[i]);
        }

    }
}
