/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novo.eteg.italoeteg.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Italo
 */
@Entity
@Table(name = "dispensacao")
public class Dispensacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDiespensacao")
    private Long idDiespensacao;
    
    @Column(name = "data")
    private String data;
    
    @JoinColumn(name = "Prescricao_idPrescricao", referencedColumnName = "idPrescricao")
    private Prescricao prescricao;
    
    @JoinColumn(name = "Medicamento_idMedicamento", referencedColumnName = "idMedicamento")
    private Medicamento medicamento;

    public Dispensacao() {
    }

    public Dispensacao(Long idDiespensacao) {
        this.idDiespensacao = idDiespensacao;
    }

    public Dispensacao(Long idDiespensacao, String data) {
        this.idDiespensacao = idDiespensacao;
        this.data = data;
    }

    public Long getIdDiespensacao() {
        return idDiespensacao;
    }

    public void setIdDiespensacao(Long idDiespensacao) {
        this.idDiespensacao = idDiespensacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Prescricao getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(Prescricao prescricao) {
        this.prescricao = prescricao;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    
}
