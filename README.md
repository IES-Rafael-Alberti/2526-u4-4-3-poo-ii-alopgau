# Práctica 4.3: Programación orientada a objetos II

## Identificación de la Actividad

- **ID de la Actividad:** 4.3
- **Módulo:** PROG (Programación)
- **Unidad de Trabajo:** U4 - Programación Orientada a Objetos II
- **Fecha de Creación:** 19/01/26
- **Fecha de Entrega:** 23/01/26
- **Alumno(s):**
  - **Nombre y Apellidos:** Antonio López Gautier
  - **Correo electrónico:** alopgau418@g.educaand.es
  - **Iniciales del Alumno/Grupo:** ALG

## Descripción de la Actividad

Esta práctica implementa diversos conceptos de programación orientada a objetos en Kotlin, incluyendo:

1. **Sistema de compras y clientes** con repositorios y domicilios
2. **Gestión de libros** con un sistema de puntuación
3. **Sistema bancario** con cuentas, personas y transferencias
4. **Sistema de tareas** con estados y gestión
5. **Juego de Tres en Raya** completo con jugadores y lógica de juego

Cada módulo demuestra diferentes aspectos de POO como clases, objetos, herencia implícita con data classes, enums, companion objects, y relaciones entre objetos.

## Instrucciones de Compilación y Ejecución

### Requisitos Previos:
- Kotlin 1.8+ o Java 17+ con Kotlin plugin
- IDE recomendado: IntelliJ IDEA o Android Studio
- O compilador de línea de comandos `kotlinc`

### Pasos para Compilación y Ejecución:

#### Opción 1: Desde IntelliJ IDEA/Android Studio
1. Abrir el proyecto en el IDE
2. Navegar al archivo principal deseado (`LibroMain.kt`, `ListaTareasMain.kt`, etc.)
3. Ejecutar con el botón "Run" o menú contextual

#### Opción 2: Línea de comandos
```bash
# Compilar todos los archivos Kotlin
kotlinc *.kt -include-runtime -d Practica4.3.jar

# Ejecutar programas específicos:
# Para el sistema de libros:
kotlin LibroMainKt

# Para el sistema de tareas:
kotlin ListaTareasMainKt

# Para el sistema de compras:
kotlin MainComprasKt

# Para el sistema de cuentas:
kotlin MainCuentaKt

# Para el Tres en Raya:
kotlin TresEnRayaKt
```

## Desarrollo de la Actividad

### Estructura del Proyecto:
El proyecto contiene múltiples sistemas independientes pero relacionados conceptualmente con POO:

1. **Sistema de Compras** (`Compras.kt`, `MainCompras.kt`)
2. **Sistema de Libros** (`Libro.kt`, `ConjuntoLibros.kt`, `LibroMain.kt`)
3. **Sistema Bancario** (`Cuenta.kt`, `Persona.kt`, `MainCuenta.kt`)
4. **Sistema de Tareas** (`Tarea.kt`, `EstadoTarea.kt`, `ListaTareas.kt`, `ListaTareasMain.kt`)
5. **Juego Tres en Raya** (`Ficha.kt`, `Jugador.kt`, `Partida.kt`, `TresEnRaya.kt`)

### Conceptos Implementados:

#### 1. Data Classes y Inmutabilidad
```kotlin
data class Compra(val cliente: Cliente, val dia: Int, val monto: Float)
data class Domicilio(val calle: String, val numero: String)
```
- Uso de `data class` para objetos de valor
- Propiedades inmutables (`val`)
- Métodos generados automáticamente (`equals()`, `hashCode()`, `toString()`)

#### 2. Enums y Pattern Matching
```kotlin
enum class EstadoTarea { Pendiente, Realizada }
enum class Ficha { CRUZ, CIRCULO }
```
- Enumeraciones para estados finitos
- When expressions para manejo de casos

#### 3. Companion Objects y Métodos Estáticos
```kotlin
companion object {
    const val limiteLibros = 5
    fun esMorosa(persona: Persona): Boolean
}
```
- Constantes asociadas a clases
- Métodos de utilidad (factory methods, helpers)

#### 4. Validación con `require()`
```kotlin
init {
    require(nota > 0 && nota < 10)
}
```
- Validación en tiempo de inicialización
- Lanzamiento de excepciones descriptivas

#### 5. Null Safety y Safe Calls
```kotlin
val libroBuscado = conjunto.indexOfFirst {it?.titulo == titulo && it.autor == autor }
this.conjunto.filterNotNull().forEach { println(it) }
```
- Manejo seguro de valores nulos
- Filtrado de colecciones con `filterNotNull()`

### Ejemplos de Ejecución

#### Sistema de Libros:
**Entrada:** Ejecución automática del programa `LibroMain.kt`
**Salida Esperada:**
```
Libros añadidos:
Título: El Quijote Autor: Cervantes Páginas: 800 Nota: 3
Título: El Señor de los Anillos Autor: J.R.R Tolkien Páginas: 450 Nota: 8
Libros eliminados
Título: El camino de los reyes Autor: Brandon Sanderson Páginas: 756 Nota: 7
```

#### Sistema de Tareas:
**Entrada:** Interactiva con menú de opciones
```
1) Añadir tarea
2) Eliminar tarea
3) Actualizar estado tarea
4) Mostrar pendientes
5) Mostrar realizadas
6) Mostrar todas
```
**Salida:** Gestión completa de tareas con estados

#### Juego Tres en Raya:
**Entrada:** Interactiva por consola
```
El jugador 1 (pepe) eligirá su ficha (CIRCULO o CRUZ)
Jugador 1 (pepe). Introduce el número de la casilla que vas a jugar (1 al 9)
```
**Salida:** Tablero gráfico y resultado final

## Resultados de Pruebas

### Pruebas Realizadas:
1. ✅ Creación y eliminación de libros en `ConjuntoLibros`
2. ✅ Gestión de estados de tareas (Pendiente ↔ Realizada)
3. ✅ Transferencias bancarias entre cuentas
4. ✅ Validación de jugadores en Tres en Raya (máximo 2)
5. ✅ Detección de morosidad en cuentas
6. ✅ Colección de domicilios únicos en compras

### Casos Límite Probados:
- Añadir más elementos del límite permitido
- Eliminar elementos inexistentes
- Jugadas en casillas ocupadas
- Transferencias con saldo insuficiente

## Documentación Adicional

### Archivos Principales:
- **`Compras.kt`**: Sistema de compras y clientes
- **`ConjuntoLibros.kt`**: Gestión de colección de libros
- **`Cuenta.kt`** y **`Persona.kt`**: Sistema bancario
- **`Tarea.kt`** y **`ListaTareas.kt`**: Gestor de tareas
- **`Partida.kt`** y **`Jugador.kt`**: Lógica del Tres en Raya

## Conclusiones

Esta práctica ha permitido implementar y consolidar conceptos avanzados de POO en Kotlin:

1. **Data classes** son ideales para objetos de valor inmutables
2. **Null safety** de Kotlin previene errores comunes
3. **Extension functions** podrían mejorar la legibilidad
4. **Sealed classes** serían útiles para manejar estados más complejos
5. El sistema de **companion objects** ofrece una alternativa flexible a métodos estáticos

Las principales mejoras identificadas:
- Implementar interfaces para mayor flexibilidad
- Añadir más validaciones y manejo de errores
- Separar lógica de UI de lógica de negocio en el Tres en Raya
- Implementar persistencia de datos

## Referencias y Fuentes

1. Documentación Oficial de Kotlin: https://kotlinlang.org/docs/home.html
2. U4: 3. POO II - Material del curso

---

**Nota:** Todos los archivos .kt están en el paquete `org.iesra` y son independientes entre sí, permitiendo ejecutar cada sistema por separado según las necesidades.
