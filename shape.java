package OOPS.Inheritance.useofsuperkey;

public class shape {
    int length;
    int breadth;
    int height;

    shape(){
        this.length=-1;
        this.breadth=-1;
        this.height=-1;
    }
    shape(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    shape(int side){
        this.length=side;
        this.breadth=side;
        this.height=side;
    }
    shape(shape old){
        this.length= old.length;
        this.breadth= old.breadth;
        this.height= old.height;
    }

}
