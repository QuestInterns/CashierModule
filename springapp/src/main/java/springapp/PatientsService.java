package springapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PatientsService {
	private List<Patients> patients = new ArrayList<>(Arrays.asList(
			new Patients("1","Aliah Grace Miranda","Something"),
			new Patients("2","Daryl Adriano","Something"),
			new Patients("3","Timmy Rivera","Something")
			));
	
	public List<Patients> getAllPatients()
	{
		return patients;
	}
	
	public Patients getPatient(String id)
	{
		return patients.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addPatient(Patients patient)
	{
		patients.add(patient);
	}

	public void updatePatient(String id, Patients patient)
	{
		for(int i = 0; i<patients.size(); i++)
		{
			Patients t = patients.get(i);
			if(t.getId().equals(id))
			{
				patients.set(i, patient);
				return;
			}
		}
	}

	public void deletePatient(String id)
	{
		patients.removeIf(t -> t.getId().equals(id));
		
	}
}
