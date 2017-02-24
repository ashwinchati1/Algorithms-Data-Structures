package sorting;

import java.util.Comparator;

/**
 * Created by ashwin on 2/23/2017.
 */
public class BubbleSort {

    public <E extends Comparable> E[] bubbleSort(E[] inputArray){

        for(int itr=0; itr<inputArray.length; itr++){
            for(int index=0; index<inputArray.length-1; index++){
                if(inputArray[index].compareTo(inputArray[index+1])>0){
                    E temp = inputArray[index];
                    inputArray[index] = inputArray[index+1];
                    inputArray[index+1] = temp;
                }
            }
        }
        return inputArray;
    }
}
