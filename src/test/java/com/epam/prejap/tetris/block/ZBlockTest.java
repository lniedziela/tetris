package com.epam.prejap.tetris.block;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test(groups = {"blockShapes"})
public class ZBlockTest {

    ZBlock zBlock = new ZBlock();

    public void numberOfZBlockRowsEqualsTwo() {
        int actual = zBlock.rows();
        int expected = 2;
        assertEquals(actual, expected, "Number of rows for ZBlock is incorrect! Expected: " + expected + ", but actual: " + actual);
    }

    public void numberOfZBlockColsEqualsThree() {
        int actual = zBlock.cols();
        int expected = 3;
        assertEquals(actual, expected, "Number of cols for ZBlock is incorrect! Expected: " + expected + ", but actual: " + actual);
    }

    @DataProvider
    public static Object[][] dotsPosition() {
        return new Object[][]{
                {0, 0, 1, "Incorrect dotAt(0, 0)!"}
                , {0, 1, 1, "Incorrect dotAt(0, 1)!"}
                , {0, 2, 0, "Incorrect dotAt(0, 2)!"}
                , {1, 0, 0, "Incorrect dotAt(1, 0)!"}
                , {1, 1, 1, "Incorrect dotAt(1, 1)!"}
                , {1, 2, 1, "Incorrect dotAt(1, 2)!"}
        };
    }

    @Test(dataProvider = "dotsPosition")
    public void dotAtReturnCorrectValue(int row, int col, int expected, String msg) {
        int actual = zBlock.dotAt(row, col);
        assertEquals(actual, expected, msg);
    }

    @DataProvider
    public static Object[][] correctZBlock() {
        byte[][] zBlock = {
                {1, 1, 0},
                {0, 1, 1}
        };
        return new Object[][]{zBlock};
    }

    @Test(dataProvider = "correctZBlock")
    public void checkIfZBlockCreatedCorrectly(byte[][] expected) {
        byte[][] actual = new ZBlock().image;
        assertEquals(actual, expected);
    }
}
