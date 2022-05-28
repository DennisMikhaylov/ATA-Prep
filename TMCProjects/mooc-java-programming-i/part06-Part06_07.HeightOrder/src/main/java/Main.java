
public class Main {

    public static void main(String[] args) {
        Room room = new Room();

        room.add(new Person("Adam", 100));
        room.add(new Person("Bob", 90));
        room.add(new Person("Charlie", 110));
        room.add(new Person("David", 80));
        room.add(new Person("Edgar", 120));
        room.add(new Person("Fred", 70));

        System.out.println(room.take());
        System.out.println(room.take());
        System.out.println(room.take());
        System.out.println(room.take());
        System.out.println(room.take());
        System.out.println(room.take());
        System.out.println(room.take());
    }
}
