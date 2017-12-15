/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novo.eteg.italoeteg.service;

import com.novo.eteg.italoeteg.model.Dispensacao;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Italo
 */
public interface DispensacaoService extends CrudRepository<Dispensacao, Long> {

}
