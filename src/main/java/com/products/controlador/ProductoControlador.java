package com.products.controlador;

import com.products.principal.Producto;
import com.products.repositorio.ProductoRepositorio;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoControlador {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @GetMapping
    public List<Producto> listarProductos() {
        return productoRepositorio.listarProductos();
    }

    @GetMapping("/{id}")
    public Producto buscarPorId(@PathVariable Long id) {
        return productoRepositorio.buscarPorId(id);
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoRepositorio.crearProducto(producto);
    }

    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable Long id, @RequestBody Producto producto) {
        producto.setId(id);
        return productoRepositorio.actualizarProducto(producto);
    }

    @DeleteMapping("/{id}")
    public void borrarProducto(@PathVariable Long id) {
        productoRepositorio.borrarProducto(id);
    }
}




