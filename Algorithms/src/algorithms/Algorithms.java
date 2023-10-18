/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algorithms;

import merge_sort.MergeSort;
import quick_sort.QuickSort;

/**
 *
 * @author remon
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MergeSort mergeSort=new MergeSort();
        mergeSort.startMergeSort();
        QuickSort quickSort=new QuickSort();
        quickSort.startQuickSort();
    }
    
}
