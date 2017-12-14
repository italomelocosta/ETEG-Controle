/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.Servico;

import com.eteg.modelo.Prescricao;
import java.util.List;

/**
 *
 * @author Italo
 */
public interface PrescricaoServico {
    
    Prescricao findbyPrescricao(Long id);
    
    List<Prescricao> findAllPrescricoes();
    
    void save(Prescricao prescricao);
    
    void delete(Long id);
}
