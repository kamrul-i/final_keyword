package final_keyword;

public class University {
    //এখানে ২টি class use করা হয়েছে, main class থেকে এই class-কে call করা হয়েছে।।

    final String INSTITUTE_NAME = "Jamia al-safa";  //final variable
    int fee = 4000;

    void display() {
        System.out.println("Institute Name : " + INSTITUTE_NAME);
        System.out.println("Admission fee  : " + fee + " Taka");
    }

    /*
    ### variable -> 1. final variable
                    2. blank final variable
                    3. static blank final variable
    
        1. final variable :
            যে variable এর আগে "final" keyword থাকবে, তাকে final variable বলে।।
            final variable-এর মান change করা যায় না,
            same নামে আরেকটি variable create করা যায় না,
            final variable-কে capital letter দ্বারা create করা recommanded.

     */
}
