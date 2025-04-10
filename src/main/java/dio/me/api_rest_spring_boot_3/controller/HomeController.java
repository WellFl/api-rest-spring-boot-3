package dio.me.api_rest_spring_boot_3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "🚀 Bem-vindo à API de Tarefas! Acesse /tasks para visualizar as tarefas.";
    }
}
