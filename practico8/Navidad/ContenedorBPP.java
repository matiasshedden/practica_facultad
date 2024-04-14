package practico8.Navidad;
/*
* Cada niño deposita su carta en el buzon correspondiente a su barrio.
* Cada buzon tiene asociado un conjunto de niños buenos, identificados por su DNI. Si un niño malo
* intenta depositar una carta en el buzon, la lista de regalos se vacia y se reemplaza por un trozo de carbon.
* Si un niño deposita varias cartas solo se considera la primera.
* Los buzones se encuentran distribuidos en diferentes barrios, que se agrupan por localidad, provincia o pais directamente.
* Cuando un niño deposita su carta en el buzon, se debe controlar que el mismo se encuentre en el listado de niños buenos
* asociados al buzon. Si se cumple la condicion, se guarda la carta.
*
* IMPLEMENTE LOS SIGUIENTES SERVICIOS:
* 1- Dado un buzon, provincia o pais, conocer el porcentaje de cartas recibidas que piden un determinado regalo
* 2- Dado un buzon, provincia o pais, conocer la cantidad de cartas recibidas que piden un determinado regalo
* 3- Dado un buzon, provincia o pais, conocer la cantidad de niños malos que enviaron una carta
* 4- Dado un buzon, provincia o pais, conocer la cantidad de total de cartas recibidas
* */
public abstract class ContenedorBPP {

    //El contenedor representa buzones, provincias o paises
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int cant_cartas();

    public abstract boolean tiene_regalo(String R);
}
