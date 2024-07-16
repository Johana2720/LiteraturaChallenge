package Es.para.encontrar.libros;

import Es.para.encontrar.libros.Principal.Principal;
import Es.para.encontrar.libros.Repository.AutorRepository;
import Es.para.encontrar.libros.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraturaChallengeApplication implements CommandLineRunner {

	@Autowired
	private AutorRepository autorRepository;
	@Autowired
	private LibroRepository libroRepository;
	public static void main(String[] args) {

		SpringApplication.run(LiteraturaChallengeApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal( autorRepository, libroRepository);
		principal.muestraMenu();
	}

}
