package Program.Classes;

import java.time.LocalDate;


public class Dogs extends Pets {
    public Dogs(int id, String name){
        this.Id = id;
        this.name = name;
        this.command = "Пока ничего не умеет";
        this.birthday = LocalDate.now();
    
    }
    
}
