package com.example.helloworld.suanfa;
/**
 * 两个有序数组合并成一个有序数组的实现类
 *
 */
public class ArrayMerge {

    /**
     * 数组合并方法
     * @param arrayM
     * @param arrayN
     * @return
     */
    public static int[] mergeArray(int arrayM[],int arrayN[]){
        int newArray[];
        // 定义一个新数组，长度为两个有序数组长度之和
        newArray = new int[arrayM.length + arrayN.length];
        // start:arrayM数组下标    end：arrayN数组下标  k：newArray新数组下标
        int start=0,end=0,k=0;
        // 循环比较两个数组，较小元素的放入新数组，较小元素所在数组下标加一，较大元素对应的数组下标不加一，直到某一个下标等于数组长度时退出循环
        while(start<arrayM.length && end<arrayN.length) {
            if(arrayM[start] <= arrayN[end]) {
                newArray[k++] = arrayM[start++];
            }else{
                newArray[k++] = arrayN[end++];
            }
        }

        /* 后面两个while循环是用来保证两个数组比较完之后剩下的一个数组里的元素能顺利都放入新数组
         * 此时较短数组已经全部放入新数组，较长数组还有部分剩余，最后将剩下的部分元素放入新数组，因为数组是有序，所以直接把剩下的顺序加入即可*/
        while(start < arrayM.length) {
            newArray[k++] = arrayM[start++];
        }
        while(end < arrayN.length) {
            newArray[k++] = arrayN[end++];
        }
        return newArray;
    }

    /**
     * 数组打印方法
     * @param arr
     */
    public static void print(int[] arr) {
        for(int i=0; i<arr.length;i++) {
            if (i < arr.length -1) {
                System.out.print(arr[i]+"，");
            } else {
                System.out.print(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arrayM = {1,3,5,7,8,9,14,16,21};
        int[] arrayN = {0,10,20,30,40,50};
        print(mergeArray(arrayM,arrayN));
    }
}

