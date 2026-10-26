abstract class Asset {
    private final int id;
    private final String description;
    private final double purchasePrice;

    Asset(int id, String description, double purchasePrice) {
        this.id = id;
        this.description = description;
        this.purchasePrice = purchasePrice;
    }

    int getId() { return id; }
    String getDescription() { return description; }
    double getPurchasePrice() { return purchasePrice; }

    abstract String getCategory();
    abstract String getDetails();

    @Override
    public String toString() {
        return String.format("#%d [%s] %s - Rs.%.0f (%s)", id, getCategory(), description, purchasePrice, getDetails());
    }
}

class ElectronicAppliance extends Asset {
    private final int warrantyYears;

    ElectronicAppliance(int id, String description, double price, int warrantyYears) {
        super(id, description, price);
        this.warrantyYears = warrantyYears;
    }

    String getCategory() { return "Electronic Appliance"; }
    String getDetails() { return "warranty: " + warrantyYears + " yrs"; }
}

class AutomobileAsset extends Asset {
    private final String registrationNo;

    AutomobileAsset(int id, String description, double price, String registrationNo) {
        super(id, description, price);
        this.registrationNo = registrationNo;
    }

    String getCategory() { return "Automobile"; }
    String getDetails() { return "reg: " + registrationNo; }
}

class Furniture extends Asset {
    private final String material;

    Furniture(int id, String description, double price, String material) {
        super(id, description, price);
        this.material = material;
    }

    String getCategory() { return "Furniture"; }
    String getDetails() { return "material: " + material; }
}

class CompactDisk extends Asset {
    private final String title;

    CompactDisk(int id, String description, double price, String title) {
        super(id, description, price);
        this.title = title;
    }

    String getCategory() { return "Compact Disk"; }
    String getDetails() { return "title: " + title; }
}

public class AssetTracker {
    public static void main(String[] args) {
        Asset[] assets = {
            new ElectronicAppliance(1, "Refrigerator", 85000, 5),
            new AutomobileAsset(2, "Toyota Corolla", 4500000, "ABC-123"),
            new Furniture(3, "Office desk", 25000, "Wood"),
            new CompactDisk(4, "Software installation disk", 150, "Visual Studio Setup")
        };

        double total = 0;
        for (Asset a : assets) {
            System.out.println(a);
            total += a.getPurchasePrice();
        }
        System.out.println("Total value: Rs." + total);
    }
}
