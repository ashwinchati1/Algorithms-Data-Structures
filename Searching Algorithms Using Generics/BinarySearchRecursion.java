package practice.searching.algorithms;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by ashwin on 2/10/2017.
 */
public class BinarySearchRecursion {

    public <E extends Comparable>  int binarySearch(E[] inputArray, E elementToSearch){

        Arrays.sort(inputArray);
        int start = 0;
        int end = inputArray.length-1;
        int index = recursiveSearch(start, end, inputArray, elementToSearch);
        return index;
    }

    public <E extends Comparable> int recursiveSearch(int start, int end, E[] inputArray, E elementToSearch){

        int middle = (start + end)/2;
        if(start>end){
            return -1;
        }
        if(inputArray[middle].compareTo(elementToSearch)==0){
            return middle;
        }else if(inputArray[middle].compareTo(elementToSearch)<0){
            return recursiveSearch(middle+1,end, inputArray, elementToSearch);
        }else{
            return recursiveSearch(start,middle-1, inputArray, elementToSearch);
        }
    }
}
