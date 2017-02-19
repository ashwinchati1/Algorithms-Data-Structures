package practice.searching.algorithms;

/**
 * Created by ashwin on 2/10/2017.
 */

/*
input: array of elements
output: index of the element
returns index if element is found else returns -1...
*/

public class LinearSearch {

    public <E> int linearSearch(E[] inputArray, E elementToSearch){

        int index = -1;
        for(int i=0; i<inputArray.length; i++){
            if(inputArray[i] == elementToSearch){
                index = i;
            }
        }
        return index;
    }
}
