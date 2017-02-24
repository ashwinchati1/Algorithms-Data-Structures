package sorting;

import java.util.Arrays;

/**
 * Created by ashwin on 2/23/2017.
 */
public class MergeSort<E extends Comparable>{

    private E[] array;

    public  E[] mergeSort(E[] inputArray){

        int low = 0;
        int high = inputArray.length;
        array = inputArray;
        divideArrays(low,high);
        return inputArray;
    }

    private void divideArrays(int low, int high){
        if(low <= high){
            int mid = (low+high)/2;
            divideArrays(low,mid);
            divideArrays(mid+1,high);
            mergeArrays(low,mid,high);
        }
    }

    private void mergeArrays(int low, int mid, int high){
        E[] tempArray = Arrays.copyOf(array,array.length);
        int i = low;
        int j = mid+1;
        int k = low;
        while(i<=mid && j<=high){
            if(tempArray[i].compareTo(tempArray[j])<0){
                array[k] = tempArray[i];
                i++;
            }else{
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }
}
