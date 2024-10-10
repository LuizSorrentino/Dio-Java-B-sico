package com_academia.site;

import com_academia.site.model.Cliente;
import com_academia.site.model.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente alterar(@PathVariable("id") Integer id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        return clienteRepository.save(cliente);
    }

    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable("id") Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Cliente> listar(@RequestParam(value = "nome", required = false) String nome) {
        return (nome == null) ? clienteRepository.findAll() : clienteRepository.findByNome(nome);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Integer id) {
        clienteRepository.deleteById(id);
    }
}

