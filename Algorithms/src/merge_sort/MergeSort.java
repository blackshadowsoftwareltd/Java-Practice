/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merge_sort;

/**
 *
 * @author remon
 */
public class MergeSort {
    public void startMergeSort() {
        int[] list = { 3, 5, 7, 4, 6, 1, 8, 9, 2 };
        devide(list, 0, list.length - 1);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }

    void devide(int[] list, int f, int l) {
        if (f >= l)
            return;
        int mid = f + (l - f) / 2;

        devide(list, f, mid);
        devide(list, mid + 1, l);
        conquer(list, f, mid, l);
    }

    void conquer(int[] list, int f, int mid, int l) {

        int[] merged = new int[l - f + 1];
        int index1 = f, index2 = mid + 1;
        int indexMerged = 0;

        while (index1 <= mid && index2 <= l) {
            if (list[index1] <= list[index2]) {
                merged[indexMerged] = list[index1];
                index1++;
            } else {
                merged[indexMerged] = list[index2];
                index2++;
            }
            indexMerged++;
        }

        while (index1 <= mid) {
            merged[indexMerged] = list[index1];
            indexMerged++;
            index1++;
        }

        while (index2 <= l) {
            merged[indexMerged] = list[index2];
            indexMerged++;
            index2++;
        }

        for (int i = f, j = 0; j < merged.length; i++, j++) {
            list[i] = merged[j];
        }
    }

}
