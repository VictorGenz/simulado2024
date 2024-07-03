package com.example.simulado2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Proprietario {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@Size(min = 3, message = "O nome deve conter no minimo 3 caracteres")
private String nome;
private String cpf;
@Email(message = "O Email cadastrado deve ser um email valido")
private String email;
private String telefone;
private String endereco;
@Past
private LocalDate dataNascimento;
private LocalDate dataCadastro;
@OneToMany(mappedBy = "proprietario")
private List<Imovel> imovels;
}
