package singleton;

public class singletonexample {
	
	// Static member holds only one instance of the singletonexample class
	private static singletonexample firstinstnace = null;
	
	// private consturctor singletonexample prevents any other class from instantiating class
	private singletonexample() {}
	
	// Static public method Provides Global point of access
	public static singletonexample getinstance()
	{
		if ( firstinstnace == null)
		{
			firstinstnace = new singletonexample();
			
		}	
		return firstinstnace;
		
	}
	
	public void displaySingleton()
	{
		
		 System.out.println(" Inside Singleton");
	}
	
	public static void  main ( String agrs[])
	{
		
		singletonexample.getinstance().displaySingleton();
	}
}
