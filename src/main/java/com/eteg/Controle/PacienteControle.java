/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.Controle;

import com.eteg.Servico.PacienteServico;
import com.eteg.modelo.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Italo
 */

@RestController
@RequestMapping("/paciente")

public class PacienteControle {
    
    @Autowired
    private PacienteServico pacienteServico;
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getMedicamentos() {
        return new ResponseEntity(pacienteServico.findAllPacientes(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getPacienteById(@PathVariable Long id) {
        Paciente paciente = pacienteServico.findByIdPaciente(id);
        return new ResponseEntity(paciente, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity save(Paciente paciente) {
        pacienteServico.save(paciente);
        return new ResponseEntity(paciente, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id) {
        pacienteServico.delete(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
}
