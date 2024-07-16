package Es.para.encontrar.libros.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nombre;
    private Integer fechaDeNacimiento;
    private Integer fechaDeMuerte;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Libro> libros;

    public Autor(){

    }


    public Autor(DatosAuthor datosAuthor) {
        this.nombre = datosAuthor.nombre();
        this.fechaDeNacimiento= datosAuthor.fechaDeNacimiento();
        this.fechaDeMuerte = datosAuthor.fechaDeMuerte();
    }

    ///GET AND SET
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Integer fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getFechaDeMuerte() {
        return fechaDeMuerte;
    }

    public void setFechaDeMuerte(Integer fechaDeMuerte) {
        this.fechaDeMuerte = fechaDeMuerte;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        System.out.println("-----------------");
        sb.append("Autor: ").append(nombre).append("\n")
                .append("Fecha de nacimiento: ").append(fechaDeNacimiento != null ? fechaDeNacimiento : "Desconocida").append("\n")
                .append("Fecha de muerte: ").append(fechaDeMuerte!= null ? fechaDeMuerte : "Desconocida").append("\n")
                .append("Libros: ").append("\n");
        if (libros != null) {
            for (Libro libro : libros) {
                sb.append("-  ").append(libro.getTitulo() != null ? libro.getTitulo() : "Título desconocido").append("\n");
            }
        } else {
            sb.append("No hay libros registrados");
        }
       // for (Libro libro : libros) {
         //   sb.append("-  ").append(libro.getTitulo()).append("\n");
        //}
        return sb.toString();
    }


}
