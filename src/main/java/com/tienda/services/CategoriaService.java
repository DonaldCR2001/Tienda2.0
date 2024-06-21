
package com.tienda.services;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Se obtiene los registros de la tabla categoria en un array list de objetos categoria, todos o solo los activos
    public List<Categoria> getCategorias(boolean activos);
}
