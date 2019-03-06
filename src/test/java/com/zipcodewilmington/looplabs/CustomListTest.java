package com.zipcodewilmington.looplabs;

import org.junit.Assert;
import org.junit.Test;

 public class CustomListTest {
    @Test
    public void removeAllTest(){
        Object[] before = new Object[]{1,1,2,2,2,3,3,3,4,4,4};
        CoatesList coatesList = new CoatesList(before);
        coatesList.removeAll(3);
        Object[] actual = coatesList.toArray();

        Object[] expected = new Object[]{1,1,2,2,2,4,4,4};

        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void getNumberOccurencesTest(){
        Object[] before = new Object[]{1,1,2,2,2,3,3,3,4,4,4};
        CoatesList coatesList = new CoatesList(before);
        Integer expected = 3;
        Integer actual = coatesList.getNumberOfOccurences(before[4]);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void removeAtIndexTest(){
        Object[] before = new Object[]{1,1,2,2,2,3,3,3,4,4,4};
        CoatesList coatesList = new CoatesList(before);

        Object[] expected = new Integer[] {1,1,2,2,3,3,3,4,4,4};
        coatesList.removeAtIndex(3);
        Object[] actual = coatesList.toArray();

        Assert.assertArrayEquals(expected,actual);
    }

}
