public class Pet {
    //private data fields
    private String name;
    private String type;
    private int age;

    //default constructor
    public Pet() {
        this.setName("");
        this.type = "";
        this.age = 0;
    }

    //custom constructor
    public Pet(String newName, String newType, int newAge) {
        this.setName(newName);
        this.type = newType;
        this.age = newAge;
    }

    //public set or mutator for every private data field (except when the data field is read-only)
    public void setName(String newName) {
        this.name = newName;
    }

    //public get or accessor method for every private data field(except if it is a secret)
    public String getName() {
        return this.name;

    }

    //public toString method that prints out all of the objects state
    public String toString() {
        String output = "Pet name: ";
        output += this.getName();
        return output;
    }
}


