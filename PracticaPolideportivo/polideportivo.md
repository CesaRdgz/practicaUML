#Polideportivo
###Socios(0..n) - Reservas(0..n)
#####UML
```plantuml
@startuml
class socios{
nombre
dirección
ciudad
provincia
teléfono
cuota
reservar()
}

class reservas{
}
@enduml
```

#####Java
```java
public class socios {

    private String nombre;
    private String direccion;
    private String ciudad;
    private String provincia;
    private String telefono;
    private int cuota;
    reservar();
}

public class reservas {
}

```

###Reservas(1) - instalacionesDeportivas(1)
#####UML
```plantuml
@startuml
class reservas{
}

class instalacionesDeportivas{
piscinas
frontones
gimnasios
pistas de tenis
}
@enduml
```

#####Java
```java
public class reservas {
}

public class instalacionesDeportivas {
    private Arrays<instalacion> piscinas;
    private Arrays<instalacion> frontones;
    private Arrays<instalacion> gimnasios;
    private Arrays<instalacion> pistasDeTenis;
}
```

###instalacionesDeportivas(1) - Articulos(0..n)
#####UML
```plantuml
@startuml
class instalacionesDeportivas{
piscinas
frontones
gimnasios
pistas de tenis
}

class artículos{
balones
redes
raquetas
}
@enduml
```

#####Java
```java
public class instalacionesDeportivas {
    private Arrays<instalacion> piscinas;
    private Arrays<instalacion> frontones;
    private Arrays<instalacion> gimnasios;
    private Arrays<instalacion> pistasDeTenis;
}

public class articulos {
    private int balones;
    private int redes;
    private int raquetas;
}

```

###Reservas(1) - Fecha(1)
#####UML
```plantuml
@startuml
class reservas{
}

class fecha{
hora de entrada
hora de salida
}
@enduml
```

#####Java
```java
public class reservas {
}

public class fecha {
    private String horaDeEntrada;
    private String horaDeSalida;
}
```

