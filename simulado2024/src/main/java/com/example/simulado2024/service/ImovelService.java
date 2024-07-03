package com.example.simulado2024.service;

import com.example.simulado2024.entity.Imovel;
import com.example.simulado2024.repository.ImovelRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImovelService {
@Autowired
ImovelRepositry imovelRepositry;


public Imovel salvarImovel(Imovel imovel) {
    return imovelRepositry.save(imovel);
}
public Imovel buscarImovelPorId(Long id) {
    return imovelRepositry.findById(id).orElse(null);
}
public void excluirImovel(Long id) {
    imovelRepositry.deleteById(id);
}
public Imovel atualizarImovel(Imovel imovel) {
    return imovelRepositry.save(imovel);
}

}
