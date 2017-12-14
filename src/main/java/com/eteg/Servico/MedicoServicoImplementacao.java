/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.Servico;

import com.eteg.DAO.MedicoDAO;
import com.eteg.modelo.Medico;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("medicoServico")
public class MedicoServicoImplementacao implements MedicoServico {
    
    @Autowired
    private MedicoDAO medicoDAO;
    
    @Override
    public Medico findByIDMedico(Long id) {
        return medicoDAO.findOne(id);
    }

    @Override
    public List<Medico> findAllMedicos() {
        return medicoDAO.findAll();
    }

    @Override
    @Transactional
    public void save(Medico medico) {
        medicoDAO.save(medico);
    }

    @Override
    public void delete(Long id) {
        medicoDAO.delete(id);
    }
    
}
