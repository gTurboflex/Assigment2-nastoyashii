class Course extends UniversityEntity {
    private int credits;
    private int barcode;

    public Course(String name, int credits, int barcode) {
        super(name);
        this.credits = credits;
        this.barcode = barcode;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    @Override
    public void display() {
        System.out.println("Course Name: " + getName());
        System.out.println("Credits: " + credits);
        System.out.println("Barcode: " + barcode);
    }

    @Override
    public String toString() {
        return super.toString() + ", Credits: " + credits + ", Barcode: " + barcode;
    }
}