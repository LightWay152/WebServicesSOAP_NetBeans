
package client.webservice.tutorial;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client.webservice.tutorial package. 
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

    private final static QName _MulIntegersResponse_QNAME = new QName("http://tutorial.soap.webservice/", "MulIntegersResponse");
    private final static QName _AddIntegersResponse_QNAME = new QName("http://tutorial.soap.webservice/", "AddIntegersResponse");
    private final static QName _AddIntegers_QNAME = new QName("http://tutorial.soap.webservice/", "AddIntegers");
    private final static QName _MulIntegers_QNAME = new QName("http://tutorial.soap.webservice/", "MulIntegers");
    private final static QName _DivIntegers_QNAME = new QName("http://tutorial.soap.webservice/", "DivIntegers");
    private final static QName _DivIntegersResponse_QNAME = new QName("http://tutorial.soap.webservice/", "DivIntegersResponse");
    private final static QName _SubIntegers_QNAME = new QName("http://tutorial.soap.webservice/", "SubIntegers");
    private final static QName _SubIntegersResponse_QNAME = new QName("http://tutorial.soap.webservice/", "SubIntegersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client.webservice.tutorial
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MulIntegersResponse }
     * 
     */
    public MulIntegersResponse createMulIntegersResponse() {
        return new MulIntegersResponse();
    }

    /**
     * Create an instance of {@link AddIntegersResponse }
     * 
     */
    public AddIntegersResponse createAddIntegersResponse() {
        return new AddIntegersResponse();
    }

    /**
     * Create an instance of {@link AddIntegers }
     * 
     */
    public AddIntegers createAddIntegers() {
        return new AddIntegers();
    }

    /**
     * Create an instance of {@link MulIntegers }
     * 
     */
    public MulIntegers createMulIntegers() {
        return new MulIntegers();
    }

    /**
     * Create an instance of {@link DivIntegers }
     * 
     */
    public DivIntegers createDivIntegers() {
        return new DivIntegers();
    }

    /**
     * Create an instance of {@link DivIntegersResponse }
     * 
     */
    public DivIntegersResponse createDivIntegersResponse() {
        return new DivIntegersResponse();
    }

    /**
     * Create an instance of {@link SubIntegers }
     * 
     */
    public SubIntegers createSubIntegers() {
        return new SubIntegers();
    }

    /**
     * Create an instance of {@link SubIntegersResponse }
     * 
     */
    public SubIntegersResponse createSubIntegersResponse() {
        return new SubIntegersResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MulIntegersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tutorial.soap.webservice/", name = "MulIntegersResponse")
    public JAXBElement<MulIntegersResponse> createMulIntegersResponse(MulIntegersResponse value) {
        return new JAXBElement<MulIntegersResponse>(_MulIntegersResponse_QNAME, MulIntegersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddIntegersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tutorial.soap.webservice/", name = "AddIntegersResponse")
    public JAXBElement<AddIntegersResponse> createAddIntegersResponse(AddIntegersResponse value) {
        return new JAXBElement<AddIntegersResponse>(_AddIntegersResponse_QNAME, AddIntegersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddIntegers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tutorial.soap.webservice/", name = "AddIntegers")
    public JAXBElement<AddIntegers> createAddIntegers(AddIntegers value) {
        return new JAXBElement<AddIntegers>(_AddIntegers_QNAME, AddIntegers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MulIntegers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tutorial.soap.webservice/", name = "MulIntegers")
    public JAXBElement<MulIntegers> createMulIntegers(MulIntegers value) {
        return new JAXBElement<MulIntegers>(_MulIntegers_QNAME, MulIntegers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivIntegers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tutorial.soap.webservice/", name = "DivIntegers")
    public JAXBElement<DivIntegers> createDivIntegers(DivIntegers value) {
        return new JAXBElement<DivIntegers>(_DivIntegers_QNAME, DivIntegers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivIntegersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tutorial.soap.webservice/", name = "DivIntegersResponse")
    public JAXBElement<DivIntegersResponse> createDivIntegersResponse(DivIntegersResponse value) {
        return new JAXBElement<DivIntegersResponse>(_DivIntegersResponse_QNAME, DivIntegersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubIntegers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tutorial.soap.webservice/", name = "SubIntegers")
    public JAXBElement<SubIntegers> createSubIntegers(SubIntegers value) {
        return new JAXBElement<SubIntegers>(_SubIntegers_QNAME, SubIntegers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubIntegersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tutorial.soap.webservice/", name = "SubIntegersResponse")
    public JAXBElement<SubIntegersResponse> createSubIntegersResponse(SubIntegersResponse value) {
        return new JAXBElement<SubIntegersResponse>(_SubIntegersResponse_QNAME, SubIntegersResponse.class, null, value);
    }

}
