package com.comunication.restapi.service;

import com.comunication.restapi.persistence.TiposServicio;
import com.comunication.restapi.persistence.TiposServicioRepository;
import jakarta.persistence.Tuple;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TiposServicioService {
    TiposServicioRepository repository;

    public TiposServicioService(TiposServicioRepository repository) {
        this.repository = repository;
    }

    public List<TiposServicio> getAll(){
        return this.repository.findAll();
    }

    public TiposServicio getByID(Long id){
        return this.repository.findById(id).get();
    }

    public TiposServicio add(TiposServicio tiposServicio){
        return this.repository.save(tiposServicio);
    }

    public TiposServicio update(Long id, TiposServicio tiposServicio){
        Optional<TiposServicio> tipo = this.repository.findById(id);
        if (tipo.isPresent()){
            tipo.get().setTipoServicio(tiposServicio.getTipoServicio());
            return this.repository.save(tipo.get());
        }
        throw new RuntimeException();
    }

    public void delete(Long id){
        this.repository.deleteById(id);
    }
}
