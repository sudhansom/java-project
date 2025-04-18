class Laptop {
    public void code(){
        System.out.println("Code, run, debug....");
    }
}


class Developer {
    public void code(Laptop lap){
        lap.code();
    }
}


public class Interface1 {
    public static void main(String[] args){
        Developer dev = new Developer();
        Laptop lap = new Laptop();
        dev.code(lap);
    }
}
