/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.Servico;

import com.eteg.modelo.Medicamento;
import com.eteg.DAO.MedicamentoDAO;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service("medicamentoServico")
public class MedicamentoServicoImplementacao implements MedicamentoServico {

    private MedicamentoDAO medicamentoDAO;
    
    @Override
    public Medicamento findByIdMedicamento(Long id) {
        return medicamentoDAO.findOne(id);
    }

    @Override
    public List<Medicamento> findAllMedicamentos() {
        return medicamentoDAO.findAll();
    }

    @Override
    @Transactional
    public void save(Medicamento medicamento) {
        medicamentoDAO.save(medicamento);
    }

    @Override
    public void delete(Long id) {
        medicamentoDAO.delete(id);
    }
    
}
