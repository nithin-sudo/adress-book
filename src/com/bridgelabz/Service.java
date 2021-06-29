package com.bridgelabz;
import static com.bridgelabz.AddressBookMain.scanner;
public class Service {
    /**
     * Name : createContact
     * <p>
     * Description:method to set the variables.
     * <p>
     * Algorithm:creating a object of the Person class and by using that object
     * setting the variables from console accordingly and returning the object.
     *
     * @return
     */
    Person[] personContact = null;

    public void createContact() {
        System.out.println("Please enter the number of records you want to enter: ");
        personContact = new Person[scanner.nextInt()];
        for (int i = 0; i < personContact.length; i++) {
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
            person.setPhoneNumber(scanner.nextLong());
            System.out.println("Enter email:");
            person.setEmail(scanner.next());
            personContact[i] = person;
            System.out.println("record added succesfully");
        }
    }
    /**
     *displaying the array.
     */
    public void showContact() {
        for (int i = 0; i < personContact.length; i++) {
            System.out.println(personContact[i]);
        }
    }
    /**
     *asking user to enter the desired field to be edited and replacing it accordingly.
     */
    public void editContact() {
        System.out.println("enter the phone Number of a record to be edited:");
        long phoneNumber = scanner.nextLong();
        System.out.println("enter the record you want to edit 1.first name 2.Last name 3.address 4.city 5.state 6.zip code 7.phone number 8.email");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("enter the first name you want to replace:");
                String replaceFirstName = scanner.next();
                for (int i = 0; i < personContact.length; i++) {
                    if (personContact[i].getPhoneNumber() == (phoneNumber)) {
                        personContact[i].setFirstName(replaceFirstName);
                    }
                }
                break;
            case 2:
                System.out.println("enter the last name you want to replace:");
                String replaceLastName = scanner.next();
                for (int i = 0; i < personContact.length; i++) {
                    if (personContact[i].getPhoneNumber() == (phoneNumber)) {
                        personContact[i].setLastName(replaceLastName);
                    }
                }
                break;
            case 3:
                System.out.println("enter the address you want to replace:");
                String replacedAddress = scanner.next();
                for (int i = 0; i < personContact.length; i++) {
                    if (personContact[i].getPhoneNumber() == (phoneNumber)) {
                        personContact[i].setAddress(replacedAddress);
                    }
                }
                break;
            case 4:
                System.out.println("enter the city you want to replace:");
                String replacedCity = scanner.next();
                for (int i = 0; i < personContact.length; i++) {
                    if (personContact[i].getPhoneNumber() == (phoneNumber)) {
                        personContact[i].setCity(replacedCity);
                    }
                }
                break;
            case 5:
                System.out.println("enter the state you want to replace:");
                String replacedState = scanner.next();
                for (int i = 0; i < personContact.length; i++) {
                    if (personContact[i].getPhoneNumber() == (phoneNumber))
                        personContact[i].setState(replacedState);
                }
                break;
            case 6:
                System.out.println("enter the zip you want to replace:");
                String replacedZip = scanner.next();
                for (int i = 0; i < personContact.length; i++) {
                    if (personContact[i].getPhoneNumber() == (phoneNumber))
                        personContact[i].setZip(replacedZip);
                }
                break;
            case 7:
                System.out.println("enter the phone number you want to replace:");
                long replacedPhoneNumber = scanner.nextLong();
                for (int i = 0; i < personContact.length; i++) {
                    if (personContact[i].getPhoneNumber() == (phoneNumber))
                        personContact[i].setPhoneNumber(replacedPhoneNumber);
                }
                break;
            case 8:
                System.out.println("enter the email you want to replace:");
                String replacedEmail = scanner.next();
                for (int i = 0; i < personContact.length; i++) {
                    if (personContact[i].getPhoneNumber() == (phoneNumber))
                        personContact[i].setEmail(replacedEmail);
                }
                break;
            default:
                System.out.println("invalid choice");
        }
    }
    /**
     * asking user to enter a mobile number and deleting a record accordingly.
     */
    public void deleteContact()
        {
            System.out.println("Enter a mobile number to delete a contact:");
            long phoneNumber = scanner.nextLong();
            for(int i = 0; i < personContact.length; i++) {
                if (personContact[i].getPhoneNumber() == (phoneNumber))
                {
                    personContact[i]=null;
                }
            }


        }
}
