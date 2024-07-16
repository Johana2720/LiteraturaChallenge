package Es.para.encontrar.libros.Models;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAuthor(
        @JsonAlias("name") String nombre,
        @JsonAlias("birth_year") int fechaDeNacimiento,
        @JsonAlias("death_year") int fechaDeMuerte
    ) {
}
