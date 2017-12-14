/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.Servico;

import com.eteg.modelo.Medicamento;
import java.util.List;

/**
 *
 * @author Italo
 */
public interface MedicamentoServico {
    
    Medicamento findByIdMedicamento(Long id);

    List<Medicamento> findAllMedicamentos();

    void save(Medicamento medicamento);

    void delete(Long id);
}
