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
@Table(name = "medico")
public class Medico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMedico")
    private Long idMedico;
    
    @Column(name = "nome")
    private String nome;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medico")
    private Collection<Prescricao> prescricaoCollection;

    public Medico() {
    }

    public Medico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public Medico(Long idMedico, String nome) {
        this.idMedico = idMedico;
        this.nome = nome;
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Prescricao> getPrescricaoCollection() {
        return prescricaoCollection;
    }

    public void setPrescricaoCollection(Collection<Prescricao> prescricaoCollection) {
        this.prescricaoCollection = prescricaoCollection;
    }
    
}
