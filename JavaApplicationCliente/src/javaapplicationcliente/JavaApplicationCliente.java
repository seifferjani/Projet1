
package javaapplicationcliente;

/**
 * @author Mohamed Selim Maazouz
 */
public class JavaApplicationCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("appel distant decomposer() :" +decomposer(642880));
    }
    
    private static boolean premier (int entier) {
        erp.CalculSimples_Service service = new erp.CalculSimples_Service();
        erp.CalculSimples port = service.getCalculSimplesPort();
        return port.premier(entier);
    }
    
    private static java.util.List<java.lang.Object> decomposer (int entier) {
        erp.CalculSimples_Service service = new erp.CalculSimples_Service();
        erp.CalculSimples port = service.getCalculSimplesPort();
        return port.decomposer(entier);
    }
}
