package ModSec.entidades;
// Generated 10-11-2014 10:38:28 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * OpcModulo generated by hbm2java
 */
public class OpcModulo  implements java.io.Serializable {


     private int id;
     private Modulos modulos;
     private String nombre;
     private String codigo;
     private String url;
     private char tipo;
     private String icono;
     private char nivelOpc;
     private char activo;
     private String descripcion;
     private int depjerq;
     private Set opcRols = new HashSet(0);

    public OpcModulo() {
    }

	
    public OpcModulo(int id, Modulos modulos, String nombre, String codigo, String url, char tipo, char nivelOpc, char activo, String descripcion, int depjerq) {
        this.id = id;
        this.modulos = modulos;
        this.nombre = nombre;
        this.codigo = codigo;
        this.url = url;
        this.tipo = tipo;
        this.nivelOpc = nivelOpc;
        this.activo = activo;
        this.descripcion = descripcion;
        this.depjerq = depjerq;
    }
    public OpcModulo(int id, Modulos modulos, String nombre, String codigo, String url, char tipo, String icono, char nivelOpc, char activo, String descripcion, int depjerq, Set opcRols) {
       this.id = id;
       this.modulos = modulos;
       this.nombre = nombre;
       this.codigo = codigo;
       this.url = url;
       this.tipo = tipo;
       this.icono = icono;
       this.nivelOpc = nivelOpc;
       this.activo = activo;
       this.descripcion = descripcion;
       this.depjerq = depjerq;
       this.opcRols = opcRols;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Modulos getModulos() {
        return this.modulos;
    }
    
    public void setModulos(Modulos modulos) {
        this.modulos = modulos;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public char getTipo() {
        return this.tipo;
    }
    
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    public String getIcono() {
        return this.icono;
    }
    
    public void setIcono(String icono) {
        this.icono = icono;
    }
    public char getNivelOpc() {
        return this.nivelOpc;
    }
    
    public void setNivelOpc(char nivelOpc) {
        this.nivelOpc = nivelOpc;
    }
    public char getActivo() {
        return this.activo;
    }
    
    public void setActivo(char activo) {
        this.activo = activo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getDepjerq() {
        return this.depjerq;
    }
    
    public void setDepjerq(int depjerq) {
        this.depjerq = depjerq;
    }
    public Set getOpcRols() {
        return this.opcRols;
    }
    
    public void setOpcRols(Set opcRols) {
        this.opcRols = opcRols;
    }




}


