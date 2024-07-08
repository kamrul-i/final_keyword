package final_keyword;

public class University {
    //এখানে ২টি class use করা হয়েছে, main class থেকে এই class-কে call করা হয়েছে।।

    final String INSTITUTE_NAME = "Jamia al-safa"; //final variable
    final int fee; //blank final variable

    University() {
        fee = 8000;
    }

    void display() {
        System.out.println("Institute Name : " + INSTITUTE_NAME);
        System.out.println("Admission fee  : " + fee + " Taka");
    }

    /*
    ### variable -> 1. final variable
                    2. blank final variable
                    3. static blank final variable
    
        2. blank final variable:
            যে variable-কে final হিসেবে declare করেও (final variable-এর মতো) তার মধ্যে কোন মান দেওয়া হয় নাই, তাকে blank final variable বলে।।
            এই রকম variable এর মান constructor এর মাধ্যমে declare করতে হয়।।

     */
}
