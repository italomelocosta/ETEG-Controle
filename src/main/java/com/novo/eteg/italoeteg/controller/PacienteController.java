/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novo.eteg.italoeteg.controller;

import com.novo.eteg.italoeteg.model.Paciente;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.novo.eteg.italoeteg.service.PacienteService;
import org.springframework.http.MediaType;

/**
 *
 * @author Italo
 */
@RestController
@RequestMapping("/paciente")
public class PacienteController {
    
    @Autowired
    private PacienteService pacienteService;
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getPacienteById(@PathVariable Long id) {
        Paciente paciente = pacienteService.findOne(id);
        return new ResponseEntity(paciente, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Paciente>> getPacientes() {
        return new ResponseEntity(pacienteService.findAll(), HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity save(Paciente paciente) {
        pacienteService.save(paciente);
        return new ResponseEntity(paciente, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id) {
        pacienteService.delete(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
    
}
