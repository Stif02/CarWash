package com.example.carwash.Swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "CarWash Api",
                description = "Carwash", version = "1.0.0",
                contact = @Contact(
                        name = "Edvard",
                        url = "https://github.com/Stif02"
                )
        )
)
public class SwaggerConfig {
}
