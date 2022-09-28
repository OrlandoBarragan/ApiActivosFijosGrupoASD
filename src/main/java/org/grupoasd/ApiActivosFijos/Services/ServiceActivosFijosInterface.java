package org.grupoasd.ApiActivosFijos.Services;

import org.grupoasd.ApiActivosFijos.Entities.ActivosFijos;

import java.util.List;

public interface ServiceActivosFijosInterface {
    public List<ActivosFijos> getActivosFijos();
    public ActivosFijos getActivoFijo(String id) throws Exception;
    public String setActivoFijo (ActivosFijos activoFijo_parametro);
    public ActivosFijos updateActivosFijosAll(ActivosFijos activosFijos_update, String id) throws Exception;
    public String deleteActivoFijo(String id);

}
