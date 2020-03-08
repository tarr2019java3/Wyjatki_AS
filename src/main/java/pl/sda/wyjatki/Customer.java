package pl.sda.wyjatki;

import com.github.freva.asciitable.AsciiTable;
import pl.sda.wyjatki.exceptions.EmailException;
import pl.sda.wyjatki.exceptions.InvalidAgeException;
import pl.sda.wyjatki.exceptions.WrongInputFormatException;

import java.util.Scanner;

public class Customer {
    private String name, surname;
    private String email;
    private int age;

    public Customer() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws WrongInputFormatException {
        if (checkLoginFormat(name)) {
            throw new WrongInputFormatException();
        } else {
            this.surname = surname;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws WrongInputFormatException {
        if (checkLoginFormat(name)) {
            throw new WrongInputFormatException();
        } else {
            this.name = name;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailException {
        if (!this.checkEmail(email)) {
            throw new EmailException("Niepoprawny email");
        } else {
            this.email = email;
        }
    }

    public boolean checkEmail(String email) {
        if (email.contains("@") && email.contains("."))
            return true;
        else
            return false;
    }

    public boolean checkLoginFormat(String login) {
        char[] logChar = login.toCharArray();
        Character[] ascii = AsciiTable.BASIC_ASCII;
        for (int x = 0; x < logChar.length; x++) {
            for (int y = 0; y < ascii.length; y++) {
                while (logChar[x] == ascii[y]) {
                    return true;
                }
            }
        }
        return false;

    }

    public void setCustomerData() {
        String name;
        String surname;
        String email;
        int age;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {

                System.out.print("Podaj imię: ");
                name = scanner.nextLine();
                name.toUpperCase();

                if (checkLoginFormat(name))
                    break;
                else
                    setName(name);

            } catch (WrongInputFormatException e) {
                e.getMessage("Zły format imienia. Dozwolone są Wielkie litery i spacja");
            }
            try {

                System.out.print("Podaj nazwisko: ");
                surname = scanner.nextLine();
                surname.toUpperCase();
                if (checkLoginFormat(surname))
                    break;
                else
                    setSurname(surname);

            } catch (WrongInputFormatException e) {
                e.getMessage("Zły format imienia. Dozwolone są Wielkie litery i spacja");
            }
            try {

                System.out.print("Podaj email: ");
                email = scanner.nextLine();
                if (checkEmail(email))
                    break;
                else
                    setEmail(email);


            } catch (EmailException e) {

                e.getMessage("Błędny email!");
                //e.printStackTrace();   // <-wywali na czerwono
            }
            try {
                System.out.print("Podaj wiek: ");
                age = scanner.nextInt();
                if (age < 18)
                    break;
                else
                    setAge(age);
            } catch (InvalidAgeException e) {
                e.getMessage("Musisz mieć powyżej 18 lat");
            }
        }
    }
}
