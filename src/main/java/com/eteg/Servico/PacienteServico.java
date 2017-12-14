/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.Servico;

import com.eteg.modelo.Paciente;
import java.util.List;

/**
 *
 * @author Italo
 */
public interface PacienteServico {
    
    Paciente findByIdPaciente(Long id);
    
    List<Paciente> findAllPacientes();
    
    void save(Paciente paciente);
    
    void delete(Long id);
}
