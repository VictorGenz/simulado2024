package com.example.simulado2024.repository;

import com.example.simulado2024.entity.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImovelRepositry extends JpaRepository<Imovel, Long> {

}
