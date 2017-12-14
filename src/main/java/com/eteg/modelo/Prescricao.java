/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eteg.modelo;

import java.io.Serializable;
import java.util.List;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Italo
 */
@Entity
@Table(name = "prescricao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prescricao.findAll", query = "SELECT p FROM Prescricao p")
    , @NamedQuery(name = "Prescricao.findByIdPrescricao", query = "SELECT p FROM Prescricao p WHERE p.idPrescricao = :idPrescricao")
    , @NamedQuery(name = "Prescricao.findByData", query = "SELECT p FROM Prescricao p WHERE p.data = :data")})
public class Prescricao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPrescricao")
    private Long idPrescricao;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "data")
    private String data;
    
    @JoinColumn(name = "Paciente_idPaciente", referencedColumnName = "idPaciente")
    @ManyToOne(optional = false)
    private Paciente pacienteidPaciente;
    
    @JoinColumn(name = "Medicamento_idMedicamento", referencedColumnName = "idMedicamento")
    @ManyToOne(optional = false)
    private Medicamento medicamentoidMedicamento;
    
    @JoinColumn(name = "Medico_idMedico", referencedColumnName = "idMedico")
    @ManyToOne(optional = false)
    private Medico medicoidMedico;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prescricaoidPrescricao")
    private List<Dispensacao> dispensacaoList;

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

    public Paciente getPacienteidPaciente() {
        return pacienteidPaciente;
    }

    public void setPacienteidPaciente(Paciente pacienteidPaciente) {
        this.pacienteidPaciente = pacienteidPaciente;
    }

    public Medicamento getMedicamentoidMedicamento() {
        return medicamentoidMedicamento;
    }

    public void setMedicamentoidMedicamento(Medicamento medicamentoidMedicamento) {
        this.medicamentoidMedicamento = medicamentoidMedicamento;
    }

    public Medico getMedicoidMedico() {
        return medicoidMedico;
    }

    public void setMedicoidMedico(Medico medicoidMedico) {
        this.medicoidMedico = medicoidMedico;
    }

    @XmlTransient
    public List<Dispensacao> getDispensacaoList() {
        return dispensacaoList;
    }

    public void setDispensacaoList(List<Dispensacao> dispensacaoList) {
        this.dispensacaoList = dispensacaoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrescricao != null ? idPrescricao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prescricao)) {
            return false;
        }
        Prescricao other = (Prescricao) object;
        if ((this.idPrescricao == null && other.idPrescricao != null) || (this.idPrescricao != null && !this.idPrescricao.equals(other.idPrescricao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eteg.modelo.Prescricao[ idPrescricao=" + idPrescricao + " ]";
    }
    
}
