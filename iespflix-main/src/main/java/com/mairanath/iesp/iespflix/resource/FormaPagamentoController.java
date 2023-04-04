package com.mairanath.iesp.iespflix.resource;

import com.mairanath.iesp.iespflix.model.FormaPagamento;
import com.mairanath.iesp.iespflix.service.FormaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/formadepagamento")
public class FormaPagamentoController {
    @Autowired
    private FormaPagamentoService service;

    @PostMapping
    public ResponseEntity<FormaPagamento> salvar(@RequestBody FormaPagamento formaPagamento){
        formaPagamento = service.salvar(formaPagamento);
        return ResponseEntity.ok(formaPagamento);
    }

    @PutMapping
    public ResponseEntity<FormaPagamento> alterar(@RequestBody FormaPagamento formaPagamento){
        formaPagamento = service.alterar(formaPagamento);
        return ResponseEntity.ok(formaPagamento);
    }

    @DeleteMapping
    public ResponseEntity<Boolean> excluir(@PathVariable("id") Integer id){
        if (service.excluir(id)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
