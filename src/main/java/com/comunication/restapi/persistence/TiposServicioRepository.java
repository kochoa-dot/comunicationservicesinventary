package com.comunication.restapi.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiposServicioRepository extends JpaRepository<TiposServicio,Long> {

}
