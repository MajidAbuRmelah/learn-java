class Fish extends Animal {
    private int size;

    public Fish(String name, String species, int age, int weight, int size) {
        super(name, species, age, weight);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + ", size: " + size;
    }
}
