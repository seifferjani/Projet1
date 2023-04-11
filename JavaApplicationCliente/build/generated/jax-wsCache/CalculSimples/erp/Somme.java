
package erp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour somme complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="somme">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nombreB" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "somme", propOrder = {
    "nombreA",
    "nombreB"
})
public class Somme {

    protected double nombreA;
    protected double nombreB;

    /**
     * Obtient la valeur de la propriété nombreA.
     * 
     */
    public double getNombreA() {
        return nombreA;
    }

    /**
     * Définit la valeur de la propriété nombreA.
     * 
     */
    public void setNombreA(double value) {
        this.nombreA = value;
    }

    /**
     * Obtient la valeur de la propriété nombreB.
     * 
     */
    public double getNombreB() {
        return nombreB;
    }

    /**
     * Définit la valeur de la propriété nombreB.
     * 
     */
    public void setNombreB(double value) {
        this.nombreB = value;
    }

}
