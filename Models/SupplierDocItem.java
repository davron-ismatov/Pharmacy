package Pharmacy.Models;

public class SupplierDocItem {
    public int supplier_doc_id;
    public int medicine_id;
    public float quantity;
    public float total_cash;

    public SupplierDocItem(int supplier_doc_id, int medicine_id, float quantity, float total_cash) {
        this.supplier_doc_id = supplier_doc_id;
        this.medicine_id = medicine_id;
        this.quantity = quantity;
        this.total_cash = total_cash;
    }
}
