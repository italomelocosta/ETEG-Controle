package com.eteg.modelo;

import com.eteg.modelo.Dispensacao;
import com.eteg.modelo.Prescricao;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-14T15:42:12")
@StaticMetamodel(Medicamento.class)
public class Medicamento_ { 

    public static volatile SingularAttribute<Medicamento, Integer> idMedicamento;
    public static volatile SingularAttribute<Medicamento, Integer> estoque;
    public static volatile SingularAttribute<Medicamento, String> nome;
    public static volatile ListAttribute<Medicamento, Prescricao> prescricaoList;
    public static volatile ListAttribute<Medicamento, Dispensacao> dispensacaoList;

}