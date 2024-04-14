package com.products.repositorio;
import com.products.principal.*;
import java.util.List;
public interface ProductoRepositorio {
    List<Producto> listarProductos();
    
    Producto buscarPorId(Long id);
    
    Producto crearProducto(Producto producto);
    
    Producto actualizarProducto(Producto producto);
    
    void borrarProducto(Long id);
}

