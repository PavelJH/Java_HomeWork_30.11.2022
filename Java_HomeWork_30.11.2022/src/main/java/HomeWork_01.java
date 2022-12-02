public class HomeWork_01 {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("My_Name", 20);
        Phone phone = new Phone(016, "nokia", 32.3);
        Phone phone1 = new Phone(112, "iphone");
        Phone phone2 = new Phone("samsung", 15.3 );
        System.out.println(phone);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone + " " + phone1 + " " + phone2);
        System.out.printf("%s first p %s \n second F %s ", phone, phone1, phone2);
        System.out.println();
        System.out.println("Calling " +  phone.receiveCall() + " " + phone.getNumber());
        System.out.println("Calling " +  phone1.receiveCall() + " " + phone1.getNumber());
        System.out.println("Calling " +  phone2.receiveCall() + " " + phone2.getNumber());




    }
}
