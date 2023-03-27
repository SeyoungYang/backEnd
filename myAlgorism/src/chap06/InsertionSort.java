package chap06;
// 단순 삽입 정렬

class InsertionSort {
    //--- 단순 삽입 정렬 ---//
    static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int j;
            int tmp = a[i];
            for (j = i; j > 0 && a[j - 1] > tmp; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] x = {6,4,1,7,3,9,8};
        int nx = x.length;
        
        insertionSort(x, nx);        // 배열 x를 단순삽입정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
}
