package ar.utn.frba.dds.modelos.repositorios;

import ar.utn.frba.dds.modelos.entidades.geografia.Ciudad;

import java.util.List;

public class RepositorioCiudad extends Repositorio{
    public Ciudad buscarPorNombre(String nombre) {
        List<Ciudad> resultados = entityManager()
                .createQuery("from Ciudad t where t.nombre = :nombre", Ciudad.class)
                .setParameter("nombre", nombre)
                .getResultList();

        return resultados.isEmpty() ? null : resultados.get(0);
    }
}
