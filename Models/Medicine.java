package Pharmacy.Models;

public class Medicine {
    public String name;
    public TypeOfMedicine typeOfMedicine;
    public float price;
    public Unit unit;

    public int quantity;

    public Medicine(String name, TypeOfMedicine typeOfMedicine, float price, Unit unit, int quantity) {
        this.name = name;
        this.typeOfMedicine = typeOfMedicine;
        this.price = price;
        this.unit = unit;
        this.quantity = quantity;
    }
}
