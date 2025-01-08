class Professor extends UniversityEntity {
    private int age;

    public Professor(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println("Professor Name: " + getName());
        System.out.println("Age: " + age);
    }

    @Override
    public String toString() {
        return super.toString() + ", Age: " + age;
    }
}
