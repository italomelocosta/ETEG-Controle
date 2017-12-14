package com.eteg.modelo;

import com.eteg.modelo.Dispensacao;
import com.eteg.modelo.Medicamento;
import com.eteg.modelo.Medico;
import com.eteg.modelo.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-14T12:57:35")
@StaticMetamodel(Prescricao.class)
public class Prescricao_ { 

    public static volatile SingularAttribute<Prescricao, String> data;
    public static volatile SingularAttribute<Prescricao, Paciente> pacienteidPaciente;
    public static volatile SingularAttribute<Prescricao, Integer> idPrescricao;
    public static volatile SingularAttribute<Prescricao, Medico> medicoidMedico;
    public static volatile SingularAttribute<Prescricao, Medicamento> medicamentoidMedicamento;
    public static volatile ListAttribute<Prescricao, Dispensacao> dispensacaoList;

}