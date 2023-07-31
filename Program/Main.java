package Program;

import java.util.ArrayList;
import java.util.Scanner;

import Program.Classes.Cats;
import Program.Classes.Dogs;
import Program.Classes.Hamsters;
import Program.Classes.Pets;

public class Main {

    public static int getNum(Scanner scanner) {
        int num;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Неправильный ввод !!!");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num <= 0);
        return num;
    }

    public static void addPet(ArrayList<Pets> pets, Scanner sc, Counter count) {
        System.out.println("Кого вы хотите завести?");
        System.out.println("1. Котенок");
        System.out.println("2. Щенок");
        System.out.println("3. Хомяк");
        int petCase = getNum(sc);
        // int petId = pets.size() + 1;
        System.out.println("Введите имя нового питомца : ");
        sc.nextLine();
        String newName = sc.nextLine();
        
        if (petCase == 1) {
            Cats newPet = new Cats(count.getCount(), newName);
            pets.add(newPet);
        } else if (petCase == 2) {
            Dogs newPet = new Dogs(count.getCount(), newName);
            pets.add(newPet);
            Counter.add();
        } else if (petCase == 3) {
            Hamsters newPet = new Hamsters(count.getCount(), newName);
            pets.add(newPet);
        } else {
            System.out.println("Неправильный выбор!");
        }

    }

    public static void training(ArrayList<Pets> pets, Scanner sc){
        int petIdCase = sc.nextInt();
        System.out.println("Введите комаду, которой хотите обучить : ");
        sc.nextLine();
        String newCommand = sc.nextLine();
        pets.get(petIdCase - 1).setCommand(newCommand);
        System.out.println("Питомец обучен.");
        System.out.println(pets.get(petIdCase - 1).toString());
    }

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        ArrayList<Pets> pets = new ArrayList<>();
        Counter count = new Counter();
        Pets.dfaultPet(pets, count);
        Scanner scanner = new Scanner(System.in, "Cp866");

        while (true) {
            System.out.println(" =========== Меню ===========");
            System.out.println("1. Вывод списка животных.");
            System.out.println("2. Завести нового питомца.");
            System.out.println("3. Научить питомца новой команде.");
            System.out.println("4. Выход.");

            int menuCase = getNum(scanner);
            if (menuCase == 1) {
                for (int i = 0; i < pets.size(); i++) {
                    System.out.println(pets.get(i).toString());
                }
            } else if (menuCase == 2) {
                addPet(pets, scanner, count);
                System.out.println("Новый питомец : ");
                System.out.println(pets.get(pets.size()-1).toString());
            } else if (menuCase == 3) {
                System.out.println("Выбрать питомца для дрессировки(необходимо ввести ID) : ");
                for (int i = 0; i < pets.size(); i++) {
                    System.out.println(pets.get(i).toString());
                }
                training(pets, scanner);
            } else if (menuCase == 4) {
                scanner.close();
                try (count) {
                    count.close();
                } catch (Exception e) {
                    System.out.println("Счетчик не закрылся.");
                }
                
                break;

            } else
                System.out.println("Неправильный выбор!");
        }
    }

}
