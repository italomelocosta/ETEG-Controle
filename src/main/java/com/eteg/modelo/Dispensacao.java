/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Italo
 */
@Entity
@Table(name = "dispensacao")
public class Dispensacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDiespensacao")
    private Long idDiespensacao;
    
    @Column(name = "data")
    private String data;
    
    @ManyToOne
    @JoinColumn(name = "Prescricao_idPrescricao")
    @JsonBackReference
    private Prescricao prescricaoidPrescricao;
    
    @ManyToOne
    @JoinColumn(name = "Medicamento_idMedicamento")
    @JsonBackReference
    private Medicamento medicamentoidMedicamento;

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

    public Prescricao getPrescricaoidPrescricao() {
        return prescricaoidPrescricao;
    }

    public void setPrescricaoidPrescricao(Prescricao prescricaoidPrescricao) {
        this.prescricaoidPrescricao = prescricaoidPrescricao;
    }

    public Medicamento getMedicamentoidMedicamento() {
        return medicamentoidMedicamento;
    }

    public void setMedicamentoidMedicamento(Medicamento medicamentoidMedicamento) {
        this.medicamentoidMedicamento = medicamentoidMedicamento;
    }
    
}
