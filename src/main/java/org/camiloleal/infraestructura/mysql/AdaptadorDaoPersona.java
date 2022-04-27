package org.camiloleal.infraestructura.mysql;

import lombok.AllArgsConstructor;
import org.camiloleal.dominio.modelo.Persona;
import org.camiloleal.dominio.repositorio.RepositorioPersona;
import org.camiloleal.aplicacion.convertidores.ConvertidorPersona;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class AdaptadorDaoPersona implements RepositorioPersona {

    private DaoPersona daoPersona;
    private ConvertidorPersona convertidorPersona;

    @Override
    public Persona obtenerPersonaPorId(int id) {
        return convertidorPersona.toPersona(daoPersona.findById(id).orElse(null));
    }

    @Override
    public Persona guardarPersona(Persona persona) {
        return convertidorPersona.toPersona(daoPersona.save(convertidorPersona.toEntidadPersona(persona)));
    }

    @Override
    public List<Persona> obtenerPersonas() {
        return daoPersona
                .findAll()
                .stream()
                .map(convertidorPersona::toPersona)
                .collect(Collectors.toList());
    }
    @Override
    public void eliminarPersonaPorId(int id) {
        daoPersona.deleteById(id);
    }
}
