import org.junit.Test

class DemoTest {

    @Test
    void testCall() {
        def context = [your_name: 'Jenkins']
        def demo = new Demo()
        demo.call(context) {  }
        assert context.your_name == 'Jenkins'
    }

    @Test
    void testPrintEnv() {
        def demo = new Demo()
        def output = new ByteArrayOutputStream()
        PrintStream printStream = new PrintStream(output)
        System.setOut(printStream)

        demo.printEnv()

        def result = output.toString()
        assert result.contains('WORKSPACE')
        assert result.contains('BRANCH_NAME')
    }
}