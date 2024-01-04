package Pharmacy.Models;

public class SalesDocItem {
    public int sales_doc_id;
    public int dori_id;
    public float quantity;
    public float price;

    public SalesDocItem(int sales_doc_id, int dori_id, float quantity, float price) {
        this.sales_doc_id = sales_doc_id;
        this.dori_id = dori_id;
        this.quantity = quantity;
        this.price = price;
    }
}
