package com.ruizchiroque.denunciaservice.service;

import java.util.List;

import com.ruizchiroque.denunciaservice.entity.Denuncia;

public interface DenunciaService {
    List<Denuncia> getAll();
    Denuncia get(Integer id);
    Denuncia create(Denuncia denuncia);
    Denuncia update(Denuncia denuncia);
    void delete(Integer id);
    List<Denuncia> getByDni(String dni);
}
