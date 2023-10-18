/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quick_sort;

/**
 *
 * @author remon
 */
public class QuickSort {
    public void startQuickSort() {
        System.out.println("\nQuick Sort");
        int[] list = { 3, 5, 7, 4, 6, 1, 8, 9, 2 };
        quickSort(list, 0, list.length - 1);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }

    void quickSort(int[] a, int beg, int end) {
        int loc;
        if (beg < end) {
            loc = partition(a, beg, end);
            quickSort(a, beg, loc - 1);
            quickSort(a, loc + 1, end);
        }
    }

    int partition(int[] a, int l, int r) {
        int pivot = l;
        int tooBig = l;
        int tooSmall = r;
        while (tooSmall > tooBig) {
            while (a[tooBig] < a[pivot]) {
                tooBig++;
            }
            while (a[tooSmall] > a[pivot]) {
                tooSmall--;
            }
            if (tooBig < tooSmall) {
                int temp = a[tooBig];
                a[tooBig] = a[tooSmall];
                a[tooSmall] = temp;
            }
        }
        int temp = a[tooSmall];
        a[tooSmall] = a[pivot];
        a[pivot] = temp;

        pivot = tooSmall;
        return pivot;
    }

}
