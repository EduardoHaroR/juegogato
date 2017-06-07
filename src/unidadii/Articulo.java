/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidadii;

/**
 *
 * Define a todos los artículos de una ferretería.
 * @author Eduardo Romero Haro.
 * @author eduardo.ro123545@gmail.com
 */
final public class Articulo {
    private String codigo; 
    private String nombre;
    private String marca;
    private String descripcion;
    private Double precioCompra;
    private Double precioVenta;
    private String proveedor;//El tipo de dato no era correcto por lo que lo cambié a String

    public Articulo() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     *
     * @return
     */
    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return codigo + "\t" + nombre + "\t\t" + marca + "\t\t" + descripcion + "\t\t\t" + precioCompra + "\t\t" + precioVenta ;
    }

    /**
     * Imprime el contenido del objeto.
     */
    public void print() {
        System.out.println("    Datos de artículo   ");
        System.out.println("    ====================");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Precio compra: " + precioCompra);
        System.out.println("Precio venta: " + precioVenta + "\n\n");
    }
}
