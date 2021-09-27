package com.santander.cadastro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CadastroDTO {

   private String id;
   private String firstname;
   private String lastname;
   private String sex;
   private String office;
   private String dateofbirth;
   private String address;
   private String number;
   private String district;
   private String city;
   private String state;
   private String zip;


   public CadastroDTO(Cadastro cadastro){

      this.firstname = cadastro.getNome();
      this.lastname  = cadastro.getSobreNome();
      this.sex = cadastro.getSexo();
      this.office = cadastro.getCargo();
      this.dateofbirth = cadastro.getDNascimento();
      this.address = cadastro.getEndereco().getLogradouro();
      this.number = cadastro.getEndereco().getNumero();
      this.district = cadastro.getEndereco().getBairro();
      this.city = cadastro.getEndereco().getCidade();
      this.state = cadastro.getEndereco().getEstado();
      this.zip = cadastro.getEndereco().getCep();



   }
}


