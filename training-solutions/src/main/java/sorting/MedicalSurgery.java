package sorting;

import java.util.*;

public class MedicalSurgery {

    private List<Patient> patients;

    public MedicalSurgery(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatients() {
        return new ArrayList<>(patients);
    }

    public List<Patient> getPatientsInTimeOrder() {
        PatientComparator patientComparator = new PatientComparator();
        List<Patient> patientsSorted = new ArrayList<>(patients);
        patientsSorted.sort(patientComparator);
        return patientsSorted;
    }
}
