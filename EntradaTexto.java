import java.time.LocalDateTime;
import java.util.ArrayList;

public class EntradaTexto
{
    private String usuario;
    private String mensaje;
    private LocalDateTime momentoPublicacion;
    private int likes;
    private ArrayList<String> comentarios;
    
    public EntradaTexto(String usuario, String mensaje)
    {
        this.usuario = usuario;
        this.mensaje = mensaje;
        momentoPublicacion = LocalDateTime.now();
        comentarios = new ArrayList<String>();
    }
    
    public void meGusta()
    {
        
    }
    
    public void addComentario(String texto)
    {
    
    }
    
    public String getMensaje()
    {
        return mensaje;
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