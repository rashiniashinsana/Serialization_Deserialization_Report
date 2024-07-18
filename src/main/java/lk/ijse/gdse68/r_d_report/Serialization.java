package lk.ijse.gdse68.r_d_report;

    import java.io.*;

    // A simple class that implements Serializable
    class Person extends Serialization {
        private static final long serialVersionUID = 1L; // For serialization compatibility
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + '}';
        }
    }

    public class Serialization {
        public static void main(String[] args) {
            // Create a Person object
            Person person = new Person("Alice", 30);
            System.out.println("Original Person: " + person);

            // Serialize the object to a file
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
                out.writeObject(person);
                System.out.println("Serialization successful");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


