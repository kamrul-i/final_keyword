package final_keyword;

public class Student extends University {
    //এখানে ৩টি class use করা হয়েছে, main class থেকে এই class-কে call করা হয়েছে।।


    void display2() {
        super.display1();  //final method extends done.
        System.out.println("Students info.");
    }
    //তবে ‍super class-এর method-কে override করতে পারবেন না।।

}
