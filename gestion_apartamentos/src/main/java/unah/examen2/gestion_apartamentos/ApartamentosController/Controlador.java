package unah.examen2.gestion_apartamentos.ApartamentosController;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/apartamentos")
public class Controlador {



    //operaciòn de crear
    @GetMapping("/crear")
    @boddyrequest(@pathvariable({}) );
    public String (@boddyrequest String ) {
        return new String();

    //operaciòn de buscar por id el paràmetro serà un pathvariable
    @GetMapping("/buscar")
    public String (@pathvariable String ) {
        return new String();
    }
       //operaciòn de buscar todos
       @GetMapping("/buscarTodos")
       public String (@RequestParam String ) {
           return new String();
       }

    //Elimimnar de buscar por id el paràmetro serà un pathvariable
    @GetMapping("/buscar")
    public String (@RequestParam String ) {
        return new String();
    }

   

}
