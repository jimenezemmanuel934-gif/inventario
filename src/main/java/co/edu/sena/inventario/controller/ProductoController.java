package co.edu.sena.inventario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import co.edu.sena.inventario.model.Producto;

import java.util.List;




@RestController
public class ProductoController {
 private final List<Producto> productos = List.of(
new Producto(1L, "Papa pastusa", 2500.0, 50),
new Producto(2L, "Tomate", 3200.0, 30),
new Producto(3L, "Fresa", 8500.0, 20)
 );

 @GetMapping("/productos")
 public List<Producto> listaProductos(){
     return productos;
 }
 

@GetMapping("/productos/{id}")
public Producto buscaProducto(@PathVariable Long id) {
    
    for(Producto producto : productos) {
        if (producto.getId().equals(id)) {
            return producto;
        }
    }
    return null;
}

    
}