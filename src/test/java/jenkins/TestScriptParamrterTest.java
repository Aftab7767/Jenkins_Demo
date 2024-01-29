package jenkins;

import org.testng.annotations.Test;

public class TestScriptParamrterTest {
@Test
public void scriptTest()
{
	String browser=System.getProperty("browser");
	String env = System.getProperty("env");
	System.out.println(browser);
	System.out.println(env);
}
}
