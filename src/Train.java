public class Train {
    private String destination;
    private int trainNumber;
    private String departureTime;
    private int generalSeats;
    private int coupeSeats;
    private int reservedSeats;
    private int luxurySeats;

    public Train(String destination, int trainNumber, String departureTime,
                 int generalSeats, int coupeSeats, int reservedSeats, int luxurySeats) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.generalSeats = generalSeats;
        this.coupeSeats = coupeSeats;
        this.reservedSeats = reservedSeats;
        this.luxurySeats = luxurySeats;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getGeneralSeats() {
        return generalSeats;
    }

    public void setGeneralSeats(int generalSeats) {
        this.generalSeats = generalSeats;
    }

    public int getCoupeSeats() {
        return coupeSeats;
    }

    public void setCoupeSeats(int coupeSeats) {
        this.coupeSeats = coupeSeats;
    }

    public int getReservedSeats() {
        return reservedSeats;
    }

    public void setReservedSeats(int reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    public int getLuxurySeats() {
        return luxurySeats;
    }

    public void setLuxurySeats(int luxurySeats) {
        this.luxurySeats = luxurySeats;
    }

    public String getInfo() {
        return "Train to " + destination + ", Number: " + trainNumber +
                ", Departure Time: " + departureTime +
                ", General Seats: " + generalSeats +
                ", Coupe Seats: " + coupeSeats +
                ", Reserved Seats: " + reservedSeats +
                ", Luxury Seats: " + luxurySeats;
    }
}