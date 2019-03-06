package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {


    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        CoatesList jimList = new CoatesList(array);
        for (int i = 0; i < array.length; i++) {
            if(jimList.getNumberOfOccurences(array[i]) >= maxNumberOfDuplications) {
                jimList.removeAll(array[i]);
            }
        }

        return (String[])jimList.toArray();
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        CoatesList jimList = new CoatesList(array);
        for (int i = 0; i < array.length; i++){
            if (jimList.getNumberOfOccurences(array[i]) == (exactNumberOfDuplications)) {
                jimList.removeAll(array[i]);
                i--;
            }
        }
        return (String[])jimList.toArray();
    }
}

