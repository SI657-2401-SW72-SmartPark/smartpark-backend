package com.proyect.park.repositories;

import com.proyect.park.models.entities.Estacionamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface EstacionamientoRepository extends JpaRepository<Estacionamiento,Long> {

    @Query("SELECT e FROM Estacionamiento e WHERE  e.estado = :estado"   )
     List<Estacionamiento> findEstacionamientoByEstado(boolean estado);
}
