package org.grupoasd.ApiActivosFijos.Services;

import org.grupoasd.ApiActivosFijos.Entities.ActivosFijos;
import org.grupoasd.ApiActivosFijos.Repository.ActivosFijosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServicesActivosFijos implements ServiceActivosFijosInterface{
    @Autowired
    private ActivosFijosRepositorio repositorio;


    @Override
    public List<ActivosFijos> getActivosFijos() {
        return repositorio.findAll();
    }

    @Override
    public ActivosFijos getActivoFijo(String id) throws Exception {
        Optional<ActivosFijos> activosFijosBD = repositorio.findById(id);
        if(activosFijosBD.isPresent()){
            return activosFijosBD.get();
        }
        throw new Exception("Activo no existe");
    }

    @Override
    public String setActivoFijo(ActivosFijos activoFijo_parametro) {
        repositorio.save(activoFijo_parametro);
        return "Activo creado exitosamente";
    }

    @Override
    public ActivosFijos updateActivosFijosAll(ActivosFijos activosFijos_update, String id) {
        repositorio.deleteById(id);
        repositorio.save(activosFijos_update);
        return null;
    }

    @Override
    public String deleteActivoFijo(String id) {
        repositorio.deleteById(id);
        return "Activo eliminado";
    }
}
