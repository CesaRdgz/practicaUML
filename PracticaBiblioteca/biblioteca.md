#Biblioteca
###Multa(0..1) - socio
#####UML
```plantuml

@startuml

class multa{
-inicio : Date
-fin : Date
}

class socio {
-numero : Integer
-nombre : String
-direccion : String
-telefono : String
}

multa"0..1"  -- socio
@enduml
```

#####Java
```java

public class multa {
    String inicio;
    String fin;
}

public class socio {
    int numero;
    String nombre;
    String direccion;
    String telefono;
}

```
###Socio(0..1) - Copia(0..3)
#####UML
```plantuml

@startuml

class socio {
-numero : Integer
-nombre : String
-direccion : String
-telefono : String
}

class copia {
-referencia : Integer
-estado : estadoCopia
}

socio"0..1" -- "0..3"copia
@enduml
```

#####Java
```java

public class socio {
    int numero;
    String nombre;
    String direccion;
    String telefono;
}

public class copia {
    int referencia;
}
```
###Prestamo - Socio
#####UML
```plantuml

@startuml

class prestamo {
-inicio : Date
-fin : Date
}

class socio {
-numero : Integer
-nombre : String
-direccion : String
-telefono : String
}

(copia, socio) ... prestamo : recibe
@enduml
```

#####Java
```java

public class prestamo {
    String inicio;
    String fin;
}

public class socio {
    int numero;
    String nombre;
    String direccion;
    String telefono;
}
```
###Prestamo - Copia
#####UML
```plantuml

@startuml

class prestamo {
-inicio : Date
-fin : Date
}

class copia {
-referencia : Integer
-estado : estadoCopia
}

(copia, socio) ... prestamo : recibe
@enduml
```

#####Java
```java

public class prestamo {
    String inicio;
    String fin;
}

public class copia {
    int referencia;
}
```
###Copia(0..1) - Libro
#####UML
```plantuml

@startuml

class copia {
-referencia : Integer
-estado : estadoCopia
}

class libro{
-titulo : String
-editorial : String
-year : Integer
-tipo : Genero
}

copia"1..*" -- libro
@enduml
```

#####Java
```java

public class copia {
    int referencia;
}

public class libro {
    String titulo;
    int año;
    String editorial;
    String tipo;
}
```
###Libro(0..1) - Autor
#####UML
```plantuml
@startuml

class libro{
-titulo : String
-editorial : String
-year : Integer
-tipo : Genero
}

class autor{
-nombre : String
-nacionalidad : String
-fechaNacimiento : Date
}

libro"1..*" -- autor
@enduml
```

#####Java
```java

public class libro {
    String titulo;
    int año;
    String editorial;
    String tipo;
}

public class autor {
    String nombre;
    String fecha_nacimiento;
    String nacionalidad;

}

```