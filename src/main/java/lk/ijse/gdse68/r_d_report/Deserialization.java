package lk.ijse.gdse68.r_d_report;

import java.io.*;

    // A simple class that implements Serializable
    class Man extends Serialization {
        private static final long serialVersionUID = 1L; // For serialization compatibility
        private String name;
        private int age;

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + '}';
        }
    }

    public class Deserialization {
        public static void main(String[] args) {
            // Deserialize the object from the file
            Person deserializedPerson = null;
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
                deserializedPerson = (Person) in.readObject();
                System.out.println("Deserialization successful");
                System.out.println("Deserialized Person: " + deserializedPerson);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }


}
