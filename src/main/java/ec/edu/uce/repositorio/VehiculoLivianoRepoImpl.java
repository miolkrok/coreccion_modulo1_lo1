package ec.edu.uce.repositorio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelos.Vehiculos;

@Repository
@Qualifier("liviano")
public class VehiculoLivianoRepoImpl implements IMatriculaVehiculosRepo {
	
	private String cilindrajeTurbo;
	
	private static final Logger LOG =  LoggerFactory.getLogger(VehiculoLivianoRepoImpl.class);

	@Override
	public void crear(Vehiculos vehiculos) {

			
			LOG.info("vehiculo Liviano" +vehiculos);
		
	}

	public String getCilindrajeTurbo() {
		return cilindrajeTurbo;
	}

	public void setCilindrajeTurbo(String cilindrajeTurbo) {
		this.cilindrajeTurbo = cilindrajeTurbo;
	}

	@Override
	public String toString() {
		return "VehiculoLivianoRepoImpl [cilindrajeTurbo=" + cilindrajeTurbo + "]";
	}



}
