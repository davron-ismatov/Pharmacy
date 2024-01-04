package Pharmacy.Models;

import java.sql.Date;

public class SupplierDoc {
    public int supplier_id;
    public Date received_date;
    public PaymentType type;
    public double total_cash;

    public SupplierDoc(int supplier_id, Date received_date, PaymentType type, double total_cash) {
        this.supplier_id = supplier_id;
        this.received_date = received_date;
        this.type = type;
        this.total_cash = total_cash;
    }
}
