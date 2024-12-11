package Task2;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
	private String address;
	private String medicalHistory;

	public Patient(String id, String name, String contact,String address, String medicalHistory) {
		super(id, name, contact);
		this.address = address;
		this.medicalHistory = medicalHistory;
	}
	
	public String getAddress() {
        return address;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

}


class PatientManager {
    private List<Patient> patients = new ArrayList<>();

    public void registerPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient registered: " + patient.getName());
    }

    public Patient findPatient(String id) {
        return patients.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
