package ru.sshibko.BankClientManager.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "Authentication request")
public class SignInRequest {

    @Schema(description = "User name", example = "John Smith")
    @Size(min = 5, max = 64, message = "User name must contain 5 to 64 chars")
    @NotBlank(message = "User name cannot be empty")
    private String userName;

    @Schema(description = "Password", example = "1my_password1")
    @Size(max = 255, message = "password length should not be more than 255 chars")
    private String password;
}
