package tutorial.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationClass.class);
	
		ComponentClass obj1= appContext.getBean(ComponentClass.class);
		obj1.displayMsg();
		appContext.close();
	}

}
