import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void test_hello (){
        HelloWorld chat = new HelloWorld();
        assertEquals(1,chat.Dummy());
    }
}