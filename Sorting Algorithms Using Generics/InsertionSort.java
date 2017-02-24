package sorting;

/**
 * Created by ashwin on 2/23/2017.
 */
public class InsertionSort {

    public <E extends Comparable> E[] insertionSort(E[] inputArray){
        for(int index=1; index<inputArray.length; index++){
            for(int element=index; element>0; element--){
                if(inputArray[element].compareTo(inputArray[element-1]) < 0){
                    E temp = inputArray[element];
                    inputArray[element] = inputArray[element-1];
                    inputArray[element-1] = temp;
                }
            }
        }
        return inputArray;
    }
}
