package org.camiloleal.dominio.servicio;

import org.camiloleal.dominio.modelo.Persona;

import java.util.List;
//Puerto Primario comunicacion con RestController
public interface InterfacePersona {
    Persona obtenerPersonaPorId(int id);

    Persona guardarPersona(Persona persona);

    List<Persona> obtenerPersonas();

    void eliminarPersonaPorId(int id);
}
