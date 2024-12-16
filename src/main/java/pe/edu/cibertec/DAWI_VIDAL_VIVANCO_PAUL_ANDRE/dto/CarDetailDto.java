package pe.edu.cibertec.DAWI_VIDAL_VIVANCO_PAUL_ANDRE.dto;

import java.time.LocalDate;
import java.util.Date;

public record CarDetailDto(Integer id,
                           String make,
                           String model,
                           Integer year,
                           String vin,
                           String licensePlate,
                           String ownerName,
                           String ownerContact,
                           LocalDate purchaseDate,
                           Integer mileage,
                           String engineType,
                           String color,
                           String insuranceCompany,
                           String insurancePolicyNumber,
                           LocalDate registrationExpirationDate,
                           LocalDate serviceDueDate) {
}
