package practice.searching.algorithms;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by ashwin on 2/10/2017.
 */

/*
input: sorted array of elements
output: index of the element
returns index if element is found else returns -1...
*/

public class BinarySearch{

    public <E extends Comparable> int binarySearch(E[] inputArray, E elementToSearch){

        Arrays.sort(inputArray);
        int start = 0;
        int end = inputArray.length-1;
        int index = -1;

        while(start<=end){
            int middle = (start + end)/2;
            if(inputArray[middle].compareTo(elementToSearch) == 0){
                index = middle;
                break;
            }else if(elementToSearch.compareTo(inputArray[middle]) > 0){
                start = middle + 1;
            }else{
                end = middle - 1;
            }
        }
        return index;
    }
}

