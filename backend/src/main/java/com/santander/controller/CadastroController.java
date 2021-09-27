package com.santander.controller;

import com.santander.cadastro.model.CadastroDTO;
import com.santander.service.CadastroService;
import com.santander.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.santander.cadastro.model.Cadastro;

import java.util.ArrayList;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cadastro")

public class CadastroController {

    @Autowired
    CadastroService cadastroService;

    @Autowired
    EnderecoService enderecoService;


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CadastroDTO>> findAll(){
        List<Cadastro> cadastros = this.cadastroService.findAll();
        List<CadastroDTO> cadastroDTOS = cadastros.stream().map(c -> new CadastroDTO(c)).collect(Collectors.toList());
        return new ResponseEntity<>(cadastroDTOS, HttpStatus.OK);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping( produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cadastro> create(@RequestBody(required = true) CadastroDTO cadastroDTO){
    Cadastro cadastro = new Cadastro(cadastroDTO);
    this.enderecoService.create(cadastro.getEndereco());
      return new ResponseEntity<Cadastro>(this.cadastroService.create(cadastro), HttpStatus.CREATED);

    }

    @CrossOrigin(origins = "http://localhost:4200"  )
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cadastro> update(@RequestBody(required = true) CadastroDTO cadastroDTO){
        Cadastro cadastro = new Cadastro(cadastroDTO);
        this.enderecoService.create(cadastro.getEndereco());
        return new ResponseEntity<Cadastro>(this.cadastroService.create(cadastro), HttpStatus.OK);
   }

    @CrossOrigin(origins = "http://localhost:4200"  )
    @GetMapping(path = "/{nome}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CadastroDTO>> findByName(@PathVariable String nome){
        List<Cadastro> cadastros = this.cadastroService.findByName(nome);
        List<CadastroDTO> cadastroDTOS = cadastros.stream().map(c -> new CadastroDTO(c)).collect(Collectors.toList());
        return new ResponseEntity<>(cadastroDTOS, HttpStatus.OK);
    }



}
