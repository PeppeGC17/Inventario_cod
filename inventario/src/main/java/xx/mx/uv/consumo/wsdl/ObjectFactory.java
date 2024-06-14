
package xx.mx.uv.consumo.wsdl;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xx.mx.uv.consumo.wsdl package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xx.mx.uv.consumo.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenerarFacturaRequest }
     * 
     */
    public GenerarFacturaRequest createGenerarFacturaRequest() {
        return new GenerarFacturaRequest();
    }

    /**
     * Create an instance of {@link GenerarFacturaResponse }
     * 
     */
    public GenerarFacturaResponse createGenerarFacturaResponse() {
        return new GenerarFacturaResponse();
    }

    /**
     * Create an instance of {@link RecuperarFacturarRequest }
     * 
     */
    public RecuperarFacturarRequest createRecuperarFacturarRequest() {
        return new RecuperarFacturarRequest();
    }

    /**
     * Create an instance of {@link RecuperarFacturarResponse }
     * 
     */
    public RecuperarFacturarResponse createRecuperarFacturarResponse() {
        return new RecuperarFacturarResponse();
    }

}
