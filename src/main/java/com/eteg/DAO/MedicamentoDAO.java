package com.eteg.DAO;

import com.eteg.modelo.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MedicamentoDAO extends JpaRepository<Medicamento, Long> {

}
