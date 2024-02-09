class Program {
    public static void main(String[] args) {
        System.out.println("Program Started!");

        // Initiate Animal
        Animal animal = new Animal("rex", "dog", 10, 5);

        // Make Sound
        animal.makeSound();
        System.out.println(animal.makeSound("Woof Woof"));
        animal.makeSound("Woof", 5);

        // Print Room
        System.out.println("Animal Room: " + animal.getRoom());

        // Override toString
        System.out.println(animal.toString());

        // Override Equals
        System.out.println(animal.equals(animal));

        // The Difference between Reference Type and Value Type //
        // Reference Type
        System.out.println("Original Name: " + animal.getName());
        ChangeAnimalName(animal, "bruno");
        System.out.println("Changed Name: " + animal.getName());

        // Value Type
        int x = 10;
        System.out.println(x);
        ChangeXValue(x);
        System.out.println(x);

        // Static Functions //
        Animal.DisplayHabitat();

        // Increase Count
        Animal.IncreaseCount();
        Animal.IncreaseCount();
        Animal.IncreaseCount();
        Animal.IncreaseCount(5);
        System.out.println(Animal.GetCount());

        // Inheritance //
        Fish fish = new Fish("nemo", "salamon", 2, 1, 2);
        System.out.println(fish);

        // Recursive Usage //
        System.out.println(RecursiveFuncs.AddFive(3, 30));
        System.out.println(NormalFuncs.AddFive(3, 30));
        System.out.println(RecursiveFuncs.FactorialCalculation(5));
        System.out.println(RecursiveFuncs.Exponentiation(5, 3));
        System.out.println(RecursiveFuncs.Exponentiation(4, 6));
        System.out.println(RecursiveFuncs.SumOfDigits(555));
    }

    public static void ChangeAnimalName(Animal animal, String name) {
        animal.setName(name);
    }

    public static void ChangeXValue(int x) {
        x = 20;
    }
}
