/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.Controle;

import com.eteg.Servico.MedicoServico;
import com.eteg.modelo.Medico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medico")
public class MedicoControle {

    @Autowired
    private MedicoServico medicoServico;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getMedicos() {
        return new ResponseEntity(medicoServico.findAllMedicos(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getMedicoById(@PathVariable Long id) {
        Medico medico = medicoServico.findByIDMedico(id);
        return new ResponseEntity(medico, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity save(Medico medico) {
        medicoServico.save(medico);
        return new ResponseEntity(medico, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id) {
        medicoServico.delete(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }

}
