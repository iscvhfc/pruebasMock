package org.vhfc.appmockito.ejemplos.services;

import org.vhfc.appmockito.ejemplos.model.Examen;

public interface ExamenService {
    Examen findExamenPorNombre(String nombre);
}
