/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Italo
 */
@Entity
@Table(name = "prescricao")
public class Prescricao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPrescricao")
    private Long idPrescricao;
    
    
    @Column(name = "data")
    private String data;
    
    @ManyToMany
    @JoinTable(name = "medicamento_has_prescricao", joinColumns = @JoinColumn(name = "prescricao_idprescricao", referencedColumnName = "idprescricao"),
            inverseJoinColumns = @JoinColumn(name = "medicamento_idmedicamento", referencedColumnName = "idmedicamento"))
    private Set<Medicamento> medicamentoSet = new HashSet<Medicamento>();
    
    @JoinColumn(name = "Paciente_idPaciente")
    @ManyToOne
    @JsonBackReference
    private Paciente pacienteidPaciente;
    
    @JoinColumn(name = "Medico_idMedico")
    @ManyToOne
    @JsonBackReference
    private Medico medicoidMedico;
    
    @OneToMany(mappedBy = "dispensacao")
    private Set<Dispensacao> dispensacaoSet = new HashSet<Dispensacao>();

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

    public Set<Medicamento> getMedicamentoSet() {
        return medicamentoSet;
    }

    public void setMedicamentoSet(Set<Medicamento> medicamentoSet) {
        this.medicamentoSet = medicamentoSet;
    }

    public Paciente getPacienteidPaciente() {
        return pacienteidPaciente;
    }

    public void setPacienteidPaciente(Paciente pacienteidPaciente) {
        this.pacienteidPaciente = pacienteidPaciente;
    }

    public Medico getMedicoidMedico() {
        return medicoidMedico;
    }

    public void setMedicoidMedico(Medico medicoidMedico) {
        this.medicoidMedico = medicoidMedico;
    }

    public Set<Dispensacao> getDispensacaoSet() {
        return dispensacaoSet;
    }

    public void setDispensacaoSet(Set<Dispensacao> dispensacaoSet) {
        this.dispensacaoSet = dispensacaoSet;
    }
    
}