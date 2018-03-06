package datadrive;

import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.WebElement;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class data {

	public static String getTestValue(String fieldName, String qry) throws FilloException{
        String testString=xlTesting(fieldName,qry);
        return testString;
    }   
    public static String xlTesting(String fieldName, String qry) throws FilloException{
        String testval=null;
        Fillo fillo=new Fillo();

        Connection connection=fillo.getConnection("resources/TestData.xlsx");
        String sqry=qry;
        Recordset recordset=connection.executeQuery(sqry);

        while(recordset.next()){
            ArrayList<String> dataColl=recordset.getFieldNames();
            Iterator<String> dataIterator=dataColl.iterator();

            while(dataIterator.hasNext()){
                for (int i=0;i<=dataColl.size()-1;i++){
                    String data=dataIterator.next();
                    String dataVal=recordset.getField(data);
                    if (data.equalsIgnoreCase(fieldName)){
                        String testData=dataColl.get(i);   
                        String testValue= recordset.getField(testData);
                        testval=testValue;
                    }
                }

                break;
            }
        }

        recordset.close();
        connection.close();
        return testval; 
    }

    public static void inText(WebElement driver, String fieldName, String  qry) throws FilloException{
        String fval=getTestValue(fieldName, qry);
        driver.sendKeys(fval);
        System.out.println(fieldName +" : "+ fval);
    }
}
	


