public class Main {
    public static void main(String[] args) {
        UniversityEntity[] entities = new UniversityEntity[] {
                new University("Tech University"),
                new Professor("Mr. Smith", 45),
                new Course("Data Structures", 4, 789123),
                new Professor("Dr. Brown", 50),
                new Course("Algorithms", 3, 123456)
        };

        // Display all entities
        for (UniversityEntity entity : entities) {
            entity.display();
            System.out.println();
        }
    }
}