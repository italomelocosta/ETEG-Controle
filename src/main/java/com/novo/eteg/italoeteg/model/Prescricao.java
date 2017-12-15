/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novo.eteg.italoeteg.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Italo
 */
@Entity
@Table(name = "prescricao")
public class Prescricao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPrescricao")
    private Long idPrescricao;
    
    @Column(name = "data")
    private String data;
    
    @JoinColumn(name = "Paciente_idPaciente", referencedColumnName = "idPaciente")
    @ManyToOne(optional = false)
    private Paciente paciente;
    
    @JoinColumn(name = "Medico_idMedico", referencedColumnName = "idMedico")
    @ManyToOne(optional = false)
    private Medico medico;
    
    @JoinColumn(name = "medicamento_idMedicamento", referencedColumnName = "idMedicamento")
    @ManyToOne(optional = false)
    private Medicamento medicamento;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prescricao")
    private Collection<Dispensacao> dispensacaoCollection;

    public Prescricao() {
    }

    public Prescricao(Long idPrescricao) {
        this.idPrescricao = idPrescricao;
    }

    public Prescricao(Long idPrescricao, String data) {
        this.idPrescricao = idPrescricao;
        this.data = data;
    }

    public Long getIdPrescricao() {
        return idPrescricao;
    }

    public void setIdPrescricao(Long idPrescricao) {
        this.idPrescricao = idPrescricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Collection<Dispensacao> getDispensacaoCollection() {
        return dispensacaoCollection;
    }

    public void setDispensacaoCollection(Collection<Dispensacao> dispensacaoCollection) {
        this.dispensacaoCollection = dispensacaoCollection;
    }
    
}
