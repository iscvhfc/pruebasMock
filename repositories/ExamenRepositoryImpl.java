package org.vhfc.appmockito.ejemplos.repositories;

import org.vhfc.appmockito.ejemplos.model.Examen;


import java.util.Arrays;
import java.util.List;

public class ExamenRepositoryImpl implements ExamenRepository{
    @Override
    public List<Examen> findAll() {
        return Arrays.asList(new Examen(5L, "Matematicas"), new Examen(6L,"Programacion"),
                new Examen (7L, "Historia"));
    }
}
