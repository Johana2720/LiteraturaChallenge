package Es.para.encontrar.libros.Repository;

import Es.para.encontrar.libros.Models.Idioma;
import Es.para.encontrar.libros.Models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

    Optional<Libro> findByTituloIgnoreCase(String titulo);

    List<Libro> findByIdioma(Idioma idioma);
}