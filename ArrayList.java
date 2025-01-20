import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store 10 members
        ArrayList<String> members = new ArrayList<>();

        // Add 10 members to the ArrayList
        members.add("Alice");
        members.add("Bob");
        members.add("Charlie");
        members.add("David");
        members.add("Eve");
        members.add("Frank");
        members.add("Grace");
        members.add("Hannah");
        members.add("Ivy");
        members.add("Jack");

        // Display the members
        System.out.println("Members in the list:");
        for (String member : members) {
            System.out.println(member);
        }
    }
}
