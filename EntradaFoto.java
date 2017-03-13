import java.time.LocalDateTime;
import java.util.ArrayList;

public class EntradaFoto
{
    private String usuario;
    private String direccionImagen;
    private String titulo;
    private LocalDateTime momentoPublicacion;
    private int likes;
    private ArrayList<String> comentarios;

    public EntradaFoto(String usuario, String direccion, String titulo)
    {
        this.usuario = usuario;
        this.titulo = titulo;
        direccionImagen = direccion;
        momentoPublicacion = LocalDateTime.now();
        comentarios = new ArrayList<String>();
        likes = 0;
    }

    public void meGusta()
    {
        
    }
    
    public void addComentario(String texto)
    {
    
    }
    
    public String getUrlImagen()
    {
        return direccionImagen;
    }
    
    public String getTituloDeLaImagen()
    {
        return titulo;
    }
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    public String toString()
    {
        String textoADevolver = null;
        
        return textoADevolver;
    }
}