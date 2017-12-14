/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.Servico;

import com.eteg.DAO.PrescricaoDAO;
import com.eteg.modelo.Prescricao;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service("prescricaoServico")
public class PrescricaoServicoImplementacao implements PrescricaoServico {
    
    private PrescricaoDAO prescricaoDAO;
    
    @Override
    public Prescricao findbyPrescricao(Long id) {
        return prescricaoDAO.findOne(id);
    }

    @Override
    public List<Prescricao> findAllPrescricoes() {
        return prescricaoDAO.findAll();
    }

    @Override
    @Transactional
    public void save(Prescricao prescricao) {
        prescricaoDAO.save(prescricao);
    }

    @Override
    public void delete(Long id) {
        prescricaoDAO.delete(id);
    }
    
}
