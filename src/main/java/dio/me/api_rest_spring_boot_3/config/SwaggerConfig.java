package dio.me.api_rest_spring_boot_3.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("📌 API de Tarefas")
                        .version("1.0.0")
                        .description("🚀 API REST com Spring Boot 3, Java 17 e Swagger para gerenciamento de tarefas."));
    }
}
