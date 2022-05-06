public class HelloWorldTest {

    @org.junit.Test
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println("Running junit5");
        assert("Hello World".equals(helloWorld.helloWorld()));
    }
}