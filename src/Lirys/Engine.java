package Lirys;

import Entities.Company;

public class Engine {
    public static int numberOfTurns = 0;

    public void Run(){
        Company.generateEntities();
    }
}
