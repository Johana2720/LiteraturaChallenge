package Es.para.encontrar.libros.Service;

public interface IConvertidorDatos {

    <T> T obtenerDatos(String json, Class<T> clase);
}
