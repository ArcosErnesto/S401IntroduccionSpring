package cat.itacademy.barcelonactiva.arcos.ernesto.s04.t01.n01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name = "nom", defaultValue = "UNKNOWN") String name) {
        return "Hola, " + name + ". Estás ejecutando un projecto Maven";
    }

    @GetMapping(value = {"/HelloWorld2","/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(name = "nom", required = false) String nom) {
        if (nom == null) {
            return "Hola, UNKNOWN. Estás ejecutando un projecto Maven";
        } else {
            return "Hola, " + nom + ". Estás ejecutando un projecto Maven";
        }
    }
}