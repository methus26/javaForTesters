package net.methus.chap006domainentities.examples;

import net.methus.domainentities.User;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UserTest {

    @Test
    public void canConstructANewUser(){
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();

        assertEquals("default username expected", "username", user.getUsername());

        assertEquals("default password", "password", user.getPassword());
    }

    // Works only if the fields are public, not private
    /*
    @Test
    public void userHasUsernameBob(){
        User auser = new User();

        auser.username = "bob";

        assertEquals("not default username", "bob", auser.username);
    }
    */

    @Test
    public void canConstructWithUsernameaAndPassword(){
        User user = new User("admin", "pA55w0rD");

        assertEquals("given username expected", "admin", user.getUsername());

        assertEquals("given password expected", "pA55w0rD", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();

        user.setPassword("PaZZwor6");

        assertEquals("setter password expected", "PaZZwor6", user.getPassword());
    }
}
