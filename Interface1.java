abstract class Computer {
    public  abstract void  code();
}

class Laptop extends Computer {
    public void code(){
        System.out.println("Code with Laptop....");
    }
}

class Desktop extends Computer {
    public void code(){
        System.out.println("Code with Desktop....");
    }
}



class Developer {
    public void code(Computer comp){
        comp.code();
    }
}


public class Interface1 {
    public static void main(String[] args){
        Developer dev = new Developer();
        // Computer lap = new Laptop();
        Computer des = new Desktop();
        dev.code(des);
    }
}
