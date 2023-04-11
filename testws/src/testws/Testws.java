/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 in cmd : wsimport -keep -verbose http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL
 * @author Mohamed Selim Maazouz
 */
import org.oorsprong.websamples.* ; 
public class Testws {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println(capitalCity("TN"));
    }

    private static String capitalCity(java.lang.String sCountryISOCode) {
        org.oorsprong.websamples.CountryInfoService service = new org.oorsprong.websamples.CountryInfoService();
        org.oorsprong.websamples.CountryInfoServiceSoapType port = service.getCountryInfoServiceSoap();
        return port.capitalCity(sCountryISOCode);
    }
    
}
