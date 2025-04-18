class Laptop {
    public void code(){
        System.out.println("Code, run, debug....");
    }
}

class Desktop {
    public void code() {
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
        Laptop lap = new Laptop();
        Desktop des = new Desktop();
        dev.code(des);
    }
}
