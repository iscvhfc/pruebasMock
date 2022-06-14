package org.vhfc.appmockito.ejemplos.services;

import org.vhfc.appmockito.ejemplos.model.Examen;
import org.vhfc.appmockito.ejemplos.repositories.ExamenRepository;


import java.util.Optional;

public class ExamenServiceImpl implements ExamenService {
private ExamenRepository examenRepository;
//constructor
    public ExamenServiceImpl(ExamenRepository examenRepository) {

        this.examenRepository = examenRepository;
    }

    @Override
    public Examen findExamenPorNombre(String nombre) {
        Optional<Examen> examenOptional=examenRepository.findAll()
                .stream()
                .filter(e-> e.getNombre().contains(nombre))
                .findFirst();
        Examen examen =null;
        if (examenOptional.isPresent()){
            examen = examenOptional.orElseThrow();
        }
        return examen;
    }
}
