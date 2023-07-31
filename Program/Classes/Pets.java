package Program.Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import Program.Counter;

public class Pets {
    int Id;
    String name;
    String command;
    LocalDate birthday;
    
    public void setID(int newId){
        this.Id = newId;
    }

    public int getPetId() {
        return Id;
    }

    public void setName(String newName){
        this.name = newName;
    }

     public String getName(){
        return name;
    }

    public void setCommand(String newCommand){
        this.command = newCommand;
    }

     public String getCommand(){
        return command;
    }

    public void setBirthday(LocalDate date) {
        this.birthday = date;
    }

    public String getBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(birthday);
    }

    @Override
    public String toString() {
        return String.format("%d. %s: имя: %s, дата рождения: %s, умеет : %s", getPetId(), getClass().getSimpleName(), name, getBirthday(),getCommand());
    }
    public static  void dfaultPet(ArrayList<Pets> pets, Counter count){
        Cats cat1 = new Cats(count.getCount(), "Барсик");
        pets.add(cat1);
        Counter.add();
    }
}
