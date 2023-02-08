package tutorial.DI.CI;

import org.springframework.stereotype.Component;

@Component
public class ExampleClass 
{
	private ExampleClass1 ex1Obj;
	
	public ExampleClass(ExampleClass1 ex1Obj)
	{
		this.ex1Obj=ex1Obj;
	}
	
	public void displayMsg()
	{
		this.ex1Obj.displayMsg();
		System.out.println("This is Example Class ");
	}
}
