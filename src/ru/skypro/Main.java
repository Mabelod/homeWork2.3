package ru.skypro;

public class Main {
    public static void main(String[] args) {

        Customer[] customers = {
                new Customer("Сара", 30, 112, 145874),
                new Customer("Том", 35, 115, 145812),
                new Customer("Иван", 25, 114, 145878),
        };

        Gamer[] gamers = {
                new Gamer("Джо", 23, 116, "PC"),
                new Gamer("Джон", 12, 113, "PS"),

        };

        PrintServiceForInvestor printServiceForInvestor = new PrintServiceForInvestor();
        PrintServiceForEmployee printServiceForEmployee = new PrintServiceForEmployee();

        Person[] people = new Person[gamers.length + customers.length];
        for (int i = 0; i < customers.length; i++) {
            people[i] = customers[i];
        }
        for (int i = 0; i < gamers.length; i++) {
            people[i + customers.length] = gamers[i];
        }

        printReport(printServiceForInvestor, customers, gamers, people);
        printReport(printServiceForEmployee, customers, gamers, people);


    }

    private static void printReport(PrintService printService, Customer[] customers, Gamer[] gamers, Person[] people) {
        printService.print(customers);
        printService.print(gamers);
        printService.print(people);
    }
}

