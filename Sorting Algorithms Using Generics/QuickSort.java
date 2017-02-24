package sorting;

import java.util.Comparator;

/**
 * Created by ashwin on 2/23/2017.
 */
public class QuickSort {

    public <E extends Comparable> E[] sort(E[] inputArray){

        int lower = 0;
        int higher = inputArray.length-1;
        quickSort(lower,higher,inputArray);
        return inputArray;
    }

    private <E extends Comparable> void quickSort(int low, int high, E[] inputArray){

        int i=low;
        int j= high;
        int pivot = (low+high)/2;

        while(i<=j){
            while(inputArray[i].compareTo(inputArray[pivot])<0){
                i++;
            }
            while(inputArray[j].compareTo(inputArray[pivot])>0){
                j--;
            }
            if(i<=j){
                E temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
                i++;
                j--;
            }
        }
        if(low<j){
            quickSort(low,j,inputArray);
        }
        if(i<high){
            quickSort(i,high,inputArray);
        }

    }
}
