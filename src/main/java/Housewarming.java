import java.util.*;

class Wall
{
    public String material;
    public int high;

    public Wall(String material, int high) {
        this.material = material;
        this.high = high;
    }

    @Override
    public String toString() {
        return "material is '" + material + '\'' +
                ", high = " + high + " ft.";
    }
}

class Furniture
{
    public String name;
    public int cost;

    public Furniture(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "\nname = '" + name + '\'' +
                ", cost = $" + cost;
    }
}

class Apartment {
    public String street;
    public int apartmentNo;
    private Wall walls;
    private Furniture[] furniture;

    public Apartment(String street, int apartmentNo, String material, int high, Furniture[] furniture) {
        this.street = street;
        this.apartmentNo = apartmentNo;
        walls = new Wall (material,high);
        this.furniture = furniture;
    }

    @Override
    public String toString() {
        return "The address is" +
                " '" + street + " St' " +
                apartmentNo + ", walls " + walls +
                ", furniture=" + Arrays.toString(furniture);
    }

    public int getTotalFurnitureCost(Furniture[] furniture) {
        int totalAmount=0;
        for (Furniture furnit: furniture) {
            totalAmount+=furnit.cost;
        }
        return totalAmount;
    }
}

public class Housewarming {
    public static void main(String []args) {
        Furniture[] furniture = new Furniture[] {
                new Furniture("bed", 150),
                new Furniture("cupboard",250),
                new Furniture("table", 35),
                new Furniture("armchair", 80),
        };
        Apartment flat1 = new Apartment("Bronco", 3050,"brick", 23, furniture);

        System.out.println("Information about the first apartment:\n" + flat1);
        System.out.println("Total furniture cost is: $" + flat1.getTotalFurnitureCost(furniture));
    }
}
