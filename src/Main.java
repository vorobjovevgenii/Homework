//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone ("+375295463728", "Iphone", 200);
        Phone phone2 = new Phone ("+375295462367", "Iphone", 180);
        Phone phone3 = new Phone ("+375295460912", "Xiaomi", 220);

        System.out.println("Phone 1: " + phone1.info());
        System.out.println("Phone 2: " + phone2.info());
        System.out.println("Phone 3: " + phone3.info());

        System.out.println(phone1.receiveCall("Женя"));
        System.out.println(phone2.receiveCall("Аня"));
        System.out.println(phone3.receiveCall("Таня"));
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        System.out.println(phone1.receiveCall("Женя",  "+37529641246"));
    }
}

