package OOPS.Inheritance.useofsuperkey;

public class shapeandbox extends shape{
    int weight;
    shapeandbox(){
        this.weight=-1;
    }
    shapeandbox(int weight){  // this is  showing we want to add new functionality in the new class
        this.weight=weight;

    }
    shapeandbox(int length,int bredth,int height,int weight){
        super(length,bredth,height);// this is for used to call the contructor of parent class
        this.weight=weight;// this is
    }
}
