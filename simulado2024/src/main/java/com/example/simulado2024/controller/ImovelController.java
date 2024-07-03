package com.example.simulado2024.controller;

import com.example.simulado2024.entity.Imovel;
import com.example.simulado2024.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Imovel")
public class ImovelController {
@Autowired
ImovelService imovelService;

@PostMapping("/cadastrar")
    public Imovel cadastrarImovel(@RequestBody Imovel imovel) {
    return imovelService.salvarImovel(imovel);
}

@GetMapping("/buscar")
    public Imovel buscarImovel(@RequestParam Long id) {
return imovelService.buscarImovelPorId(id);

}

@PostMapping("/atualizar")
    public Imovel atualizarImovel(@RequestBody Imovel imovel) {
    return imovelService.atualizarImovel(imovel);
}
@DeleteMapping("/deletar")
    public void deletarImovel(@RequestParam Long id) {
    imovelService.excluirImovel(id);
}



}
