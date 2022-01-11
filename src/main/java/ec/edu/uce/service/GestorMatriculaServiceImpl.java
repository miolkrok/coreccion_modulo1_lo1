package ec.edu.uce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelos.Vehiculos;
import ec.edu.uce.repositorio.IMatriculaVehiculosRepo;


@Service
public class GestorMatriculaServiceImpl implements IMatriculaVehiculoService{
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaVehiculosRepo vehiculoA;
	
	@Autowired
	@Qualifier("pesado")
	private IMatriculaVehiculosRepo vehiculoB;

	private static final Logger LOG =  LoggerFactory.getLogger(GestorMatriculaServiceImpl.class);

	@Override
	public void matricularVehiculo(Vehiculos vehiculo) {
		if(vehiculo.getTipo() == "pesado") {
			double valor=(vehiculo.getPrecio()*0.25);
			vehiculo.setValorMatricula(valor);
			LOG.info("SE HA GUARDADO");
			
		}else  if(vehiculo.getTipo() == "liviano"){
			double valor=(vehiculo.getPrecio()*0.10);
			vehiculo.setValorMatricula(valor);
			LOG.info("SE HA GUARDADO");
		}else {
			LOG.warn("NO EXISTE EL TIPO DE VEHICULO!!");
		}
			
		
		
	}

	@Override
	public void imprimirVehiculo(Vehiculos vehiculo) {
		if(vehiculo.getTipo() == "pesado") {
			this.vehiculoB.crear(vehiculo);
			
			
		}else  if(vehiculo.getTipo() == "liviano"){
			this.vehiculoA.crear(vehiculo);
		}else {
			LOG.error("NO EXISTE EL TIPO DE VEHICULO!!");
		}
		
		
	}



}
