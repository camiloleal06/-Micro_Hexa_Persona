package org.camiloleal.dominio.impl;

import org.camiloleal.dominio.modelo.Persona;
import org.camiloleal.dominio.repositorio.RepositorioPersona;
import org.camiloleal.dominio.servicio.InterfacePersona;

import java.util.List;

public class ImplementacionInterfacePersona implements InterfacePersona {
    private final RepositorioPersona repositorioPersona;

    public ImplementacionInterfacePersona(RepositorioPersona repositorioPersona) {
        this.repositorioPersona = repositorioPersona;
    }

    @Override
    public Persona obtenerPersonaPorId(int id) {
        return repositorioPersona.obtenerPersonaPorId(id);
    }

    @Override
    public Persona guardarPersona(Persona persona) {
        return repositorioPersona.guardarPersona(persona);
    }

    @Override
    public List<Persona> obtenerPersonas() {
        return repositorioPersona.obtenerPersonas();
    }

    @Override
    public void eliminarPersonaPorId(int id) {
        repositorioPersona.eliminarPersonaPorId(id);
    }
}
