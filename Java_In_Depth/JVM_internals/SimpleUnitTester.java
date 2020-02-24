public class SimpleUnitTester {
    
    public int execute(Class clazz) throws Exception {
        int failedCount = 0;
        
        // your code
        Reflection reflection = new Reflection();
		for(Method temp: clazz.getDeclaredMethods()) 
		{
			String methodName = temp.getName();
			if(methodName.startsWith("test")) 
			{
				if(temp.invoke(reflection).equals(false))
					failedCount++;
			}
		}	
        return failedCount;
    }
    public static void main(String[] args)
	{
		Class clazz = null;
		try
		{
			clazz=Class.forName("com.jvm.testing");
		}
		 catch (ClassNotFoundException ex)
		 {
			System.out.println(ex);
		 }
		 System.out.println("Failure count "+execute(clazz));
	}
}