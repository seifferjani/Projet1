/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Mohamed Selim Maazouz
 */
@WebService(serviceName = "CalculSimples")
public class CalculSimples {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "somme")
    public double somme(@WebParam(name = "nombreA") double nombreA, @WebParam(name = "nombreB") double nombreB) {
        //TODO write your implementation code here:
        double k = nombreA+nombreB; return k;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "decomposer")
    public List decomposer(@WebParam(name = "entier") int entier) {
        List l = new ArrayList();
        int i=2;
        while (i<=entier){
            if (entier%i==0){
            l.add(i);
            entier=entier/i;
        }else 
            i++;
    } 
        return l;
    }

    
    @WebMethod(operationName = "premier")
    public boolean premier(@WebParam(name="entier") int entier){
        return decomposer(entier).size()==1;
    }
    
    public static void main (String[] args){
        CalculSimples m = new CalculSimples();
        System.out.println("premier 8 ?" + m.premier(8));
        System.out.println("premier 5 ?"+ m.premier(5));
        System.out.println("decomposer 8 : " +m.decomposer(8));
        System.out.println("decomposer 362880 :" +m.decomposer(362880) );
    }
}


