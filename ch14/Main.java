package gr.aueb.cf.ch14;

import gr.aueb.cf.ch14.services.CodingFactorySingleton;
import gr.aueb.cf.ch14.services.HelloUtil;

import static gr.aueb.cf.ch14.services.HelloUtil.sayHello;

public class Main {

    public static void main(String[] args) {
    Teacher teacher1 = new Teacher(1, "John", "Stam");
    Teacher teacher2 = new Teacher(2, "J", "S");
    Teacher teacher3 = new Teacher(3, "C", "S");

    HelloUtil.sayHello();

    CodingFactorySingleton cf1 = CodingFactorySingleton.getInstance();
    CodingFactorySingleton cf2 = CodingFactorySingleton.getInstance();

    System.out.println(cf1);
    System.out.println(cf2);


    }//end main


}
