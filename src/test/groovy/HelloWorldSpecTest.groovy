import spock.lang.Specification

class HelloWorldSpecTest extends Specification {
    def "HelloWorld"() {
        println("Spock tests running...")
        when:
        def foo = "123"

        then:
        true

    }
}
