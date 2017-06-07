/*
 * To change this license header, choose License Headers in Project Properties.
 * @author Eduardo Romero Haro.
 * @author eduardo.ro123545@gmail.com.
 */
package unidadii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gbarron
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Articulo> listaArticulos = new ArrayList();
        int opcion, opArticulo;
        String datoCadena, codigo;
        Double datoDouble;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("\n\n\nSistema de administración de artículos");
            System.out.println("______________________________________");
            System.out.println("[1] Administración de artículos.");
            System.out.println("[2] Administración de proveedores");
            System.out.println("[3] Salir");
            System.out.print("Elige una opción-->");
            opcion = Integer.valueOf(teclado.nextLine());
            
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("\n\n\nAdministración de Artículos");
                        System.out.println("______________________________________");
                        System.out.println("[1] Listado de artículos.");
                        System.out.println("[2] Agregar un nuevo artículo");
                        System.out.println("[3] Eliminación de artículos.");
                        System.out.println("[4] Modificación de artículo");
                        System.out.println("[5] Salir");
                        System.out.print("Elige una opción-->");
                        opArticulo = Integer.valueOf(teclado.nextLine());
                        
                        switch(opArticulo) {
                            case 1: //Listado de artículos
                                listaArticulos(listaArticulos);
                                break;
                            case 2: //Agregar un nuevo artículo
                                Articulo articulo = new Articulo();
                                System.out.print("Ingrese el código-->");
                                datoCadena= teclado.nextLine();
                                articulo.setCodigo(datoCadena);
                                System.out.print("Ingrese el nombre-->");
                                datoCadena= teclado.nextLine();
                                articulo.setNombre(datoCadena);
                                System.out.print("Ingrese el Marca-->");
                                datoCadena= teclado.nextLine();
                                articulo.setMarca(datoCadena);
                                System.out.print("Ingrese una descripcion-->");
                                datoCadena = teclado.nextLine();
                                articulo.setDescripcion(datoCadena);
                                System.out.print("Ingrese el precio de compra-->");
                                datoDouble = Double.valueOf(teclado.nextLine());
                                articulo.setPrecioCompra(datoDouble);
                                System.out.print("Ingrese el precio de venta-->");//La variable se encontraba mal declarada
                                datoDouble = Double.valueOf(teclado.nextLine());
                                articulo.setPrecioVenta(datoDouble);
                                listaArticulos.add(articulo);
                                System.out.println("Presione Enter para continuar...");
                                teclado.nextLine();
                                break;
                            case 3: // Eliminación de artículo
                                System.out.print("Ingrese el código a buscar-->");
                                datoCadena = teclado.nextLine();
                                Boolean isEncontrado = false;
                                
                                for(Articulo a: listaArticulos) {
                                    if (a.getCodigo().equals(datoCadena)) {
                                        System.out.println(a);
                                    }
                                }
                                
                                if (isEncontrado) {
                                    System.out.println("Código de artículo no encontrado");
                                }
                                break;
                            case 4: //Modificación de artículo
                                System.out.print("Ingrese el nombre a buscar-->");
                                datoCadena = teclado.nextLine();
                                isEncontrado = false;
                                
                                for(Articulo a: listaArticulos) {
                                    if (a.getNombre().equals(datoCadena)) {
                                        System.out.println(a);
                                    }
                                }
                                
                                if (isEncontrado) {
                                    System.out.println("Código de artículo no encontrado");
                                }
                                
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opción inválida");
                        }
                        
                    } while (opArticulo != 5);
                    break;
                case 2:
                   
                        
            }
        } while (opcion != 3);
        System.out.println("Adios!!!");
    }
    
    private static void listaArticulos(List<Articulo> listaArticulos) {
        if (listaArticulos.size() > 0) {
            System.out.println("Código\tNombre\t\tMarca\t\tDescripción\t\tPrecio Compra\t\tPrecioVenta");
        } else {
            System.out.println("\n\nLa lista está vacía");
        }
        for (int i=0; i < listaArticulos.size(); i++) {//Estaba inicializado en 1 cuando lo correcto es que este inicializado en 0
            System.out.println(listaArticulos.get(i));
        }
        System.out.println("Presione una Enter para continuar");
        Scanner entrada = new Scanner(System.in);
        entrada.nextLine();
    }
    
    
}
