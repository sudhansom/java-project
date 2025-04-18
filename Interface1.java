interface Laptop {
    void code();
}

interface Desktop {
    void code();
}

class Computer implements  Laptop, Desktop {
    public void code(){
        System.out.println("code, run, faster.....");
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
        Computer comp = new Computer();
        dev.code(comp);
    }
}
