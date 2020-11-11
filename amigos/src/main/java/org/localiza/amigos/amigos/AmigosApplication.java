package org.localiza.amigos.amigos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmigosApplication implements CommandLineRunner {

	@Autowired RepoHola repoHola;

	public static void main(String[] args) {
		SpringApplication.run(AmigosApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		//esta es la famosa linea de comandos en spring
		//Hola h=new Hola();
		//h.setMensaje("mi segundo entidad a guardar en mongodb");
		//repoHola.save(h);

        for(Hola h:repoHola.findAll())
        {
            System.out.println(h.getMensaje());
        }
	}
}
