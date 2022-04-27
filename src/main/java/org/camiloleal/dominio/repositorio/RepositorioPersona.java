package org.camiloleal.dominio.repositorio;

import org.camiloleal.dominio.modelo.Persona;

import java.util.List;
public interface RepositorioPersona {
    Persona obtenerPersonaPorId(int id);

    Persona guardarPersona(Persona persona);

    List<Persona> obtenerPersonas();

    void eliminarPersonaPorId(int id);
}
