package pe.edu.cibertec.DAWI_VIDAL_VIVANCO_PAUL_ANDRE.service;

import pe.edu.cibertec.DAWI_VIDAL_VIVANCO_PAUL_ANDRE.dto.CarDetailDto;
import pe.edu.cibertec.DAWI_VIDAL_VIVANCO_PAUL_ANDRE.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {

    List<CarDto>getAllCars() throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarDetailDto carDetailDto) throws Exception;
}
