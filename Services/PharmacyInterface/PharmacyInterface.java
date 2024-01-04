package Pharmacy.Services.PharmacyInterface;

import java.util.Date;

public interface PharmacyInterface {
    void addMedicine(String medicineName);
    void deleteMedicine(String medicineName);
    void searchMedicine(String string);
    void searchMedicine(Date receivedDate);


}
