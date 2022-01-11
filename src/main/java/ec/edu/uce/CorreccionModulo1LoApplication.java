package ec.edu.uce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelos.Propietario;
import ec.edu.uce.modelos.Vehiculos;
import ec.edu.uce.service.IMatriculaVehiculoService;

@SpringBootApplication
public class CorreccionModulo1LoApplication implements CommandLineRunner{
	private static final Logger LOG = LoggerFactory.getLogger(CorreccionModulo1LoApplication.class);

	@Autowired
	private IMatriculaVehiculoService vehiculoService;
	

	public static void main(String[] args) {
		SpringApplication.run(CorreccionModulo1LoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		Vehiculos vehiculo1 = new Vehiculos();
		Propietario pro = new Propietario();

		vehiculo1.setMarca("Audi");
		vehiculo1.setPlaca("pdo3520");
		vehiculo1.setPaisOrigen("iran");
		vehiculo1.setPropietario(pro);
		pro.setNombre("JUANITO");
		pro.setApellido("CALDERON");
		pro.setCedula("1718496944");
		vehiculo1.setTipo("pesado");
		vehiculo1.setPrecio(10000);
		

		
	if(vehiculo1.getPrecio()<=0) {
        LOG.error("el precio es incorrecto.");
        
    }else if(vehiculo1.getPrecio()<10000) {
        LOG.warn("El precio es muy bajo");
    }else if(vehiculo1.getPrecio()>=10000){
        LOG.info("El precio es adecuado");
        this.vehiculoService.matricularVehiculo(vehiculo1);
        this.vehiculoService.imprimirVehiculo(vehiculo1);
    }else {
    	LOG.info("numeros negativos");
    }
		
	}
}
