package unah.examen2.gestion_apartamentos.ApartamentoDTO;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@lombok;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity(name ="condominios")
public class condominios {

    
    @
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;

}
