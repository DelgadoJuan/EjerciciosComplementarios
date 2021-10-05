package Level2.ejercicio6;

public class Empleados {
    String nombre;
    int dni;
    int horas_trabajadas;
    int valorphora;

    public Empleados(String nombre, int dni,  int horas_trabajadas, int valorphora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horas_trabajadas = horas_trabajadas;
        this.valorphora = valorphora;
    }

    @Override
    public String toString() {
        return String.valueOf(this.dni) + " - " + this.nombre + " - " + String.valueOf(this.horas_trabajadas + " - " + String.valueOf(this.valorphora));
    }

}
