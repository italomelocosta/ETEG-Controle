package com.eteg.modelo;

import com.eteg.modelo.Prescricao;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-14T14:59:12")
@StaticMetamodel(Medico.class)
public class Medico_ { 

    public static volatile SingularAttribute<Medico, Integer> idMedico;
    public static volatile SingularAttribute<Medico, String> nome;
    public static volatile ListAttribute<Medico, Prescricao> prescricaoList;

}