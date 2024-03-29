package Entities;

import java.util.ArrayList;

public class Company {
    static ArrayList<Company> List = new ArrayList<>();
    private String Name;
    private float initialCapital;
    private float netWorth;
    private float CONFIDENCE;

    public Company(String Name, float initialCapital, float netWorth, float CONFIDENCE){
        this.Name = Name;
        this.initialCapital = initialCapital;
        this.netWorth = netWorth;
        this.CONFIDENCE = CONFIDENCE;
        List.add(this);
    }

    public String getName() {
        return Name;
    }

    public float getCONFIDENCE() {
        return CONFIDENCE;
    }

    public static Company getCompany(int index){
        return List.get(index);
    }

    public static void retrieveList(){
        List.forEach(n -> System.out.println(n.getName()));
    }

    public static void generateEntities(){
        //Hard-coded entities
        Company AMD = new Company("AMD", 200000, 200000, .10f);
        Company Intel = new Company("Intel", 300000, 300000, .20f);
        retrieveList();
    }
}
