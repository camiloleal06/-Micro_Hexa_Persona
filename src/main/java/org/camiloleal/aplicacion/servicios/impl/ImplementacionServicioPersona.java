package org.camiloleal.aplicacion.servicios.impl;

import org.camiloleal.aplicacion.convertidores.ConvertidorPersona;
import org.camiloleal.aplicacion.dtos.PersonaDto;
import org.camiloleal.aplicacion.servicios.ServicioPersona;
import org.camiloleal.dominio.servicio.InterfacePersona;

import java.util.List;
import java.util.stream.Collectors;

public class ImplementacionServicioPersona implements ServicioPersona {

    private InterfacePersona interfacePersona;
    private ConvertidorPersona convertidorPersona;

    public ImplementacionServicioPersona(InterfacePersona interfacePersona, ConvertidorPersona convertidorPersona) {
        this.interfacePersona = interfacePersona;
        this.convertidorPersona = convertidorPersona;
    }

    @Override
    public PersonaDto obtenerPersonaPorId(int id) {
        return convertidorPersona.toPersonaDto(interfacePersona.obtenerPersonaPorId(id));
    }

    @Override
    public PersonaDto guardarPersona(PersonaDto personaDto) {
        return  convertidorPersona.toPersonaDto(interfacePersona.guardarPersona(convertidorPersona.toPersona(personaDto)));
    }

    @Override
    public List<PersonaDto> obtenerPersonas() {
        return interfacePersona.obtenerPersonas().stream().map(convertidorPersona::toPersonaDto).collect(Collectors.toList());
    }

    @Override
    public void eliminarPersonaPorId(int id) {
       interfacePersona.eliminarPersonaPorId(id);
    }

}
