/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.Servico;

import com.eteg.modelo.Dispensacao;
import java.util.List;

/**
 *
 * @author Italo
 */
public interface DispensacaoServico {
    
    Dispensacao findByIDispensacao(Long id);
    
    List<Dispensacao> findAllDispensacoes();
    
    void save(Dispensacao dispensacao);
    
    void delete(Long id);
}
