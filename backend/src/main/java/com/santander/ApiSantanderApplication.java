package com.santander;

import com.santander.cadastro.model.Cadastro;
import com.santander.cadastro.model.Endereco;
import com.santander.repository.CadastroRepository;
import com.santander.repository.EnderecoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApiSantanderApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(ApiSantanderApplication.class, args);
        EnderecoRepository enderecoRepository =
                configurableApplicationContext.getBean(EnderecoRepository.class);

        CadastroRepository cadastroRepository =
                configurableApplicationContext.getBean(CadastroRepository.class);
        //Endereco endereco = new Endereco(1l,"Rua oridio", "12", "vila", 12, "sp", "SP");
        //enderecoRepository.save(endereco);

        //Cadastro cadastro = new Cadastro(1l,"Henrique", endereco,"Santos","Peao","20/01/1993");

    }


}
