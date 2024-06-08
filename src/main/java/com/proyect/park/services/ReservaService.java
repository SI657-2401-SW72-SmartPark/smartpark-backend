package com.proyect.park.services;

import com.proyect.park.models.dto.ReservaDto;
import com.proyect.park.models.request.ReservaRequest;

import java.util.List;
import java.util.Optional;

public interface ReservaService {

    List<ReservaDto> obtener();

    Optional<ReservaDto> encontrar(Long id);

    ReservaDto guardar(ReservaDto reserva, Long id);

    Optional<ReservaDto> actualizar(ReservaRequest reserva, Long id);

    void eliminar(Long id);

}
