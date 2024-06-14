package mx.uv.inventario;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.inventario.InventarioCliente.FacturaCliente;
import mx.uv.t4is.inventario.ConsultarFacturarRequest;
import mx.uv.t4is.inventario.RecuperarUdiComprasRequest;
import mx.uv.t4is.inventario.RecuperarUdiComprasResponse;
import xx.mx.uv.consumo.wsdl.RecuperarFacturarRequest;
import xx.mx.uv.consumo.wsdl.RecuperarFacturarResponse;
import mx.uv.t4is.inventario.ConsultarFacturarResponse;
import mx.uv.t4is.inventario.RecuperarFolioComprasRequest;
import mx.uv.t4is.inventario.RecuperarFolioComprasResponse;

import java.util.ArrayList;

@Endpoint
public class InventarioEndPoint{
    @Autowired
    private IFacturas ifacturadores;
    ArrayList<RecuperarUdiComprasRequest> udiRecuperadas = new ArrayList<>();
    @Autowired
    private FacturaCliente facturaCliente;
    @PayloadRoot(localPart = "RecuperarUdiComprasRequest", namespace = "t4is.uv.mx/inventario")
    @ResponsePayload
    public RecuperarUdiComprasResponse generarMensajeUdi(@RequestPayload RecuperarUdiComprasRequest peticion){
        RecuperarUdiComprasResponse respuesta = new RecuperarUdiComprasResponse();
        
        // Guardar el UDI recibido en el array
        udiRecuperadas.add(peticion);

        // Mensaje de recibido
        respuesta.setMensajeUdi("El UDI fue recibido");

        // // Llamar al servicio consultarFactura con el UDI recibido
        // RecuperarFacturarRequest recuperarFacturarRequest = new RecuperarFacturarRequest();
        // recuperarFacturarRequest.setUDDI(peticion.getUDDI());

        // // Solicitar la factura utilizando FacturaCliente
        // RecuperarFacturarResponse facturaResponse = facturaCliente.solicitarFactura(recuperarFacturarRequest);

        
        // Retornar la respuesta con el mensaje de recibido y la factura
        return respuesta;

    }


    @PayloadRoot(localPart = "RecuperarFolioComprasRequest", namespace = "t4is.uv.mx/inventario")
    @ResponsePayload
    public RecuperarFolioComprasResponse generarMensajeFolio(@RequestPayload RecuperarFolioComprasRequest peticion){
        RecuperarFolioComprasResponse respuesta = new RecuperarFolioComprasResponse();
    
        respuesta.setMensajeFolio("El Folio fue recibido");
        return respuesta;
    }

    
    @PayloadRoot(localPart = "ConsultarFacturarRequest", namespace = "t4is.uv.mx/inventario")
    @ResponsePayload
    public ConsultarFacturarResponse consultarFactura(@RequestPayload ConsultarFacturarRequest peticion) {
        ConsultarFacturarResponse respuesta = new ConsultarFacturarResponse();
        ArrayList<String> udiBases = new ArrayList<>();
        boolean udiEncontrado =false;
        Iterable<Facturadores> listaBase = ifacturadores.findAll();
        
        for(Facturadores lola : listaBase){
            String udi = lola.getUDDI();
            udiBases.add(udi);
        }
        for(int i = 0; i<udiBases.size(); i++){
            for(int a = 0; a<udiRecuperadas.size(); a++){
                if (udiBases.get(i).equals(udiRecuperadas.get(a).getUDDI())){
                    udiEncontrado = true;
                }
            }
            
        }



        if (udiEncontrado) {
            // Llamar al servicio de factura para obtener los datos
            RecuperarFacturarRequest recuperarFacturarRequest = new RecuperarFacturarRequest();
            recuperarFacturarRequest.setUDDI(peticion.getUDDI());

            // Solicitar la factura utilizando FacturaCliente
            RecuperarFacturarResponse facturaResponse = facturaCliente.solicitarFactura(recuperarFacturarRequest);

            // Configurar la respuesta con los datos de la factura
            if (facturaResponse != null) {
                respuesta.setMensaje("FACTURA RECUPERADA");
                respuesta.setUDDI(facturaResponse.getUDDI());
                respuesta.setVersion(facturaResponse.getVersion());
                respuesta.setSerie(facturaResponse.getSerie());
                respuesta.setTipoDeComprobante(facturaResponse.getTipoDeComprobante());
                respuesta.setExportacion(facturaResponse.getExportacion());
                respuesta.setLugarExpedicion(facturaResponse.getLugarExpedicion());
                respuesta.setCertificado(facturaResponse.getCertificado());
                respuesta.setSello(facturaResponse.getSello());
                respuesta.setRegimenFiscalEmisor(facturaResponse.getRegimenFiscalEmisor());
                respuesta.setRfcEmisor(facturaResponse.getRfcEmisor());
                respuesta.setRegimenFiscalReceptor(facturaResponse.getRegimenFiscalReceptor());
                respuesta.setDomicilioFiscalReceptor(facturaResponse.getDomicilioFiscalReceptor());
                respuesta.setFecha(facturaResponse.getFecha());
                respuesta.setPrecioUnitario(facturaResponse.getPrecioUnitario());
                respuesta.setCantidad(facturaResponse.getCantidad());
                respuesta.setSubtotal(facturaResponse.getSubtotal());
                respuesta.setTotal(facturaResponse.getTotal());
                respuesta.setNombre(facturaResponse.getNombre());
                respuesta.setFormaDePago(facturaResponse.getFormaDePago());
                respuesta.setRfc(facturaResponse.getRfc());
                respuesta.setDescripcion(facturaResponse.getDescripcion());
            }
            } else {
            // Si no se encuentra el UDI, retornar una respuesta vacía o con un mensaje de error
            respuesta.setMensaje("El UDI no se encuentra en el sistema");
        }

        return respuesta;
    }





}
