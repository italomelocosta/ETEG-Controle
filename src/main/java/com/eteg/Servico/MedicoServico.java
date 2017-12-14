/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.Servico;

import com.eteg.modelo.Medico;
import java.util.List;

/**
 *
 * @author Italo
 */
public interface MedicoServico {

    Medico findByIDMedico(Long id);

    List<Medico> findAllMedicos();

    void save(Medico medico);

    void delete(Long id);
}
