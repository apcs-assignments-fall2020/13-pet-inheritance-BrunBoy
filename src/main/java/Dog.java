public class Dog extends Pet {
    // Instance variable(s)
    private String breed;
    private int age;
    private String name;

    // Constructors
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed=breed;
    }

    // makeNoise() method
    public Dog(){
        System.out.println("bark");
    }

    // toString method
    public String toString(){
        String str = "Name: " + name + ", Age: " + age + ", Breed: " + breed;
        return str;
    }

    // Getter
    public String getBreed(){
        return this.breed;
    }

    // Setter
    public void setBreed(String breed){
        this.breed=breed;
    }
}