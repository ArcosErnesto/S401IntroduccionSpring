package cat.itacademy.barcelonactiva.arcos.ernesto.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name = "nom", defaultValue = "UNKNOWN") String name) {
        return "Hola, " + name + ". Estás ejecutando un projecto Gradle";
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(name = "nom", required = false) String nom) {
        if (nom == null) {
            return "Hola, UNKNOWN. Estás ejecutando un projecto Gradle";
        } else {
            return "Hola, " + nom + ". Estás ejecutando un projecto Gradle";
        }
    }
}

