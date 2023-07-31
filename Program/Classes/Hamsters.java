package Program.Classes;

import java.time.LocalDate;


public class Hamsters extends Pets {

    public Hamsters(int id, String name){
        this.Id = id;
        this.name = name;
        this.command = "Пока ничего не умеет";
        this.birthday = LocalDate.now();
    }
}
