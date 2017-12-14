/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.Controle;
import com.eteg.Servico.MedicamentoServico;
import com.eteg.modelo.Medicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author Italo
 */
@RestController
@RequestMapping("/medicamento")
public class MedicamentoControle {
    
    @Autowired
    private MedicamentoServico medicamentoServico;
    
    

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getMedicamentos() {
        return new ResponseEntity(medicamentoServico.findAllMedicamentos(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getMedicamentoById(@PathVariable Long id) {
        Medicamento medicamento = medicamentoServico.findByIdMedicamento(id);
        return new ResponseEntity(medicamento, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity save(Medicamento medicamento) {
        medicamentoServico.save(medicamento);
        return new ResponseEntity(medicamento, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id) {
        medicamentoServico.delete(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
}
