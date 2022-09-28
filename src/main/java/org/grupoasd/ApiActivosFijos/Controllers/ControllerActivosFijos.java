package org.grupoasd.ApiActivosFijos.Controllers;

import org.grupoasd.ApiActivosFijos.Entities.ActivosFijos;
import org.grupoasd.ApiActivosFijos.Entities.ObjectResponse;
import org.grupoasd.ApiActivosFijos.Services.ServiceActivosFijosInterface;
import org.grupoasd.ApiActivosFijos.Services.ServicesActivosFijos;
import org.grupoasd.ApiActivosFijos.Services.ServicesActivosFijosList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerActivosFijos {
    @Autowired
    private ServiceActivosFijosInterface servicesActivosFijos;
    //private ServicesActivosFijosList servicesActivosFijos = new ServicesActivosFijosList();

    @GetMapping("/activosFijos")
    public ResponseEntity<List<ActivosFijos>>  getActivosFijosController(){
        return new ResponseEntity<>(servicesActivosFijos.getActivosFijos(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/activoFijo")
    public ResponseEntity<Object> getActivoFijoController(@RequestParam String id) {
        try {
            ActivosFijos activosFijos = servicesActivosFijos.getActivoFijo(id);
            return new ResponseEntity<>(activosFijos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/activoFijo/{id}")
    public ResponseEntity<Object> getActivoFijoPathController(@PathVariable String id) {
        try {
            ActivosFijos activosFijos = servicesActivosFijos.getActivoFijo(id);
            return new ResponseEntity<>(activosFijos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/activoFijo")
    public ResponseEntity<String> postActivosFijosController(@RequestBody ActivosFijos activoFijo_parametro) {
        try {
            String mensaje = servicesActivosFijos.setActivoFijo (activoFijo_parametro);
            return new ResponseEntity<>(mensaje, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/activoFijo/{id}")
    public ResponseEntity<ObjectResponse> putActivoFijoController(@RequestBody ActivosFijos activosFijos_update, @PathVariable String id) {
        try {
            ActivosFijos activosFijos_bd = servicesActivosFijos.updateActivosFijosAll(activosFijos_update, id);
            return new ResponseEntity<>(new ObjectResponse("Registro de actualizacion exitoso", activosFijos_bd), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new ObjectResponse(e.getMessage(), null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/activoFijo/{id}")
    public ResponseEntity<ObjectResponse> deleteActivoFijoController(@PathVariable String id) {

        try {
            String mensaje = servicesActivosFijos.deleteActivoFijo(id);

            return new ResponseEntity<>(new ObjectResponse(mensaje, null), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new ObjectResponse(e.getMessage(), null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
