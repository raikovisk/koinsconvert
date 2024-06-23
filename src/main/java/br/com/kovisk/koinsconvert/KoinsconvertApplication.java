package br.com.kovisk.koinsconvert;

import br.com.kovisk.koinsconvert.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KoinsconvertApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(KoinsconvertApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();

	}

}
