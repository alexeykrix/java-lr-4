public class TrainArrayCreator {
    public static void main(String[] args) {
        Train[] trains = new Train[3];
        trains[0] = new Train("Kyiv", 101, "10:00", 50, 20, 30, 10);
        trains[1] = new Train("Lviv", 202, "12:30", 40, 15, 25, 5);
        trains[2] = new Train("Odessa", 303, "15:45", 60, 25, 35, 15);

        // Виведення інформації про кожен поїзд
        for (Train train : trains) {
            System.out.println(train.getInfo());
        }
    }
}