package Task2;

import java.util.*;

class Invoice {
    private String invoiceId;
    private String patientId;
    private double amount;

    public Invoice(String invoiceId, String patientId, double amount) {
        this.invoiceId = invoiceId;
        this.patientId = patientId;
        this.amount = amount;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getPatientId() {
        return patientId;
    }

    public double getAmount() {
        return amount;
    }
}

class BillingManager {
    private List<Invoice> invoices = new ArrayList<>();

    public void generateInvoice(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Invoice generated for patient ID: " + invoice.getPatientId());
    }

    public Invoice findInvoice(String invoiceId) {
        return invoices.stream().filter(i -> i.getInvoiceId().equals(invoiceId)).findFirst().orElse(null);
    }
}
