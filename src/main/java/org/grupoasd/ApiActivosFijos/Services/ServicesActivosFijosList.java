package org.grupoasd.ApiActivosFijos.Services;

import org.grupoasd.ApiActivosFijos.Entities.ActivosFijos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ServicesActivosFijosList {
    private ArrayList<ActivosFijos> activosFijos;
    private ActivosFijos activoFijo1 = new ActivosFijos("Computador", "computador", "Oficina", 1233, 123, 56, 85, 89, 45, 1200000, "16/09/20522");
    private ActivosFijos activoFijo2 = new ActivosFijos("Mesa", "Mesa", "Oficina", 1233, 123, 56, 85, 89, 45, 1200000, "16/09/20522");

    public ServicesActivosFijosList(){
        this.activosFijos=new ArrayList<>();
        this.activosFijos.add(activoFijo1);
        this.activosFijos.add(activoFijo2);
    }

    public ActivosFijos getActivosFijos(String nameActivo) throws Exception{
        for(ActivosFijos activosFijos: this.activosFijos){
            if(activosFijos.getNombreActivo().equals(nameActivo)){
                return activosFijos;
            }
        }
        throw new Exception("Activo no existente");
    }
    public String setActivosFijos(ActivosFijos activosFijos_parameter) throws Exception {
        try{
            //Consulta la existencia del activo
            getActivosFijos(activosFijos_parameter.getNombreActivo());
        }
        catch (Exception e){
            //Crea el activo
            this.activosFijos.add(activosFijos_parameter);
            return "Creacion del activo exitoso";
        }
        //Error si el activo ya existe
        throw  new Exception("Activo existennte");
    }

    public ActivosFijos updateActivosFijosAll(ActivosFijos activosFijos_update, String id) throws Exception {
        try {
            ActivosFijos activosFijos_bd = getActivosFijos(id);

            activosFijos_bd.setNombreActivo(activosFijos_update.getNombreActivo());
            activosFijos_bd.setDescripcionActivo(activosFijos_update.getDescripcionActivo());
            activosFijos_bd.setTipoActivo(activosFijos_update.getTipoActivo());
            activosFijos_bd.setSerialActivo(activosFijos_update.getSerialActivo());
            activosFijos_bd.setNumeroInternoInventario(activosFijos_update.getNumeroInternoInventario());
            activosFijos_bd.setPeso(activosFijos_update.getPeso());
            activosFijos_bd.setAlto(activosFijos_update.getAlto());
            activosFijos_bd.setAncho(activosFijos_update.getAncho());
            activosFijos_bd.setLargo(activosFijos_update.getLargo());
            activosFijos_bd.setValorCompra(activosFijos_update.getValorCompra());
            activosFijos_bd.setFechaCompra(activosFijos_update.getFechaCompra());



            return activosFijos_bd;
        } catch (Exception e) {
            throw new Exception("Activo NO existe, fallo actualización de datos");
        }
    }
    public String deleteActivoFijo(String id) throws Exception {
        try {
            ActivosFijos activosFijos = getActivosFijos(id);

            this.activosFijos.remove(activosFijos);

            return "Eliminado exitoso";
        } catch (Exception e) {
            throw new Exception("Activo NO Existe para Eliminar");
        }
    }

    public void setActivosFijos(ArrayList<ActivosFijos> activosFijos) {

        this.activosFijos = activosFijos;
    }


    public ArrayList<ActivosFijos> getActivosFijos() {
        return activosFijos;
    }
}
