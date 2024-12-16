package pe.edu.cibertec.DAWI_VIDAL_VIVANCO_PAUL_ANDRE.response;

import pe.edu.cibertec.DAWI_VIDAL_VIVANCO_PAUL_ANDRE.dto.CarDto;

public record FindCarsResponse(String code,
                               String error,
                               Iterable<CarDto> cars) {
}
