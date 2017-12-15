/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novo.eteg.italoeteg.controller;

import com.novo.eteg.italoeteg.model.Prescricao;
import com.novo.eteg.italoeteg.service.PrescricaoService;
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
@RequestMapping("/prescricao")
public class PrescricaoController {
    
    @Autowired
    private PrescricaoService prescricaoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getPrescricaoById(@PathVariable Long id) {
        Prescricao prescricao = prescricaoService.findOne(id);
        return new ResponseEntity(prescricao, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Prescricao>> getPrescricoes() {
        return new ResponseEntity(prescricaoService.findAll(), HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity save(Prescricao prescricao) {
        prescricaoService.save(prescricao);
        return new ResponseEntity(prescricao, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id) {
        prescricaoService.delete(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
}
