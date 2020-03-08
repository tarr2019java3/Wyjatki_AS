package pl.sda.wyjatki;

import pl.sda.wyjatki.exceptions.EmailException;

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
        User user = new User();
        user.setLogin("Adam");
        try {
            user.setEmail("madA");
        } catch (EmailException e) {
            e.getMessage("Błędny email!");
            //e.printStackTrace();   // <-wywali na czerwono
        }
        System.out.println("program działa dalej");
    }
}
                                   git