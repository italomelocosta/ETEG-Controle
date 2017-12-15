/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.modelo;

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
@Table(name = "medicamento")
public class Medicamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idMedicamento")
    private Long idMedicamento;

    @Column(name = "nome")
    private String nome;

    @Column(name = "estoque")
    private int estoque;

    @ManyToMany
    @JoinTable(name = "medicamento_has_prescricao", joinColumns = {
        @JoinColumn(name = "medicamento_idMedicamento", referencedColumnName = "idMedicamento")}, inverseJoinColumns = {
        @JoinColumn(name = "prescricao_idPrescricao", referencedColumnName = "idPrescricao")})
    private Set<Prescricao> prescricaoSet = new HashSet<Prescricao>();

    @OneToMany(mappedBy = "dispensacao")
    private Set<Dispensacao> dispensacaoSet = new HashSet<Dispensacao>();

    public Medicamento() {
    }

    public Medicamento(Long idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public Medicamento(Long idMedicamento, String nome, int estoque) {
        this.idMedicamento = idMedicamento;
        this.nome = nome;
        this.estoque = estoque;
    }

    public Long getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(Long idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Set<Prescricao> getPrescricaoSet() {
        return prescricaoSet;
    }

    public void setPrescricaoSet(Set<Prescricao> prescricaoSet) {
        this.prescricaoSet = prescricaoSet;
    }

    public Set<Dispensacao> getDispensacaoSet() {
        return dispensacaoSet;
    }

    public void setDispensacaoSet(Set<Dispensacao> dispensacaoSet) {
        this.dispensacaoSet = dispensacaoSet;
    }

}
