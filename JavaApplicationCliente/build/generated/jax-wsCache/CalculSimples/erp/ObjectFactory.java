
package erp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the erp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloResponse_QNAME = new QName("http://erp/", "helloResponse");
    private final static QName _Decomposer_QNAME = new QName("http://erp/", "decomposer");
    private final static QName _DecomposerResponse_QNAME = new QName("http://erp/", "decomposerResponse");
    private final static QName _PremierResponse_QNAME = new QName("http://erp/", "premierResponse");
    private final static QName _SommeResponse_QNAME = new QName("http://erp/", "sommeResponse");
    private final static QName _Somme_QNAME = new QName("http://erp/", "somme");
    private final static QName _Hello_QNAME = new QName("http://erp/", "hello");
    private final static QName _Premier_QNAME = new QName("http://erp/", "premier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: erp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Somme }
     * 
     */
    public Somme createSomme() {
        return new Somme();
    }

    /**
     * Create an instance of {@link SommeResponse }
     * 
     */
    public SommeResponse createSommeResponse() {
        return new SommeResponse();
    }

    /**
     * Create an instance of {@link DecomposerResponse }
     * 
     */
    public DecomposerResponse createDecomposerResponse() {
        return new DecomposerResponse();
    }

    /**
     * Create an instance of {@link PremierResponse }
     * 
     */
    public PremierResponse createPremierResponse() {
        return new PremierResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Decomposer }
     * 
     */
    public Decomposer createDecomposer() {
        return new Decomposer();
    }

    /**
     * Create an instance of {@link Premier }
     * 
     */
    public Premier createPremier() {
        return new Premier();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erp/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Decomposer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erp/", name = "decomposer")
    public JAXBElement<Decomposer> createDecomposer(Decomposer value) {
        return new JAXBElement<Decomposer>(_Decomposer_QNAME, Decomposer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecomposerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erp/", name = "decomposerResponse")
    public JAXBElement<DecomposerResponse> createDecomposerResponse(DecomposerResponse value) {
        return new JAXBElement<DecomposerResponse>(_DecomposerResponse_QNAME, DecomposerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PremierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erp/", name = "premierResponse")
    public JAXBElement<PremierResponse> createPremierResponse(PremierResponse value) {
        return new JAXBElement<PremierResponse>(_PremierResponse_QNAME, PremierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SommeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erp/", name = "sommeResponse")
    public JAXBElement<SommeResponse> createSommeResponse(SommeResponse value) {
        return new JAXBElement<SommeResponse>(_SommeResponse_QNAME, SommeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Somme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erp/", name = "somme")
    public JAXBElement<Somme> createSomme(Somme value) {
        return new JAXBElement<Somme>(_Somme_QNAME, Somme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erp/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Premier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://erp/", name = "premier")
    public JAXBElement<Premier> createPremier(Premier value) {
        return new JAXBElement<Premier>(_Premier_QNAME, Premier.class, null, value);
    }

}
