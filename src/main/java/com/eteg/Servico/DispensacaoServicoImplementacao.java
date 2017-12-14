/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.Servico;

import com.eteg.modelo.Dispensacao;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dispensacaoServico")
public class DispensacaoServicoImplementacao implements DispensacaoServico {

    @Autowired
    private DispensacaoServico dispensacaoServico;
    
    @Override
    public Dispensacao findByIDispensacao(Long id) {
        return dispensacaoServico.findByIDispensacao(id);
    }

    @Override
    public List<Dispensacao> findAllDispensacoes() {
        return dispensacaoServico.findAllDispensacoes();
    }

    @Override
    @Transactional
    public void save(Dispensacao dispensacao) {
        dispensacaoServico.save(dispensacao);
    }

    @Override
    public void delete(Long id) {
        dispensacaoServico.delete(id);
    }
    
}
