package mx.uv.inventario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//Crea las tablas de la base
@Entity
public class Facturadores {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    //Datos de la tabla
    String UDDI;
    double version;
    double serie;
    String Tipo_de_comprobante;
    String Exportacion;
    String lugarExpedicion;
    String Certificado;
    String sello;
    String RegimenFiscalEmisor;
    String RfcEmisor;
    String RegimenFiscalReceptor;
    String DomicilioFiscalReceptor;
    String fecha;
    double precio_unitario;
    double cantidad;
    double subtotal;
    double total;
    String nombre;
    String forma_de_pago;
    String rfc;
    String descripcion;
    

    public String getUDDI() {
        return UDDI;
    }

    public void setUDDI(String UDDI) {
        this.UDDI = UDDI;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public double getSerie() {
        return serie;
    }

    public void setSerie(double serie) {
        this.serie = serie;
    }

    public String getTipo_de_comprobante() {
        return Tipo_de_comprobante;
    }

    public void setTipo_de_comprobante(String Tipo_de_comprobante) {
        this.Tipo_de_comprobante = Tipo_de_comprobante;
    }

    public String getExportacion() {
        return Exportacion;
    }

    public void setExportacion(String Exportacion) {
        this.Exportacion = Exportacion;
    }

    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    public void setLugarExpedicion(String lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
    }

    public String getCertificado() {
        return Certificado;
    }

    public void setCertificado(String Certificado) {
        this.Certificado = Certificado;
    }

    public String getSello() {
        return sello;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public String getRegimenFiscalEmisor() {
        return RegimenFiscalEmisor;
    }

    public void setRegimenFiscalEmisor(String RegimenFiscalEmisor) {
        this.RegimenFiscalEmisor = RegimenFiscalEmisor;
    }

    public String getRfcEmisor() {
        return RfcEmisor;
    }

    public void setRfcEmisor(String RfcEmisor) {
        this.RfcEmisor = RfcEmisor;
    }

    public String getRegimenFiscalReceptor() {
        return RegimenFiscalReceptor;
    }

    public void setRegimenFiscalReceptor(String RegimenFiscalReceptor) {
        this.RegimenFiscalReceptor = RegimenFiscalReceptor;
    }

    public String getDomicilioFiscalReceptor() {
        return DomicilioFiscalReceptor;
    }

    public void setDomicilioFiscalReceptor(String DomicilioFiscalReceptor) {
        this.DomicilioFiscalReceptor = DomicilioFiscalReceptor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getForma_de_pago() {
        return forma_de_pago;
    }

    public void setForma_de_pago(String forma_de_pago) {
        this.forma_de_pago = forma_de_pago;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
