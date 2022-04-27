package org.camiloleal.aplicacion.config;

import org.camiloleal.aplicacion.servicios.ServicioPersona;
import org.camiloleal.aplicacion.servicios.impl.ImplementacionServicioPersona;
import org.camiloleal.dominio.impl.ImplementacionInterfacePersona;
import org.camiloleal.dominio.repositorio.RepositorioPersona;
import org.camiloleal.dominio.servicio.InterfacePersona;
import org.camiloleal.infraestructura.mysql.AdaptadorDaoPersona;
import org.camiloleal.infraestructura.mysql.DaoPersona;
import org.camiloleal.aplicacion.convertidores.ConvertidorPersona;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracion {

    @Bean
    public InterfacePersona servicioPersona(RepositorioPersona repositorioPersona) {
        return new ImplementacionInterfacePersona(repositorioPersona);
    }
    @Bean
    public RepositorioPersona repositorioPersona(DaoPersona daoPersona, ConvertidorPersona convertidorPersona) {
        return new AdaptadorDaoPersona(daoPersona, convertidorPersona);
    }

    @Bean
    public ServicioPersona casoUsoPersona(InterfacePersona interfacePersona, ConvertidorPersona convertidorPersona) {
        return new ImplementacionServicioPersona(interfacePersona,convertidorPersona);
    }
}
