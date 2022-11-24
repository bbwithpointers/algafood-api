package com.algafood.jpa;

import com.algafood.AlgafoodApiApplication;
import com.algafood.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaCozinhaMain {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);
        List<Cozinha> listarCozinhas = cadastroCozinha.listar();
       for (Cozinha cozinha : listarCozinhas) {
           System.out.println(cozinha.getNome());
       }

    }
}
