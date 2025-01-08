class University extends UniversityEntity {
    public University(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("University: " + getName());
    }
}
