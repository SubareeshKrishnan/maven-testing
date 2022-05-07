import org.junit.jupiter.api.Test;

public class HelloWorldJavaIT {

    @Test
    void myFauxIntegrationTest() {
        System.out.println("IT ran successfully!!!");
        HelloWorld helloWorld = new HelloWorld();
        assert ("Hello World".equals(helloWorld.helloWorld()));
    }
}
