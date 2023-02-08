package tutorial.DI.CI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationClass.class);
	
		ExampleClass obj1= appContext.getBean("getObject",ExampleClass.class);
		obj1.displayMsg();
		
		appContext.close();
	}

}
