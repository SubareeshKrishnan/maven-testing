import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.helloWorld());
    }
}