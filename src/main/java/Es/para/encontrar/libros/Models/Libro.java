package Es.para.encontrar.libros.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    @Enumerated(EnumType.STRING)
    private Idioma idioma;
    private double numeroDescargas;
    @ManyToOne
    private Autor autor;

public Libro(){

}

    public Libro(DatosLibros datosLibros) {
        this.titulo = datosLibros.titulo();
        this.idioma = Idioma.fromString(datosLibros.idiomas().toString().split(",")[0]);
        this.numeroDescargas = datosLibros.numeroDescargas();
    }

    //GET AND SETT
    public Long getId() {
    return null;
    }

    public void setId(Long id) {
    this.id = id;
    }

    public String getTitulo() {
    return titulo;
    }

    public void setTitulo(String titulo) {
    this.titulo = titulo;
    }

    public Idioma getIdioma() {
    return idioma;
    }

    public void setIdioma(Idioma idioma) {
    this.idioma = idioma;
    }

    public double getNumeroDescargas() {
    return numeroDescargas;
    }

    public void setNumeroDescargas(double numeroDescargas) {
    this.numeroDescargas = numeroDescargas;
    }

    @Override
    public String toString() {
        return  "titulo: " + titulo + "\n" +
                "idioma: " + idioma + "\n" +
                "autor: " + autor.getNombre() + "\n" +
                "numeroDescargas: " + numeroDescargas + "\n";
    }

    public void setAutor(Autor autor) {
    }
}
