package org.vhfc.appmockito.ejemplos.repositories;

import org.vhfc.appmockito.ejemplos.model.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();
}
