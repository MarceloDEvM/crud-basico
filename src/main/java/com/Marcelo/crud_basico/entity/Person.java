package com.Marcelo.crud_basico.entity;

import jakarta.persistence.*;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_pessoa")
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_pessoa", nullable = false)
    @Setter(AccessLevel.NONE)
    private Long cd_people;

    @Column(name = "nm_pessoa", nullable = false)
    private String nome_pessoa;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "idade", nullable = false)
    private Integer idade;
}
