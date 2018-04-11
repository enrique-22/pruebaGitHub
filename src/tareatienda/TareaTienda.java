/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareatienda;

/**
 *
 * @author rafa
 */
public class TareaTienda {
    
    public class Producto {
    private String nombre;
    private float precio;
    private int cantidad;
    
    public Producto() {}
    
    public Producto (String nombre, float precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad= cantidad;
        
    }
    //getters
     public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    
       //setters
    
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
    
   public class administrador {
    private String nombre;
    private int telefono;
    private String email;
    
    public administrador() {}
    
    public administrador (String nombre, int telefono, String email){
        this.nombre = nombre;
        this.telefono= telefono;
        this.email = email;
    }
    
    //getter
    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
    
//setters
    
       public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
   
   public class proveedor {
    private String nombre;
    private int telefono;
    private String emails;
    private String empresa;

    public proveedor() {}
    
    public proveedor (String nombre, int telefono, String emails, String empresa){
        this.nombre = nombre;
        this.telefono = telefono;
        this.emails = emails;
        this.empresa = empresa;
    }
    
    //getter
    
    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmails() {
        return emails;
    }

    public String getEmpresa() {
        return empresa;
    }
    
    //setters
    
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}
   
     
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
