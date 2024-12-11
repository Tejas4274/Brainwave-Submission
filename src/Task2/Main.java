package Task2;

public class Main {

	public static void main(String[] args) {
        PatientManager patientManager = new PatientManager();
        AppointmentManager appointmentManager = new AppointmentManager();
        BillingManager billingManager = new BillingManager();
        InventoryManager inventoryManager = new InventoryManager();

        Patient patient = new Patient("P001", "Atharva", "1234567890", "123 Main St", "No allergies");
        patientManager.registerPatient(patient);

        Appointment appointment = new Appointment("P001", "Dr. Smith", "2024-12-15 10:00 AM");
        appointmentManager.scheduleAppointment("A001", appointment);

        Invoice invoice = new Invoice("I001", "P001", 500.0);
        billingManager.generateInvoice(invoice);

        MedicalSupply supply = new MedicalSupply("Syringe", 100);
        inventoryManager.addSupply(supply);

        inventoryManager.updateSupply("Syringe", 120);
    }
}
