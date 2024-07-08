package final_keyword;

public class University {
    //এখানে ২টি class use করা হয়েছে, main class থেকে এই class-কে call করা হয়েছে।।

    String name = "Jamia al-safa";
    int fee = 4000;

    void display() {
        System.out.println("Institute Name : " + name);
        System.out.println("Admission fee  : " + fee + " Taka");
    }

    /*
    Using "final" keyword will restrict the user.// final keyword দ্বারা user-কে restrict করা হয়।।
    "final" keyword এর ব্যবহার :
        (final variable, final method, final class)-এর ক্ষেত্রে "final" keyword ব্যবহার কলা হয়।।
    
     */
}
