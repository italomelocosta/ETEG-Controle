/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.modelo;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Italo
 */
@Entity
@Table(name = "dispensacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dispensacao.findAll", query = "SELECT d FROM Dispensacao d")
    , @NamedQuery(name = "Dispensacao.findByIdDiespensacao", query = "SELECT d FROM Dispensacao d WHERE d.idDiespensacao = :idDiespensacao")
    , @NamedQuery(name = "Dispensacao.findByData", query = "SELECT d FROM Dispensacao d WHERE d.data = :data")})
public class Dispensacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDiespensacao")
    private Long idDiespensacao;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "data")
    private String data;
    
    @JoinColumn(name = "Prescricao_idPrescricao", referencedColumnName = "idPrescricao")
    @ManyToOne(optional = false)
    private Prescricao prescricaoidPrescricao;
    
    @JoinColumn(name = "Medicamento_idMedicamento", referencedColumnName = "idMedicamento")
    @ManyToOne(optional = false)
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDiespensacao != null ? idDiespensacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dispensacao)) {
            return false;
        }
        Dispensacao other = (Dispensacao) object;
        if ((this.idDiespensacao == null && other.idDiespensacao != null) || (this.idDiespensacao != null && !this.idDiespensacao.equals(other.idDiespensacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eteg.modelo.Dispensacao[ idDiespensacao=" + idDiespensacao + " ]";
    }
    
}
