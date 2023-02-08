package tutorial.DI.CI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass 
{
	
	@Bean
	public ExampleClass1 getObject1()
	{
		return new ExampleClass1();
	}
	
	
//	we can use any name from below below array to get this bean
//	@Bean(name = {"object","giveObject","get"})
	@Bean
	public ExampleClass getObject()
	{
		return new ExampleClass(getObject1()); 
	}
}
