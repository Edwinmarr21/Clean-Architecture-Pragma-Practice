package com.PragmaCleanArchitecture.infrastructure.configuration;

import com.PragmaCleanArchitecture.domain.entities.ports.PersonRepository;
import com.PragmaCleanArchitecture.domain.useCases.PersonUseCases;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
public class BeanConfiguration {
    @Bean
    public PersonUseCases useCases(PersonRepository personGateway){
        return new PersonUseCases(personGateway);
    }
}
