// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Counter {
    int number=11;
    void increament(){
    number=number+1;
    }
    public static void main(String[] args) {
        Counter obj1=new Counter();
        Counter obj2=new Counter();
        Counter obj3=new Counter();
        
        obj1.increament();
        obj2.increament();
        obj3.increament();
        
        System.out.println(obj1.number);
        System.out.println(obj2.number);
        System.out.println(obj3.number);
        
    }
}
