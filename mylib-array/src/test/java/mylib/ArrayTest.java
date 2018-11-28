package mylib;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import junit.framework.Assert;

import mylib.Array;

public class ArrayTest{
    @Test
    public void testExpand(){
        Array arr1 = new Array(2);
        arr1.append(3);
        arr1.append(4);
        arr1.append(5);

        assertEquals("[3,4,5]", arr1.toString());
    }

    @Test
    public void testAdd(){
        Array arr1 = new Array(2);
        arr1.append(3);
        arr1.append(4);
        arr1.add(1,5);

        assertEquals("[3,5,4]", arr1.toString());
    }

    @Test
    public void testToString(){
        Array arr1 = new Array(4);
        arr1.append(3);
        arr1.append(4);
        arr1.append(5);
        arr1.append(7);

        assertEquals("[3,4,5,7]", arr1.toString());
    }

    @Test
    public void testRemove(){
        Array arr1 = new Array(1);
        for(int i = 0 ; i < 10 ; i ++){
            arr1.append(i);
        }
        assertEquals(16, arr1.getCapacity());
        assertEquals(10, arr1.size);
        

        for (int i = 0; i < 4; i++) {
            arr1.removeFirst();
        }
        assertEquals("[4,5,6,7,8,9]",arr1.toString());
        assertEquals(8, arr1.getCapacity());
    }

}