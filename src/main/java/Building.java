class Building {
    String purpose;
    String address;
    int floors_number;
    private String wallMaterial;

    public Building() //default constructor 
    {
        this.purpose = " ";
        this.address = " ";
        this.floors_number = 0;
        this.wallMaterial = " ";
    }

    public Building(String purpose, String address, int floors_number, String wallMaterial) {
        this.purpose = purpose;
        this.address = address;
        this.floors_number = floors_number;
        this.wallMaterial = wallMaterial;
    }

    public void setWallMaterial (String wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    public String getInfo() {
        return (" The purpose is " + purpose + ".\n Address: " + address+".\n Number of floors: " + floors_number + " and wall material is " + wallMaterial);
    }
}

