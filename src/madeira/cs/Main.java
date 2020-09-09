package madeira.cs;

public class Main {

    public static void main(String[] args) {
	// write your code here
                /*
            Exercise 1
           ------------
           Write a program that prints a receipt.
           The receipt should have a border, date, items purchased & name of the store
           ** Hint: The 'pipe' character (shift + forward-slash) is useful for the side border **
         */
        // Exercise 1 code below

String Date;
Date = "|7/2/2019                     |";
String SalesAssociate;
SalesAssociate = "|Sales associate: Eliza       |";

String Item1;
Item1 = "|1 CHEESEBURGER...........5.99|";
String Specifications11;
Specifications11 = "|    NO CHEESE                |";

String Item2;
Item2 = "|1 HAMBURGER..............4.99|";
String Specifications21;
Specifications21 = "|    NO ONION                 |";
String Specifications22;
Specifications22 = "|    NO KETCHUP               |";
String Specifications23;
Specifications23 = "|    NO MUSTARD               |";
String Specifications24;
Specifications24 = "|    NO PICKLES               |";
String Specifications25;
Specifications25 = "|    NO BUN                   |";
String Specifications26;
Specifications26 = "|    NO MEAT PATTY            |";

String Item3;
Item3 = "|2 FOUNTAIN DRINKS........4.00|";
String Specifications31;
Specifications31 = "|    NO CUPS                  |";

String Subtotal;
Subtotal = "|              Subtotal: 14.98|";
String Tax;
Tax = "|                    Tax: 1.20|";
String Total;
Total = "|                 Total: 16.18|";





System.out.println (" _____________________________");
System.out.println ("|                             |");
System.out.println ("|           RECEIPT           |");
System.out.println ("|                             |");
System.out.println ("|*****************************|");
System.out.println ("|       BOB'S BURGERS         |");
System.out.println ("|        835 9th Ave.         |");
System.out.println ("|     New York, NY 10019      |");
System.out.println ("|*****************************|");
System.out.println ("|                             |");
System.out.println (Date);
System.out.println (SalesAssociate);
System.out.println ("|                             |");
System.out.println (Item1);
System.out.println (Specifications11);
System.out.println (Item2);
System.out.println (Specifications21);
System.out.println (Specifications22);
System.out.println (Specifications23);
System.out.println (Specifications24);
System.out.println (Specifications25);
System.out.println (Specifications26);
System.out.println (Item3);
System.out.println (Specifications31);
System.out.println ("|                             |");
System.out.println ("|                             |");
System.out.println (Subtotal);
System.out.println (Tax);
System.out.println (Total);
System.out.println ("|                             |");
System.out.println ("|-----------------------------|");
System.out.println ("|                             |");
System.out.println ("|     **Customer's copy**     |");
System.out.println ("|                             |");
System.out.println ("|_____________________________|");


        /*
            Exercise 2
            ----------
            Write a program that prints your name, and the position of the vowels in your name
            ** Hint: https://docs.oracle.com is your friend **
         */
String MyName;
MyName = "Eliza Mallory Reed";

MyName.indexOf ('a');
System.out.println ("String MyName contains a at index " +MyName.indexOf ('a'));
MyName.lastIndexOf ('a');
System.out.println ("and at index " +MyName.lastIndexOf ('a'));

MyName.indexOf ('E');
System.out.println ("String MyName contains E at index " +MyName.indexOf ('E'));

MyName.indexOf ('e');
System.out.println ("String MyName contains e at index " +MyName.indexOf ('e'));
MyName.lastIndexOf ('e');
System.out.println ("and at index " +MyName.lastIndexOf ('e'));

MyName.indexOf ('i');
System.out.println ("String MyName contains i at index " +MyName.indexOf ("i"));

MyName.indexOf ("o");
System.out.println ("String MyName contains o at index " +MyName.indexOf ('o'));

    }
}
