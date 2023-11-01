package co.edu.uniquindio.agenciaDeViajes.modelo;

import co.edu.uniquindio.agenciaDeViajes.enums.Clima;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Destino implements Serializable {

    private String nombre;
    private String ciudad;
    private String descripcion;
    private Clima clima;
    private ArrayList<String> imagenes;

    public String toFileFormat() {
        return nombre + ";" + ciudad + ";" + descripcion + ";" + imagenes + ";" + clima;
    }

    @Override
    public String toString() {
        return "Destino{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", clima=" + clima +
                ", imagenes=" + imagenes +
                '}';
    }
}
