/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JORGE
 */
public class Proyecto {
   
//import java.util.ArrayList;

// Clase Producto
class Producto {
    // Atributos
    private double precio;
    private String nombre;
    private int cantidad;

    // Constructor
    public Producto(double precio, String nombre, int cantidad) {
        this.precio = precio;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // Métodos get y set
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Otros métodos
    public double calcularValor() {
        return precio * cantidad;
    }

    public void mostrarAlertaInventario() {
        if (cantidad <= 10) {
            System.out.println("Alerta: Quedan pocas unidades de " + nombre);
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventario de " + nombre + ": " + cantidad);
    }
}

// Clase Proveedor
class Proveedor {
    // Atributos
    private String nombre;
    private String direccion;
    private String ciudad;
    private String celular;

    // Constructor
    public Proveedor(String nombre, String direccion, String ciudad, String celular) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.celular = celular;
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    // Otros métodos
    public void tomarPedidos() {
        // Método para tomar pedidos
    }

    public void generarVentas() {
        // Método para generar ventas
    }
}

// Clase EntradasAlmacen
class EntradasAlmacen {
    // Atributos
    private int numeroDocumento;
    private String fecha;
    private String nombre;

    // Constructor
    public EntradasAlmacen(int numeroDocumento, String fecha, String nombre) {
        this.numeroDocumento = numeroDocumento;
        this.fecha = fecha;
        this.nombre = nombre;
    }

    // Métodos get y set
    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Otros métodos
    public int calcularCantidad() {
        // Método para calcular la cantidad de productos en la entrada al almacén
        return 0;
    }

    public int totalProductos() {
        // Método para calcular el total de productos en la entrada al almacén
        return 0;
    }
}

// Clase SalidasAlmacen
class SalidasAlmacen {
    // Atributos
    private int numeroDocumento;
    private String fecha;
    private String nombre;

    // Constructor
    public SalidasAlmacen(int numeroDocumento, String fecha, String nombre) {
        this.numeroDocumento = numeroDocumento;
        this.fecha = fecha;
        this.nombre = nombre;
    }

    // Métodos get y set
    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Otros métodos
    public int calcularCantidad() {
        // Método para calcular la cantidad de productos en la salida del almacén
        return 0;
    }

    public int totalProductos() {
        // Método para calcular el total de productos en la salida del almacén
        return 0;
    }
}

// Clase TrasladosProductos
class TrasladosProductos {
    // Atributos
    private int numeroDocumento;
    private String fecha;
    private String nombre;

    // Constructor
    public TrasladosProductos(int numeroDocumento, String fecha, String nombre) {
        this.numeroDocumento = numeroDocumento;
        this.fecha = fecha;
        this.nombre = nombre;
    }

    // Métodos get y set
    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Otros métodos
    public int calcularCantidad() {
        // Método para calcular la cantidad de productos en el traslado
        return 0;
    }

    public int totalProductos() {
        // Método para calcular el total de productos en el traslado
        return 0;
    }
}
}