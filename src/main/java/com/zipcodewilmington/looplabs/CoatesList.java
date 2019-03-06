package com.zipcodewilmington.looplabs;

import java.util.Arrays;

public class CoatesList {

    Object [] jimArray;

    public CoatesList (Object [] array){
        this.jimArray = array;
    }

    public Integer getNumberOfOccurences(Object input) {
        Integer count = 0;
        for (Object obj : jimArray) {
            if (obj.equals(input)) {
                count++;
            }
        }
        return count;
    }


    public void removeAtIndex( int index) {
        Object removeVal = jimArray[index];
        for (int i = index+1; i < jimArray.length; i++) {
            jimArray[i-1] = jimArray[i];
        }
        jimArray[jimArray.length-1] = removeVal;
        jimArray = Arrays.copyOf(jimArray, jimArray.length-1);
    }

    public void removeAll(Object toRemove){
        for (int i = 0; i < jimArray.length; i++) {
            if (jimArray[i].equals(toRemove)) {
                removeAtIndex(i);
                i--;
            }
        }
    }

    public Object[] toArray(){
        return jimArray;
    }
}
