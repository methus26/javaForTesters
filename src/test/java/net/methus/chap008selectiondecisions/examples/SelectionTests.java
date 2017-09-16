package net.methus.chap008selectiondecisions.examples;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class SelectionTests {

    @Test
    public void moreTernary() {

        String url = "www.eviltester.com";

        url = url.startsWith("http") ? url : addHttp(url);

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }

    @Test
    public void catOrCats(){

        int numberOfCats = 1;
        assertEquals("1 == cat", "cat", (numberOfCats == 1) ? "cat" : "cats");

        numberOfCats = 0;
        assertEquals("0 == cats", "cats", (numberOfCats == 1) ? "cat" : "cats");

        numberOfCats = 2;
        assertEquals("2 == cats", "cats", (numberOfCats == 1) ? "cat" : "cats");
    }

    @Test
    public void catsOrCatsAsMethod(){

        assertEquals("1 == cat","cat", catOrCats(1));

        assertEquals("0 == cats", "cats", catOrCats(0));

        assertEquals("2 == cats", "cats", catOrCats(2));
    }

    private String catOrCats(int numberOfCats){
        return (numberOfCats == 1) ? "cat" : "cats";
    }
}
