/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novo.eteg.italoeteg.service;

import com.novo.eteg.italoeteg.model.Paciente;
import java.io.Serializable;
import java.util.Collection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Italo
 */
@Repository
public interface PacienteService extends CrudRepository<Paciente, Long> {
  
}
