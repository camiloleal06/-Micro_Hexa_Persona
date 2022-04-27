package org.camiloleal.aplicacion.convertidores;

import org.camiloleal.dominio.modelo.Persona;
import org.camiloleal.infraestructura.mysql.EntidadPersona;
import org.camiloleal.aplicacion.dtos.PersonaDto;
import org.springframework.stereotype.Component;

@Component
public class ConvertidorPersona {

    public EntidadPersona toEntidadPersona(PersonaDto personaDto) {
        return EntidadPersona.builder()
                .apellidos(personaDto.getApellidos())
                .nombres(personaDto.getNombres()).build();
    }

    public PersonaDto toPersonaDto(EntidadPersona entidadPersona) {
        return PersonaDto.builder()
                .apellidos(entidadPersona.getApellidos())
                .nombres(entidadPersona.getNombres()).build();
    }

    public Persona toPersona(PersonaDto personaDto) {
        return Persona.builder()
                .apellidos(personaDto.getApellidos())
                .nombres(personaDto.getNombres()).build();
    }

    public EntidadPersona toEntidadPersona(Persona persona) {
        return EntidadPersona.builder()
                .id(persona.getId())
                .apellidos(persona.getApellidos())
                .nombres(persona.getNombres()).build();
    }

    public Persona toPersona(EntidadPersona entidadPersona) {
        return Persona.builder()
                .id(entidadPersona.getId())
                .apellidos(entidadPersona.getApellidos())
                .nombres(entidadPersona.getNombres())
                .build();
    }

    public PersonaDto toPersonaDto(Persona persona) {
        return PersonaDto.builder()
                .apellidos(persona.getApellidos())
                .nombres(persona.getNombres()).build();
    }
}
