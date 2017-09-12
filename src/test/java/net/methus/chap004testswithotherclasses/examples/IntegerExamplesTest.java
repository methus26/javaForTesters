package net.methus.chap004testswithotherclasses.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration(){
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4", 4, four.intValue());

        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());

        Integer six = 6;
        assertEquals("autoboxing assignment for 6", 6, six.intValue());
    }

    @Test
    public void toHexStringExploration(){
        Integer eleven = 11;
        assertEquals( "intValue returns hex b", "b", Integer.toHexString(eleven));

        Integer ten = 10;
        assertEquals("intValue returns hex a", "a", Integer.toHexString(ten));

        Integer three = 3;
        assertEquals("intValue returns hex 3", "3", Integer.toHexString(three));

        Integer twentyone = 21;
        assertEquals("intValue returns hex 15", "15", Integer.toHexString(twentyone));
    }
}
