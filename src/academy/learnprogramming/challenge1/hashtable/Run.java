package academy.learnprogramming.challenge1.hashtable;

public class Run {
    public static void main(String[] args) {
        Employee nonna = new Employee(123134, "Sr. Software Developer", "Nonna", "Dhzbaieva");
        Employee nino = new Employee( 337374, "Baby Urist", "Nino", "Kurbanova");
        Employee anna = new Employee( 987688, "Telenovella Writer", "Anna", "Kurbanova");
        Employee alan = new Employee( 838475, "Dentist", "Alan", "Dhzbaiev");
        Employee bruno = new Employee(384872, "Just lovely doggo", "Bruno", "Brunidze");

        NonnasHashTable<String, Employee> haha = new NonnasHashTable<>(13);
        haha.put(nonna.getPosition(), nonna);
        haha.put(nino.getPosition(), nino);
        haha.put(alan.getPosition(), alan);
        haha.put(anna.getPosition(), anna);
        haha.put(bruno.getPosition(), bruno);


        haha.printTable();

        System.out.println("Get nonna from table " + haha.get(nonna.getPosition()));

    }
}
