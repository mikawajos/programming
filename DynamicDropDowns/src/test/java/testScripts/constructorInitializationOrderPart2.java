package testScripts;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public @Data
class constructorInitializationOrderPart2 {
    @Getter
    @Setter
    private static String firstName = "ME";
    @Getter
    @Setter
    private static String secondaryName = "NOT ACTUALLY";

    @Override
    public String toString() {
        return "constructorInitializationOrderPart2{}" + firstName + " " + secondaryName;
    }

    static {                //static--1
        add(2);
    }

    static void add(int num) {
        System.out.println(num + " ");
    }

    constructorInitializationOrderPart2(String name, String subname){
    this.firstName = name;
    this.secondaryName = subname;
        System.out.println("inside 2nd constructor");
    }
    constructorInitializationOrderPart2() {
        new constructorInitializationOrderPart2("marcin", "kozlow");
        System.out.println(firstName + " " + secondaryName);
        add(5);
    }

    static {
        add(4);
    }       //static--2

    {
        add(6);
    }

    static {
    }        //static--3co

    {
        add(8);
    }

    public static void main(String[] args) {
    }
}

//2 4 6 8 5
