/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novo.eteg.italoeteg.controller;

import com.novo.eteg.italoeteg.model.Medico;
import com.novo.eteg.italoeteg.service.MedicoService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.novo.eteg.italoeteg.service.PacienteService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Italo
 */
@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getMedicoById(@PathVariable Long id) {
        Medico medico = medicoService.findOne(id);
        return new ResponseEntity(medico, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Medico>> getMedicos() {
        return new ResponseEntity(medicoService.findAll(), HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity save(Medico medico) {
        medicoService.save(medico);
        return new ResponseEntity(medico, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id) {
        medicoService.delete(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
}
