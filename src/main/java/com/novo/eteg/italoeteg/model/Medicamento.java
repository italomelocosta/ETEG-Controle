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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Italo
 */
@Entity
@Table(name = "medicamento")
public class Medicamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMedicamento")
    private Long idMedicamento;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "estoque")
    private int estoque;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medicamento")
    private Collection<Prescricao> prescricaoCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medicamento")
    private Collection<Dispensacao> dispensacaoCollection;

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

    public Collection<Prescricao> getPrescricaoCollection() {
        return prescricaoCollection;
    }

    public void setPrescricaoCollection(Collection<Prescricao> prescricaoCollection) {
        this.prescricaoCollection = prescricaoCollection;
    }

    public Collection<Dispensacao> getDispensacaoCollection() {
        return dispensacaoCollection;
    }

    public void setDispensacaoCollection(Collection<Dispensacao> dispensacaoCollection) {
        this.dispensacaoCollection = dispensacaoCollection;
    }
    
}
