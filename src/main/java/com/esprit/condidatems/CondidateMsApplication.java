package com.esprit.condidatems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CondidateMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CondidateMsApplication.class, args);
    }


    @Autowired
    private CondidatRepository repository;
    @Bean
    ApplicationRunner init(){
        return (args) -> {
            repository.save(new Condidat("Mariem" , "Ch" , "ma@esprit.tn"));
            repository.save(new Condidat("Sarra" , "Cab" , "sa@esprit.tn"));
            repository.save(new Condidat("Mohamed" , "haa" , "mo@esprit.tn"));
            repository.findAll().forEach(System.out::println);
        };
    }
}
