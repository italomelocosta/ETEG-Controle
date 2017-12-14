/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.Servico;

import com.eteg.DAO.PacienteDAO;
import com.eteg.modelo.Paciente;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pacienteServico")
public class PacienteServicoImplentacao implements PacienteServico {
    
    @Autowired
    private PacienteDAO pacienteDAO;
    
    @Override
    public Paciente findByIdPaciente(Long id) {
        return pacienteDAO.findOne(id);
    }

    @Override
    public List<Paciente> findAllPacientes() {
       return pacienteDAO.findAll();
    }

    @Override
    @Transactional
    public void save(Paciente paciente) {
        pacienteDAO.save(paciente);
    }

    @Override
    public void delete(Long id) {
        pacienteDAO.delete(id);
    }
    
}
