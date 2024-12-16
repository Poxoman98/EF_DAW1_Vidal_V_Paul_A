package pe.edu.cibertec.DAWI_VIDAL_VIVANCO_PAUL_ANDRE.response;

import pe.edu.cibertec.DAWI_VIDAL_VIVANCO_PAUL_ANDRE.dto.CarDetailDto;

public record FindCarResponse (String code,
                              String error,
                              CarDetailDto car){
}
