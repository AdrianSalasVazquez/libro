
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
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginasLibro, boolean libroDeTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = paginasLibro;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = libroDeTexto;
    }
    
    public String getAutor() {
        return autor;
    } 
    
    public String getTitulo() {
        return titulo;
    } 
    
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    public int getPaginas() {
        return paginas;
    }
    
    public int getVecesPrestado() {
        return vecesPrestado;
    }
    
    public boolean getEsLibroDeTexto() {
        return esLibroDeTexto;
    }
    
    public void prestar() {
        vecesPrestado = vecesPrestado + 1;
    }
    
    public void setNumeroReferencia(String numeroRef) {
        if (numeroRef.length() < 3){
            System.out.println("Error: El número de referencia introducido es menor de 3 caracteres");
        }
        else {
            numeroReferencia = numeroRef;
        }
    }
    
    public void imprimeAutor (){
        System.out.println("El autor del libro es: " + autor);
    }
    
    public void imprimeTitulo (){
        System.out.println("El titulo del libro es: " + titulo);
    }
    
    public void imprimeDetalles() {
        String siONo;
        if (esLibroDeTexto == true){
            siONo = "Si";
        }
        else {
            siONo = "No";
        }
        if (numeroReferencia == ""){
            System.out.println("Es libro de texto?: " + siONo + " | Autor del libro: " + autor + " | Título del libro: " + titulo + " | Número de páginas: " + paginas + " | Veces que ha sido prestado: " + vecesPrestado + " | Número de referencia: ZZZ");
        }
        else {
            System.out.println("Es libro de texto?: " + siONo + " | Autor del libro: " + autor + " | Título del libro: " + titulo + " | Número de páginas: " + paginas + " | Veces que ha sido prestado: " + vecesPrestado + " | Número de referencia: " + numeroReferencia);
        }
    }
    public String getDetalles() {
        String detalles;
        String siONo;
        if (esLibroDeTexto == true){
            siONo = "Si";
        }
        else {
            siONo = "No";
        }
        if (numeroReferencia == ""){
            detalles = ("Es libro de texto?: " + siONo + " | Autor del libro: " + autor + " | Título del libro: " + titulo + " | Número de páginas: " + paginas + " | Veces que ha sido prestado: " + vecesPrestado + " | Número de referencia: ZZZ");
        }
        else {
            detalles = ("Es libro de texto?: " + siONo + " | Autor del libro: " + autor + " | Título del libro: " + titulo + " | Número de páginas: " + paginas + " | Veces que ha sido prestado: " + vecesPrestado + " | Número de referencia: " + numeroReferencia);
        }
        return detalles;
    }
}
