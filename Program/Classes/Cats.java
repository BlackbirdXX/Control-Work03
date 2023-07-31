package Program.Classes;

import java.time.LocalDate;


public class Cats extends Pets{
    public Cats(int count, String name){
        this.Id = count;
        this.name = name;
        this.command = "Пока ничего не умеет";
        this.birthday = LocalDate.now();
    }
    
}
