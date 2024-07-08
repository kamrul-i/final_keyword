package final_keyword;

public class University {
    //এখানে ২টি class use করা হয়েছে, main class থেকে এই class-কে call করা হয়েছে।।

    final String name = "Jamia al-safa";  //final variable
    int fee = 4000;

    void display() {
        System.out.println("Institute Name : " + name);
        System.out.println("Admission fee  : " + fee + " Taka");
    }

    /*
    Using "final" keyword will restrict the user.// final keyword দ্বারা user-কে restrict করা হয়।।
    "final" keyword এর ব্যবহার :
        (final variable, final method, final class)-এর ক্ষেত্রে "final" keyword ব্যবহার করা হয়।।
        (variable, method, class) যাই হোক- 
        তার আগে "final" keyword বসিয়ে দিলে সেটা final হিসেবে চিহ্নিত হয়ে যায়, এবং সেটাকে আর Edit করতে পারবেন না।।
    
    
    ### variable -> 1. final variable
                    2. blank final variable
                    3. static blank final variable
    
        1. final variable :
            যে variable এর আগে "final" keyword থাকবে, তাকে final variable বলে।।
            final variable-এর মান change করা যায় না,
            same নামে আরেকটি variable create করা যায় না,
            final variable-কে capital letter দ্বারা create করা recommanded.
        2. blank final variable:
            যে variable-কে final হিসেবে declare করেও (final variable-এর মতো) তার মধ্যে কোন মান দেওয়া হয় নাই, তাকে blank final variable বলে।।
            এই রকম variable এর মান constructor এর মাধ্যমে declare করতে হয়।।
        3. static blank final variable:
            যে variable-কে final হিসেবে declare করেও (final variable-এর মতো) তার মধ্যে কোন মান দেওয়া হয় নাই তাকে static blank final variable বলে।।
            এই রকম variable-এর মান "static" block এর মাধ্যমে declare করতে হয়।।
    
    ### final method-এর আলোচনা: 
        final method-কে extends করা যায়,তবে final method-কে override করা যায় না।। 
 
    ### final class-এর আলোচনা: 
    final class-কে extends করা যায় না।।
     */
}
