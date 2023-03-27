package chap06;
// 셸정렬(버전 2 : h = …, 40, 13, 4, 1)

class ShellSort2 {
    //--- 셸 정렬 ---//
    static void shellSort(int[] a, int n) {
        int h;
        for (h = 1; h < n; h = h * 3 + 1)
            ; //시작 h 값을 찾는 코드 

        for ( ; h > 0; h /= 3)
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h)
                    a[j + h] = a[j];
                a[j + h] = tmp;
            }
    }

    public static void main(String[] args) {
        int[] x = {8, 1, 4, 2, 7, 6, 3, 5}; 
        int nx = x.length;
        shellSort(x,nx);            // 배열 x를 셸정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
}
