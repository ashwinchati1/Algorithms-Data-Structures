package sorting;

/**
 * Created by ashwin on 2/23/2017.
 */
public class SelectionSort {

    public <E extends Comparable> E[] secectionSort(E[] inputArray){
        for(int index=0; index<inputArray.length-1; index++){
            for(int element=index+1; element<inputArray.length; element++){
                if(inputArray[element].compareTo(inputArray[index]) < 0){
                    E temp = inputArray[element];
                    inputArray[element] = inputArray[index];
                    inputArray[index] = temp;
                }
            }
        }
        return inputArray;
    }
}
