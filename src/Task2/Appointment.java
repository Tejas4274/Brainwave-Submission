package Task2;

import java.util.HashMap;
import java.util.Map;

class Appointment {
    private String patientId;
    private String doctorName;
    private String dateTime;

    public Appointment(String patientId, String doctorName, String dateTime) {
        this.patientId = patientId;
        this.doctorName = doctorName;
        this.dateTime = dateTime;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDateTime() {
        return dateTime;
    }
}

class AppointmentManager {
    private Map<String, Appointment> appointments = new HashMap<>();

    public void scheduleAppointment(String appointmentId, Appointment appointment) {
        appointments.put(appointmentId, appointment);
        System.out.println("Appointment scheduled for patient ID: " + appointment.getPatientId());
    }

    public Appointment getAppointment(String appointmentId) {
        return appointments.get(appointmentId);
    }
}
