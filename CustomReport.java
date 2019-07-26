package javascriptexecutor;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class CustomReport implements IReporter 
{

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		
		// TODO Auto-generated method stub
		
		
        for (ISuite iSuite : suites) {


               Map<String,ISuiteResult> results =    iSuite.getResults();

               Set<String> keys = results.keySet();

               for (String key : keys) {
            	   
                ITestContext context = results.get(key).getTestContext();
                       System.out.println("Suite Name->"+context.getName());

                       System.out.println("::Report output Ditectory->"+context.getOutputDirectory());

                       System.out.println("::Suite Name->"+ context.getSuite().getName());

                       System.out.println("::Start Date Time for execution->"+context.getStartDate());

                       System.out.println("::End Date Time for execution->"+context.getEndDate());

               }
        }
		
	}

}
