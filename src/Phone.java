public class Phone {
    String number;
    String model;
    double weight;

    public Phone(){
    }

    public Phone(String number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;

        Phone phoneTest = new Phone ("+37544 876 38 29", "Honor");
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public String info(){
        return "Phone{" + "number = " + number +
                ", model = " + model +
                ", weight = " + weight +
                "}.";
    }

    String receiveCall(String name){
        return "Звонит " + name;
    }

    String receiveCall(String name, String num){
        return "Звонит " + name + ". " + num;
    }

    String getNumber(){
        return number;
    }

    void sendMessage (String ... array){
        System.out.println("Количество телефонов: " + array.length);
        for (String i : array){
            System.out.println("Привет." + i);
        }
    }

}
