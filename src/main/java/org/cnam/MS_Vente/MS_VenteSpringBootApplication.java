package org.cnam.MS_Vente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages  = { "org.cnam.*"})
@EntityScan("org.cnam.MS_Vente.model")
@EnableJpaRepositories("org.cnam.MS_Vente.repository")
@EnableTransactionManagement
@EnableAutoConfiguration

public class MS_VenteSpringBootApplication
{
    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(MS_VenteSpringBootApplication.class, args);
    }
}
