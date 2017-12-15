/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Italo
 */
@Entity
@Table(name = "medico")
public class Medico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idMedico")
    private Long idMedico;
    
    @Column(name = "nome")
    private String nome;
    
    @OneToMany(mappedBy = "Prescricao")
    private Set<Prescricao> prescricaoSet = new HashSet<Prescricao>();

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

    public Set<Prescricao> getPrescricaoSet() {
        return prescricaoSet;
    }

    public void setPrescricaoSet(Set<Prescricao> prescricaoSet) {
        this.prescricaoSet = prescricaoSet;
    }
}
