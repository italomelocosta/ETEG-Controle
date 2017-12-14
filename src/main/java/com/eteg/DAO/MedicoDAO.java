/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.DAO;

import com.eteg.modelo.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Italo
 */
public interface MedicoDAO extends JpaRepository<Medico, Long> {
    
}
