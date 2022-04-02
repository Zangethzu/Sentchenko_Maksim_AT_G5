package main.java.tasks.classwork.day13;

import org.junit.Assert;
import org.junit.Test;

public class FunctionalClassTest {

    @Test
    public void generateNewIntLess30() {
        FunctionalClass fc = new FunctionalClass();
        int result = fc.generateNewInt(20);
        Assert.assertEquals("Generated result is not + 4", 24, result);
    }

    @Test
    public void generateNewIntMore30() {
        FunctionalClass fc = new FunctionalClass();
        int result = fc.generateNewInt(40);
        Assert.assertEquals("Generated result is not + 4", 36, result);
    }
}
