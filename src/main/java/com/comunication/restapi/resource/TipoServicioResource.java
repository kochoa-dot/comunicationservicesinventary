package com.comunication.restapi.resource;

import com.comunication.restapi.persistence.TiposServicio;
import com.comunication.restapi.persistence.TiposServicioRepository;
import com.comunication.restapi.service.TiposServicioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TipoServicioResource {
    TiposServicioService service;

    public TipoServicioResource(TiposServicioService service) {
        this.service = service;
    }

    @GetMapping(value = "/tipoServicios")
    public List<TiposServicio> getAll(){
        return this.service.getAll();
    }
    @GetMapping(value = "/tipoServicios/{id} ")
    public TiposServicio getById(@PathVariable Long id){
        return this.service.getByID(id);
    }
    @PostMapping(value = "/tipoServicios")
    public TiposServicio add(TiposServicio tiposServicio){
        return this.service.add(tiposServicio);
    }
    @PutMapping(value = "/tiposServicios/{id}", consumes = "application/json")
    public TiposServicio update(@PathVariable Long id,@RequestBody TiposServicio tiposServicio){
        return this.service.update(id,tiposServicio);
    }

    @DeleteMapping(value = "/tiposServicios/{id}")
    public void delete(@PathVariable Long id){
        this.service.delete(id);
    }
}
