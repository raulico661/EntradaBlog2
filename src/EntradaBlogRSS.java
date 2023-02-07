/**
 * Clase para manejar las entradas de un blog.
 *
 * @author "Raúl Sempere Sánchez"
 * @version "2.3"
 * @since 21/3/1999
 */
public class EntradaBlogRSS {
    /**
     * El atributo separador es el carácter que separa ENTRADA DE del nombre del autor
     */
    public static char separador=':';
    private int id;
    private String texto;
    private String autor;

    /**
     * Constructor de la clase. recibe el número de entrada, el nombre del autor
     * de la entrada y el texto que contiene la entrada.
     *
     * @param id EL identificador del autor
     * @param autor El nombre del autor
     * @param texto El texto que proporciona el autor
     * @throws IllegalArgumentException Si el número de entrada es negativo, lanza una excepción.
     */
    public EntradaBlogRSS(int id,String autor,String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
    }

    /**
     *
     * @return id devuelve el identificador del autor
     */
    public int getId(){
        return this.id;
    }

    /**
     *
     * @return texto devuelve el texto completo de la entrada
     */
    public String getTexto(){
        return this.texto;
    }

    /**
     *
     * @return autor devuelve el nombre del autor con las letras en mayúscula
     */
    public String getAutor(){
        return this.autor.toUpperCase();
    }

    /**
     *
     * @return autor devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
     */
    public String devuelveAutor(){
        return this.autor;
    }

    /**
     * Clase main del programa
     *
     * @param args No tiene porqué tener argumentos
     */
    public static void main(String[] args) {
        EntradaBlogRSS e1=new EntradaBlogRSS (3,"Raúl","Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}

