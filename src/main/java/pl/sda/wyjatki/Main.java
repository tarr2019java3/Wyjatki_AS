package pl.sda.wyjatki;

import pl.sda.wyjatki.exceptions.EmailException;
import pl.sda.wyjatki.exceptions.WrongInputFormatException;

public class Main {

    public static void main(String[] args) {
//        int tab[] = {1,2,3,4,5};
//        Scanner odczyt = new Scanner(System.in);
//        int index;
//        System.out.println("Podaj indeks tablicy, który chcesz zobaczyć: ");
//        index = odczyt.nextInt();
//        try {
//            System.out.println(tab[index]);
//        } catch (EmailException e) {
//            e.getMessage("Moj wyjatek!");
//            System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
//        }
//        System.out.println("program działa dalej");
        Customer user = new Customer();
        user.setCustomerData();
        System.out.println("program działa dalej");
    }
}