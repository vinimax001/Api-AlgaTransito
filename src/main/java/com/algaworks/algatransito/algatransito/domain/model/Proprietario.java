package com.algaworks.algatransito.algatransito.domain.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//@Table(name = "proprietario") deve ser especificado o nome caso classe e tabela tenham nomes diferentes
public class Proprietario {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    //@Column(name = "phone") deve ser especificado o nome caso coluna e propriedade tenham nomes diferentes
    private String phone;

}