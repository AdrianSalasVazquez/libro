
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int paginas;
    private String detalles;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginasLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = paginasLibro;
        detalles = ("Autor del libro: " + autor + " | T�tulo del libro: " + titulo + " | N�mero de p�ginas: " + paginas);
    }
    
    public String getAutor() {
        return autor;
    } 
    
    public String getTitulo() {
        return titulo;
    } 
    
    public int getPaginas() {
        return paginas;
    }
    
    public void imprimeAutor (){
        System.out.println("El autor del libro es: " + autor);
    }
    
    public void imprimeTitulo (){
        System.out.println("El titulo del libro es: " + titulo);
    }
    
    public void imprimeDetalles() {
        System.out.println(detalles);
    }
    public String getDetalles() {
        return detalles;
    }
}
