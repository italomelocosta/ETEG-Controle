/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novo.eteg.italoeteg.service;

import com.novo.eteg.italoeteg.model.Medicamento;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Italo
 */
public interface MedicamentoService extends CrudRepository<Medicamento, Long>{
    
}
