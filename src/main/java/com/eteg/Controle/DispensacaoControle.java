/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.Controle;

import com.eteg.Servico.DispensacaoServico;
import com.eteg.modelo.Dispensacao;
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

public class DispensacaoControle {

    @Autowired
    private DispensacaoServico dispensacaoServico;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getMedicamentos() {
        return new ResponseEntity(dispensacaoServico.findAllDispensacoes(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getMedicamentoById(@PathVariable Long id) {
        Dispensacao dispensacao = dispensacaoServico.findByIDispensacao(id);
        return new ResponseEntity(dispensacao, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity save(Dispensacao dispensacao) {
        dispensacaoServico.save(dispensacao);
        return new ResponseEntity(dispensacao, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id) {
        dispensacaoServico.delete(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
}
