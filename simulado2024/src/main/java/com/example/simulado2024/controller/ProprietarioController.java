package com.example.simulado2024.controller;

import com.example.simulado2024.entity.Proprietario;
import com.example.simulado2024.service.ProprietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Proprietario")
public class ProprietarioController {
    @Autowired
    ProprietarioService proprietarioService;

    @PostMapping("/cadastrar")
    public Proprietario cadastrarProprietario(@RequestBody Proprietario proprietario) {
        return proprietarioService.salvarProprietario(proprietario);
    }
    @GetMapping("/bucar")
    public Proprietario buscarProprietario(@RequestParam Long id) {
        return proprietarioService.buscarProprietarioPorId(id);
    }

    @DeleteMapping("/deletar")
    public void deletarProprietario(@RequestParam Long id) {
        proprietarioService.excluirProprietarioPorId(id);
    }

    @PostMapping("/atualizar")
    public void atualizarProprietario(@RequestBody Proprietario proprietario) {
        proprietarioService.atualizarProprietario(proprietario);
    }

}
