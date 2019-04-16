package springapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientsController {
	@Autowired
	private PatientsService patientsService;
	@Autowired
	private PatientsRepository patientsRepository;
	
	@RequestMapping("/patients")
	public List<Patients> getAllPatients()
	{
		return patientsService.getAllPatients();
		//return patientsRepository.findAll();
	}
	
	@RequestMapping("patients/{id}")
	public Patients getPatient(@PathVariable String id)
	{
		return patientsService.getPatient(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/patients")
	public void addPatient(@RequestBody Patients patient)
	{
		patientsService.addPatient(patient);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/patients/{id}")
	public void updatePatient(@RequestBody Patients patient, @PathVariable String id)
	{
		patientsService.updatePatient(id,patient);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/patients/{id}")
	public void deletePatient(@PathVariable String id)
	{
		patientsService.deletePatient(id);
	}
}
