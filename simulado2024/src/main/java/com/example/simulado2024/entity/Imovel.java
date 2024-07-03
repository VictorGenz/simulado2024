package com.example.simulado2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Imovel {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
@Size(min= 10, message = "O endereço deve conter no minimo 10 caracteres")
private String endereco;
private tipo tipo;
@Size(min= 0, message = "O imóvel deve ter o tamanho maior que 0")
private double tamanho;
@Size(min =0, message = "O número de quartos deve ser maior ou igual a 0")
private int numQuartos;
@Size(min = 0, message = "O número de banheiros deve ser maior ou igual a 0")
private int numBanheiros;
@Size(min=0, message = "O valor do imóvel deve ser maior que 0")
private double valor;
private LocalDate dataDeCadastro;
@ManyToOne
private Proprietario proprietario;


}
