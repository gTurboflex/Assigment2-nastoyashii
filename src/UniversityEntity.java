abstract class UniversityEntity {
    private String name;

    public UniversityEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();

    @Override
    public String toString() {
        return "Entity Name: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        UniversityEntity that = (UniversityEntity) obj;
        return name.equals(that.name);
    }
}
