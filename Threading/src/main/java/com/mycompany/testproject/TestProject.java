package com.mycompany.testproject;

public class TestProject {
    public static void main(String[] args) {
        System.out.println("Start");
        TestProject t = new TestProject();
        t.assign();
        t.print();
        Init init = new Init();
        init.setStatic();
        init.print();
    }

    void assign() {
        Test test = new Test();
        test.name = "test";
        Test.s = "static";
        System.out.println(test.hashCode());
    }

    void print() {
        Test test = new Test();
        System.out.println(test.name);
        System.out.println(Test.s);
        System.out.println(test.hashCode());
    }

}

class Init {
    void setStatic() {
        Test.s = "static updated";
    }

    void print() {
        System.out.println(Test.s);
    }
}