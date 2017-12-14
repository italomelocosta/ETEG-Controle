/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.Servico;

import com.eteg.DAO.DispensacaoDAO;
import com.eteg.modelo.Dispensacao;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service("dispensacaoServico")
public class DispensacaoServicoImplementacao implements DispensacaoServico {

    private DispensacaoDAO dispensacaoDAO;
    
    @Override
    public Dispensacao findByIDispensacao(Long id) {
        return dispensacaoDAO.findOne(id);
    }

    @Override
    public List<Dispensacao> listAllDispensacoes() {
        return dispensacaoDAO.findAll();
    }

    @Override
    @Transactional
    public void save(Dispensacao dispensacao) {
        dispensacaoDAO.save(dispensacao);
    }

    @Override
    public void delete(Long id) {
        dispensacaoDAO.delete(id);
    }
    
}
