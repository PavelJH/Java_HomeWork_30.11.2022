public class Phone {
    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String model, double weight) {
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    private String model;
    private double weight;
    private int number;

    public int getNumber() {
        return number;
    }

    public String receiveCall(){
        String name = "Pavel";
        return name;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }


}


