package org.LyQing.sort.insert;


import java.util.Arrays;

/**
 * 插入排序
 *
 * @author yjxx_2022
 * @date 2023/05/18
 */
public class insertion_sort {

    /**
     * 升序插入排序
     *
     * @param A 一个数组
     * @return {@link int[]}
     */
    static int[] insertionSortAscending(int[] A) {

        // j 用于遍历无序区
        for (int j = 1; j < A.length; j++) {

            // key 为要插入有序区中的元素
            int key = A[j];
            // i 为有序区的末端
            int i = j - 1;

            // A[i] > key  表示的形成升序数组
            // while 遍历有序区
            while ( i >= 0  && A[i] > key) {
                A[i+1] = A[i];
                i--;
            }
            // 停止的时候A[i] <= key 所以 key 放在 i 后一位
            A[i + 1] = key;
        }

        return A;

    }

    /**
     * 降序插入排序
     *
     * @param A 一个数组
     * @return {@link int[]}
     */
    static int[] insertionSortDescending(int[] A) {

        // j 用于遍历无序区
        for (int j = 1; j < A.length; j++) {

            // key 为要插入有序区中的元素
            int key = A[j];
            // i 为有序区的末端
            int i = j - 1;

            // A[i] < key  表示的形成降序数组
            // while 遍历有序区
            while ( i >= 0  && A[i] < key) {
                A[i+1] = A[i];
                i--;
            }
            // 停止的时候A[i] <= key 所以 key 放在 i 后一位
            A[i + 1] = key;
        }

        return A;

    }

    static int[] A = {3, 1, 4, 5, 6, 2};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSortAscending(A)));
        System.out.println(Arrays.toString(insertionSortDescending(A)));
    }

}
