
# Ejercicio: Gestión del inventario de una tienda de videojuegos

## Descripción:
Desarrolla un programa que administre el **inventario de una tienda de videojuegos**. El inventario está organizado en una matriz de 3 filas por 3 columnas, donde cada fila representa una **categoría de videojuegos** y cada columna representa un videojuego disponible en esa categoría.

El programa debe ofrecer al usuario un menú interactivo para gestionar el inventario:

### Funcionalidades:
1. **Mostrar el inventario:**  
   El programa debe recorrer la matriz e imprimir el inventario en un formato tabular, utilizando colores:  
   - **Encabezado:** Fondo azul y texto blanco.  
   - **Columnas:** Cada columna debe tener un color diferente para el texto (rojo, verde, amarillo).  
   Todos los videojuegos deben mostrarse en minúsculas.

2. **Añadir o actualizar un videojuego:**  
   El programa permite al usuario elegir una categoría (fila) y un espacio (columna) en el inventario para asignar o reemplazar un videojuego. El nombre del videojuego se debe convertir automáticamente a minúsculas y eliminar los espacios iniciales y finales.

3. **Salir del programa:**  
   Finaliza el programa.

---

## Inventario inicial:
El inventario de la tienda comienza con los siguientes videojuegos:

| Categoría          | Videojuego 1       | Videojuego 2    | Videojuego 3      |
|--------------------|--------------------|-----------------|-------------------|
| **Acción**         | Call of Duty       | Halo            | Battlefield       |
| **Deportes**       | FIFA              | NBA 2K          | Madden NFL        |
| **RPG**            | Final Fantasy      | Zelda           | Skyrim            |

---

## Ejemplo de interacción del usuario:

### Menú principal:
El programa muestra un menú interactivo como este:
```
--- MENÚ PRINCIPAL ---
1. Mostrar inventario
2. Añadir o actualizar videojuego
3. Salir
Elige una opción:
```

### Opción 1: Mostrar inventario
```
--- INVENTARIO ---
Categoría 1       Categoría 2       Categoría 3       
call of duty      halo              battlefield        
fifa              nba 2k            madden nfl         
final fantasy     zelda             skyrim             
```

### Opción 2: Añadir o actualizar videojuego
Si el usuario elige la opción 2:
```
--- AÑADIR O ACTUALIZAR VIDEOJUEGO ---
Elige la categoría (1-3): 1
Elige el índice del videojuego (1-3): 2
Introduce el nombre del nuevo videojuego:   APEX LEGENDS    
¡Videojuego añadido correctamente!
```

Y al mostrar el inventario nuevamente:
```
--- INVENTARIO ---
Categoría 1       Categoría 2       Categoría 3       
call of duty      apex legends      battlefield        
fifa              nba 2k            madden nfl         
final fantasy     zelda             skyrim             
```

---

¡Recuerda seguir las instrucciones y probar diferentes casos para asegurarte de que el programa funcione correctamente!
