package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] inputArray) {
        super(inputArray);

    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        CoatesList jimList = new CoatesList(array);
        for (Object obj: array){
            if(jimList.getNumberOfOccurences(obj) >= maxNumberOfDuplications) {
                jimList.removeAll(obj);
            }
        }

        return (Integer[])jimList.toArray();
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        CoatesList jimList = new CoatesList(array);
        for (Object obj: array) {
            if (jimList.getNumberOfOccurences(obj) == (exactNumberOfDuplications)) {
                jimList.removeAll(obj);
            }
        }
        return (Integer[])jimList.toArray();
    }
}

