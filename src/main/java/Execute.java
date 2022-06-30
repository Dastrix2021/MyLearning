public class Execute {
    public static void main(String[] args) {
        Building cafe = new Building();
        cafe.purpose = "organization of recreation";
        cafe.address = "London, Baker Street";
        cafe.floors_number = 2;
        // cafe.wallMaterial="brick"; // error because of private type
        cafe.setWallMaterial("brick");
        System.out.println("Information about the cafe:\n" + cafe.getInfo());

        Building shop = new Building("organization of shopping", "London, Crawford street", 1, "wood");
        System.out.println("Information about the shop:\n" + shop.getInfo());
    }
}
