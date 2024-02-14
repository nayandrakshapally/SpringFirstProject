package org.example;

public class Alien {

    private int age;
    private Computer comp;
//    private Laptop laptop;
    public void execute(){
        System.out.println("coding");
        comp.compile();
    }
//
//    public int getAge() {
//        return age;

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
//    }
//
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}
