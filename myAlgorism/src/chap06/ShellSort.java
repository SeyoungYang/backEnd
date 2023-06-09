package chap06;

import java.util.Arrays;

// 셸 정렬(버전 1)

class ShellSort {
    //--- 셸 정렬 ---//
    static void shellSort(int[] a, int n) {
        for (int h = n / 2; h > 0; h /= 2)
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h)
                    a[j + h] = a[j];
                a[j + h] = tmp;
            }
    }

    public static void main(String[] args) {
        int[] x = { 8,1,4,2,7,6,3,5,};
        int nx = x.length;
        System.out.println(Arrays.toString(x));
        
        shellSort(x, nx);            // 배열 x를 셸정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
}
