package net.methus.chap007basicofjavarevisited.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DataTypesTest {
    @Test
    public void BooleanType(){
        boolean truthy = true;
        boolean falsey = false;

        assertTrue(truthy);
        assertFalse(falsey);

        truthy = Boolean.TRUE;
        falsey = Boolean.FALSE;

        assertTrue(truthy);
        assertFalse(falsey);
    }

    @Test
    public void IntegerTypes(){
        byte aByteHas1Byte;
        short aShortHas2Bytes;
        int anIntHas4Bytes;
        long aLonghas8Bytes;


        System.out.println("* `byte` range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        System.out.println("* `short` range: " + Short.MIN_VALUE + " to " + Short.MIN_VALUE);

        System.out.println("* `int` range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        System.out.println("* `long` range; " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);


        aLonghas8Bytes = 0L; // add suffix L for long
        assertEquals(0, aLonghas8Bytes);

        aByteHas1Byte = 0xA; // add prefix 0x for Hex
        assertEquals(10, aByteHas1Byte);

        anIntHas4Bytes = 010; // add 'zero' prefix for Octal
        assertEquals(8, anIntHas4Bytes);

        aByteHas1Byte = 0b0010; // Java 1.7 added 0b 'zero b' for binary
        assertEquals(aByteHas1Byte, 2);

        // Java 1.7 allows underscores for readability
        aLonghas8Bytes = 9_000_000_000L; // 9 000 million
        assertEquals("9000000000L", aLonghas8Bytes);
    }
}
