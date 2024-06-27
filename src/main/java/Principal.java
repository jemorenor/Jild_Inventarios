/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JORGE
 */
public class Principal {
    
// Clase principal
public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso de las clases

        // Crear un producto
        Producto producto = new Producto(10.5, "Caja de tornillos", 50);

        // Acceder a los atributos del producto
        System.out.println("Nombre del producto: " + producto.getNombre());
        System.out.println("Precio del producto: " + producto.getPrecio());
        System.out.println("Cantidad en inventario: " + producto.getCantidad());

        // Calcular el valor total del producto
        System.out.println("Valor total del inventario: " + producto.calcularValor());

        // Mostrar alerta de inventario
        producto.mostrarAlertaInventario();

        // Mostrar inventario
        producto.mostrarInventario();

        // Crear un proveedor
        Proveedor proveedor = new Proveedor("Proveedor A", "Calle 123", "Ciudad X", "123456789");

        // Acceder a los atributos del proveedor
        System.out.println("Nombre del proveedor: " + proveedor.getNombre());
        System.out.println("Dirección del proveedor: " + proveedor.getDireccion());
        System.out.println("Ciudad del proveedor: " + proveedor.getCiudad());
        System.out.println("Celular del proveedor: " + proveedor.getCelular());

        // Tomar pedidos y generar ventas
        proveedor.tomarPedidos();
        proveedor.generarVentas();

        // Crear una entrada al almacén
        EntradasAlmacen entrada = new EntradasAlmacen(12345, "2024-05-03", "Entrada 1");

        // Acceder a los atributos de la entrada al almacén
        System.out.println("Número de documento de la entrada: " + entrada.getNumeroDocumento());
        System.out.println("Fecha de la entrada: " + entrada.getFecha());
        System.out.println("Nombre de la entrada: " + entrada.getNombre());

        // Calcular cantidad y total de productos en la entrada
        System.out.println("Cantidad de productos en la entrada: " + entrada.calcularCantidad());
        System.out.println("Total de productos en la entrada: " + entrada.totalProductos());

        // Crear una salida del almacén
        SalidasAlmacen salida = new SalidasAlmacen(54321, "2024-05-03", "Salida 1");

        // Acceder a los atributos de la salida del almacén
        System.out.println("Número de documento de la salida: " + salida.getNumeroDocumento());
        System.out.println("Fecha de la salida: " + salida.getFecha());
        System.out.println("Nombre de la salida: " + salida.getNombre());

        // Calcular cantidad y total de productos en la salida
        System.out.println("Cantidad de productos en la salida: " + salida.calcularCantidad());
        System.out.println("Total de productos en la salida: " + salida.totalProductos());

        // Crear un traslado de productos
        TrasladosProductos traslado = new TrasladosProductos(98765, "2024-05-03", "Traslado 1");

        // Acceder a los atributos del traslado de productos
        System.out.println("Número de documento del traslado: " + traslado.getNumeroDocumento());
        System.out.println("Fecha del traslado: " + traslado.getFecha());
        System.out.println("Nombre del traslado: " + traslado.getNombre());

        // Calcular cantidad y total de productos en el traslado
        System.out.println("Cantidad de productos en el traslado: " + traslado.calcularCantidad());
        System.out.println("Total de productos en el traslado: " + traslado.totalProductos());
    }
}
}
