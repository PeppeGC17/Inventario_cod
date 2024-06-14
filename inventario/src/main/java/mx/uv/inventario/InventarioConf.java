package mx.uv.inventario;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.context.ApplicationContext;

@EnableWs
@Configuration
public class InventarioConf  extends WsConfigurerAdapter{

    @Bean
    public XsdSchema saludosdSchema(){
        return new SimpleXsdSchema(new ClassPathResource("inventario.xsd"));
    }

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }
    @Bean(name = "inventario")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema saludoSchema){
        DefaultWsdl11Definition wsdl= new DefaultWsdl11Definition();
        wsdl.setPortTypeName("saludosPort");
        wsdl.setLocationUri("/ws");
        wsdl.setTargetNamespace("t4is.uv.mx/inventario");
        wsdl.setSchema(saludoSchema);
        return wsdl;
    }

    
}
