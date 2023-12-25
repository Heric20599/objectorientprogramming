package OOPS.wrapperclass;

public class wrapper {
    public static void main(String[] args) {
        int a=0;
        int c=9;
// Integer is final class in wrapper
        // that why we cant swap the value of a and c evan they are object
        Integer b=45;// this is the wrapper class object this is the object which have wrapper class and  their method
        b.byteValue();
        System.out.println(b);
        swap(a,c);// this is now swap bcz java is
        System.out.println(a+" "+c);
        // final cant be modified
        final int h=0;
      //  h=8;// final variable always initialize while declare it
        final a j=new a("rohan");// final the non primitive
        j.name="kl";
      //  j=new a("jksk");// when a non primitive is final you cant reinitialize it


        a obj;
        for (int i = 0; i <180000000 ; i++) {
            obj=new a("random name");
        }
    }
   static   class a{
        String name;
        a(String name){
            this.name=name;
        }
//        protected void finalize() throws Throwable{

           // System.out.println("object is deleted");;
      //  }
    }

    static void swap(int a, int c){
        int temp=a;
        a=c;
        c=temp;

    }
}
