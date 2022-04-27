package org.camiloleal.aplicacion.servicios;

import org.camiloleal.aplicacion.dtos.PersonaDto;

import java.util.List;

public interface ServicioPersona {

    PersonaDto obtenerPersonaPorId(int id);

    PersonaDto guardarPersona(PersonaDto personaDto);

    List<PersonaDto> obtenerPersonas();

    void eliminarPersonaPorId(int id);
}
