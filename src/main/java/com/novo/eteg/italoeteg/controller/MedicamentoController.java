/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novo.eteg.italoeteg.controller;

import com.novo.eteg.italoeteg.model.Medicamento;
import com.novo.eteg.italoeteg.service.MedicamentoService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Italo
 */
@RestController
@RequestMapping("/medicamento")
public class MedicamentoController {
    
    @Autowired
    private MedicamentoService medicamentoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getMedicamentoById(@PathVariable Long id) {
        Medicamento medicamento = medicamentoService.findOne(id);
        return new ResponseEntity(medicamento, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Medicamento>> getMedicamentos() {
        return new ResponseEntity(medicamentoService.findAll(), HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity save(Medicamento medicamento) {
        medicamentoService.save(medicamento);
        return new ResponseEntity(medicamento, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id) {
        medicamentoService.delete(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
}
