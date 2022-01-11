package ec.edu.uce.repositorio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelos.Vehiculos;

@Repository
@Qualifier("pesado")
public class VehiculoPesadoRepoImpl implements IMatriculaVehiculosRepo {
	
	private String pesoToneladas;
	
	private static final Logger LOG =  LoggerFactory.getLogger(VehiculoPesadoRepoImpl.class);

	@Override
	public void crear(Vehiculos vehiculos) {
		
		LOG.info("vehiculo pesado" +vehiculos );
		
	}

	public String getPesoToneladas() {
		return pesoToneladas;
	}

	public void setPesoToneladas(String pesoToneladas) {
		this.pesoToneladas = pesoToneladas;
	}

	@Override
	public String toString() {
		return "VehiculoPesadoRepoImpl [pesoToneladas=" + pesoToneladas + "]";
	}

	
}
