class Animal {
    // Properties
    private String name;
    private String species;
    private int age;
    private int weight;
    private Room room;

    // Static Properties
    public static int count;

    // Constructor
    public Animal(String name, String species, int age, int weight) {
        setName(name);
        this.species = species;
        this.age = age;
        this.weight = weight;
        room = new Room();
    }

    /*** Methods ***/
    // Getters //
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public Room getRoom() {
        return room;
    }

    // Setters //
    public void setName(String name) {
        this.name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }

    // General //
    // Overloading
    public void makeSound() {
        System.out.println("Grrr");
    }

    public String makeSound(String extra) {
        return "Grrr " + extra;
    }

    public void makeSound(String extra, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Grrr " + extra);
        }
    }

    // Override
    @Override
    public String toString() {
        return "name: " + name + ", species: " + species + ", age: " + age
                + ", weight: " + weight + "kg";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Animal animal = (Animal) o;
        return age == animal.age && weight == animal.weight && name.equals(animal.name)
                && species.equals(animal.species);
    }

    /*** Functions ***/
    public static void DisplayHabitat() {
        System.out.println("Jungle");
    }

    public static void IncreaseCount() {
        count++;
    }

    public static void IncreaseCount(int num) {
        count += num;
    }

    public static int GetCount() {
        return count;
    }
}
