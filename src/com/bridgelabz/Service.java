package com.bridgelabz;
import static com.bridgelabz.AddressBookMain.scanner;
public class Service {
    /**
     * Name : createContact
     *
     * Description:method to set the variables.
     *
     * Algorithm:creating a object of the Person class and by using that object
     * setting the variables from console accordingly and returning the object.
     * @return
     */
    Person[] personContact =null ;
    public void createContact(){
        System.out.println("Please enter the number of strings you want to enter: ");
        personContact= new Person[scanner.nextInt()];
        for(int i=0;i< personContact.length;i++) {
            Person person = new Person();
            System.out.println("enter the first name: ");
            person.setFirstName(scanner.next());
            System.out.println("Enter last name:");
            person.setLastName(scanner.next());
            System.out.println("Enter address:");
            person.setAddress(scanner.next());
            System.out.println("Enter city:");
            person.setCity(scanner.next());
            System.out.println("Enter state:");
            person.setState(scanner.next());
            System.out.println("Enter zip code:");
            person.setZip(scanner.next());
            System.out.println("Enter phoneNumber:");
            person.setPhoneNumber(scanner.next());
            System.out.println("Enter email:");
            person.setEmail(scanner.next());
            personContact[i]=person;
            System.out.println("record added succesfully");
        }
    }
    public void showContact(){
        for (int i =0;i< personContact.length;i++) {
            System.out.println(personContact[i]);
        }
    }

}
