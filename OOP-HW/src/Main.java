public class Main {
    public static void main(String[] args) {

//        for Country class
        Country Ali = new Country("KSA", "Arabic", 2100000, "Riyadh", "Jeddah");
        Country Manal = new Country("USA", "English", 230000, "Washington", "New York");
        Country Ahmed = new Country("UAE", "Arabic", 200000, "Abu Dhabi", "Dubai");

        System.out.println("Country Class Results: ");
        System.out.println(Ali.toString() + "\n");
        System.out.println(Manal.toString() + "\n");
        System.out.println(Ahmed.toString() + "\n");

//       for Vowels
        String value = "Manal";
        System.out.print("Vowels Function Result: ");
        System.out.println(Vowels(value));

//        for max
        System.out.print("Max Function Result: ");
        System.out.println(Max(2,3));

//        for swap
        System.out.println("swap Fnction Result: ");
        swap("Tuwaiq" , "1000");

    }

//    Vowels in the word
    public static int Vowels(String value){
        int count = 0;
        for (int i = 0 ; i < value.length(); i++){
            char ch = value.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
                count ++;
            }
        }
        return count;
    }
//    Max
    public static int Max(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else if(num2 > num1){
            return num2;
        }else{
            return 0;
        }
    }
//    swap void method
    public static void swap(String str1, String str2){
        System.out.println("1: " + str1 + ", 2: " + str2);
        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("1: " + str1 + ", 2: " + str2);
    }



}
