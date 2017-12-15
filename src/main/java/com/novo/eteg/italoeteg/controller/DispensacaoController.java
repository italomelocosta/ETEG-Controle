/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novo.eteg.italoeteg.controller;

import com.novo.eteg.italoeteg.model.Dispensacao;
import com.novo.eteg.italoeteg.service.DispensacaoService;
import java.util.Collection;
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
@RequestMapping("/dispensacao")
public class DispensacaoController {

    @Autowired
    private DispensacaoService dispensacaoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getDispensacaoById(@PathVariable Long id) {
        Dispensacao dispensacao = dispensacaoService.findOne(id);
        return new ResponseEntity(dispensacao, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Dispensacao>> getDispensacoes() {
        return new ResponseEntity(dispensacaoService.findAll(), HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity save(Dispensacao dispensacao) {
        dispensacaoService.save(dispensacao);
        return new ResponseEntity(dispensacao, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id) {
        dispensacaoService.delete(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
}
