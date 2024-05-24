package ru.sshibko.BankClientManager.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import ru.sshibko.BankClientManager.entity.Phone;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Schema(description = "Registration request")
public class SignUpRequest {

    @Schema(description = "User name and surname", example = "John Smith")
    @Size(min = 5, max = 64, message = "User name must contain 5 to 64 chars")
    @NotBlank(message = "User name cannot be empty")
    private String userName;

    @Schema(description = "Password", example = "1my_password1")
    @Size(max = 255, message = "password length should not be more than 255 chars")
    @NotBlank(message = "password cannot be empty")
    private String password;

    @Schema(description = "Initial amount on account", example = "1000")
    @Size(min = 100, max = 2_000_000_000, message = "initial amount must be 1000 to 10_000_000_000")
    @NotBlank
    private BigDecimal amount;

    @Schema(description = "Phone number", example = "+79149002723")
    //TODO Valid for phone
    @NotBlank
    private Phone phone;

    @Schema(description = "Your email address",example = "johnsmith@gmail.com")
    @Size(min = 5, max = 255, message = "Email must contain 5 to 255 chars")
    @NotBlank(message = "Email address cannot be empty")
    @Email(message = "Email address must be in format user@example.com")
    private ru.sshibko.BankClientManager.entity.Email email;

    @Schema(description = "Your birth date", example = "20.05.2001")
    @Size(min = 100, max = 2_000_000_000, message = "initial amount must be 1000 to 10_000_000_000")
    @NotBlank
    private LocalDate birthDate;
}
