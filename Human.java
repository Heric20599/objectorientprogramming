package OOPS.Staticex;

public class Human {
    int age;
    String name;
    String area;
    boolean marriage;
     //long population;
     static long population;// static class field
    Human(int age, String name,String area,boolean marriage){
        this.age=age;
        this.area=area;
        this.name=name;
        this.marriage=marriage;
        Human.population+=1;// because this is related to class
       // this.population+=1;
    }

}
