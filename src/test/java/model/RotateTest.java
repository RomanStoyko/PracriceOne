package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateTest {
    @Test
    public void rotate() throws Exception {
        int[][] input1 = {{1,2},{3,4}};
        int[][] result1 = {{2,4},{1,3}};
        assertArrayEquals("test 2x2",result1,Rotate.rotate(input1));

        int[][] input2 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result2 = {{3,6,9},{2,5,8},{1,4,7}};
        assertArrayEquals("test 3x3",result2,Rotate.rotate(input2));

        int[][] input3 = {{1,2},{4,5},{7,8}};
        assertNull("test 3x2",Rotate.rotate(input3));
    }

    @Test
    public void generateArray() throws Exception {
        assertNull("test num -1",Rotate.generateArray(-1));
        assertNotNull("test num -1",Rotate.generateArray(2));
    }
}