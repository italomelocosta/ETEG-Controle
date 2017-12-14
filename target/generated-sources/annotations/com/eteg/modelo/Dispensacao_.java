package com.eteg.modelo;

import com.eteg.modelo.Medicamento;
import com.eteg.modelo.Prescricao;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-14T15:42:12")
@StaticMetamodel(Dispensacao.class)
public class Dispensacao_ { 

    public static volatile SingularAttribute<Dispensacao, Integer> idDiespensacao;
    public static volatile SingularAttribute<Dispensacao, String> data;
    public static volatile SingularAttribute<Dispensacao, Prescricao> prescricaoidPrescricao;
    public static volatile SingularAttribute<Dispensacao, Medicamento> medicamentoidMedicamento;

}