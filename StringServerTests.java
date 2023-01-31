import static org.junit.Assert.*;
import org.junit.*;

import java.net.URI;

public class StringServerTests {

    @Test
    public void test1TwoQueries() {
    StringServer test1Server = new StringServer();
    Handler.handleRequest(new URI("http://localhost:4000/add-message?s=test1FirstLine"));
    assertEquals("test1FirstLine" + "\n" + "test2FirstLine", 
            Handler.handleRequest(new URI("http://localhost:4000/add-message?s=test1SecondLine")));
    }

}