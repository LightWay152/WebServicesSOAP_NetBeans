package webservice.soap.tutorial;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 * @author DaoNguyen
 */
@WebService(serviceName = "CalculatorWebService")
public class CalculatorWebService {
    
    @WebMethod(operationName = "AddIntegers")
    public int add(@WebParam(name = "firstNumber") int num1, 
                    @WebParam(name = "secondNumber") int num2){
        return num1 + num2;
    }
    
    @WebMethod(operationName = "SubIntegers")
    public int sub(@WebParam(name = "firstNumber") int num1, 
                    @WebParam(name = "secondNumber") int num2){
        return num1 - num2;
    }
    
    @WebMethod(operationName = "MulIntegers")
    public int mul(@WebParam(name = "firstNumber") int num1, 
                    @WebParam(name = "secondNumber") int num2){
        return num1 * num2;
    }
    
    @WebMethod(operationName = "DivIntegers")
    public int div(@WebParam(name = "firstNumber") int num1, 
                    @WebParam(name = "secondNumber") int num2){
        return num1 / num2;
    }
    
}
