import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args)
	{
		Result resultMax = JUnitCore.runClasses(TestMax.class);
		for (Failure failure : resultMax.getFailures())
		{
			System.out.println(failure.toString());
		}
		
		System.out.print("Result = ");
		if (!resultMax.wasSuccessful())
			System.out.println("Fail.");
		else
			System.out.println("Successful.");
		System.out.println("Pass = " + ( 5 - resultMax.getFailureCount()) + "/5.");
		
		System.out.println("--------------------------------------------------------------------");
		
		Result resultMinArr = JUnitCore.runClasses(TestMinArr.class);
		for (Failure failure : resultMinArr.getFailures())
		{
			System.out.println(failure.toString());
		}
		
		System.out.print("Result = ");
		if (!resultMinArr.wasSuccessful())
			System.out.println("Fail.");
		else
			System.out.println("Successful.");
		System.out.println("Pass = " + ( 5 - resultMinArr.getFailureCount()) + "/5.");
		
		System.out.println("--------------------------------------------------------------------");
		
		Result resultBMI = JUnitCore.runClasses(TestBMI.class);
		for (Failure failure : resultBMI.getFailures())
		{
			System.out.println(failure.toString());
		}
		
		System.out.print("Result = ");
		if (!resultBMI.wasSuccessful())
			System.out.println("Fail.");
		else
			System.out.println("Successful.");
		System.out.println("Pass = " + ( 5 - resultBMI.getFailureCount()) + "/5.");
		
		
	}
	

}
