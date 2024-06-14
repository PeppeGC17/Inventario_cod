
package xx.mx.uv.consumo.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UDDI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Tipo_de_comprobante" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Exportacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lugarExpedicion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Certificado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sello" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RegimenFiscalEmisor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RfcEmisor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RegimenFiscalReceptor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DomicilioFiscalReceptor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="precio_unitario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="subtotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="forma_de_pago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uddi",
    "version",
    "serie",
    "tipoDeComprobante",
    "exportacion",
    "lugarExpedicion",
    "certificado",
    "sello",
    "regimenFiscalEmisor",
    "rfcEmisor",
    "regimenFiscalReceptor",
    "domicilioFiscalReceptor",
    "fecha",
    "precioUnitario",
    "cantidad",
    "subtotal",
    "total",
    "nombre",
    "formaDePago",
    "rfc",
    "descripcion"
})
@XmlRootElement(name = "GenerarFacturaResponse")
public class GenerarFacturaResponse {

    @XmlElement(name = "UDDI", required = true)
    protected String uddi;
    protected double version;
    protected double serie;
    @XmlElement(name = "Tipo_de_comprobante", required = true)
    protected String tipoDeComprobante;
    @XmlElement(name = "Exportacion", required = true)
    protected String exportacion;
    @XmlElement(required = true)
    protected String lugarExpedicion;
    @XmlElement(name = "Certificado", required = true)
    protected String certificado;
    @XmlElement(required = true)
    protected String sello;
    @XmlElement(name = "RegimenFiscalEmisor", required = true)
    protected String regimenFiscalEmisor;
    @XmlElement(name = "RfcEmisor", required = true)
    protected String rfcEmisor;
    @XmlElement(name = "RegimenFiscalReceptor", required = true)
    protected String regimenFiscalReceptor;
    @XmlElement(name = "DomicilioFiscalReceptor", required = true)
    protected String domicilioFiscalReceptor;
    @XmlElement(required = true)
    protected String fecha;
    @XmlElement(name = "precio_unitario")
    protected double precioUnitario;
    protected double cantidad;
    protected double subtotal;
    protected double total;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(name = "forma_de_pago", required = true)
    protected String formaDePago;
    @XmlElement(required = true)
    protected String rfc;
    @XmlElement(required = true)
    protected String descripcion;

    /**
     * Obtiene el valor de la propiedad uddi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDDI() {
        return uddi;
    }

    /**
     * Define el valor de la propiedad uddi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDDI(String value) {
        this.uddi = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     */
    public double getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     */
    public void setVersion(double value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     */
    public double getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     */
    public void setSerie(double value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDeComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeComprobante() {
        return tipoDeComprobante;
    }

    /**
     * Define el valor de la propiedad tipoDeComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeComprobante(String value) {
        this.tipoDeComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad exportacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportacion() {
        return exportacion;
    }

    /**
     * Define el valor de la propiedad exportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportacion(String value) {
        this.exportacion = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    /**
     * Define el valor de la propiedad lugarExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarExpedicion(String value) {
        this.lugarExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad certificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificado() {
        return certificado;
    }

    /**
     * Define el valor de la propiedad certificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificado(String value) {
        this.certificado = value;
    }

    /**
     * Obtiene el valor de la propiedad sello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSello() {
        return sello;
    }

    /**
     * Define el valor de la propiedad sello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSello(String value) {
        this.sello = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenFiscalEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenFiscalEmisor() {
        return regimenFiscalEmisor;
    }

    /**
     * Define el valor de la propiedad regimenFiscalEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenFiscalEmisor(String value) {
        this.regimenFiscalEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcEmisor() {
        return rfcEmisor;
    }

    /**
     * Define el valor de la propiedad rfcEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcEmisor(String value) {
        this.rfcEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenFiscalReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenFiscalReceptor() {
        return regimenFiscalReceptor;
    }

    /**
     * Define el valor de la propiedad regimenFiscalReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenFiscalReceptor(String value) {
        this.regimenFiscalReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioFiscalReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilioFiscalReceptor() {
        return domicilioFiscalReceptor;
    }

    /**
     * Define el valor de la propiedad domicilioFiscalReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilioFiscalReceptor(String value) {
        this.domicilioFiscalReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUnitario.
     * 
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Define el valor de la propiedad precioUnitario.
     * 
     */
    public void setPrecioUnitario(double value) {
        this.precioUnitario = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(double value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad subtotal.
     * 
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Define el valor de la propiedad subtotal.
     * 
     */
    public void setSubtotal(double value) {
        this.subtotal = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public double getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(double value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad formaDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaDePago() {
        return formaDePago;
    }

    /**
     * Define el valor de la propiedad formaDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaDePago(String value) {
        this.formaDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc(String value) {
        this.rfc = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

}
