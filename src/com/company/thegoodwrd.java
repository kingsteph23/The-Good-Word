
package com.company;// allows display of time,date, and timezone
import java.time.format.DateTimeFormatter;
// Allows functioning of array list
import  java.util.ArrayList;
// allows display of time,date, and timezone(all modules to be exact)
import java.time.*;
//  Allows users to input expressions
import  java.util.Scanner;
import java.util.Arrays;
import  java.util.Random;
public class thegoodwrd {

    public static void main(String[] args) {

        //Title
        System.out.println("---------------------------");
        System.out.println("    The Good Word          ");
        System.out.println("    Holy Quotes of the day ");
        System.out.println("---------------------------");
        // allows input from user
        String currentime;
        String nom;

Scanner scan =  new Scanner(System.in);

            System.out.println("Curious, what is the current time of day at your location?\n" +
                               "Morning\n" +
                               "Afternoon\n" +
                               "Evening\n" +
                               ":");
            currentime = scan.nextLine();

            System.out.println("And......Whats ya name:");

            nom = scan.nextLine();


        System.out.println("Good," + currentime+ "," +nom+"!");
// Displays current time/date based on system preferences
        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MM/dd/uuuu");
        System.out.println(ZoneOffset.systemDefault());
        System.out.println(OffsetDateTime.now().getOffset());
// Displays timezone based on system preferences
        System.out.println();
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(DTF.format(now));
        System.out.println(now.getOffset());

        System.out.println();

            ArrayList<String>thegoodwords = new ArrayList<>();

//holy quotes
            thegoodwords.add("\"Thou shouldn't Overthink. " +
                             "\nYou’ll Create A Problem That Wasn't’ Even There In The First Place.\"");
            thegoodwords.add("\"He who conducts thy aux cord must haveith flames on thy playlist.\"");
            thegoodwords.add("\"When thy come from the bottom , your work ethic & talent will speak volume\"");

            thegoodwords.add("\"thou shalt not throw shade if thou cannot throw hands.\"");
            thegoodwords.add("\"if thy queen is asleep, the PS4 shall beep\"");
            thegoodwords.add("\"Getting friendzoned by a hoe is liked getting denied by a community college\"");

            thegoodwords.add("\"a new life starts when you stop overthinking\"");
            thegoodwords.add("\"for the negativity that lurks about, only a fool shall fool it\"");
            thegoodwords.add("\"for i'd rather die in my sleep, than live my life as a sheep\"");

            thegoodwords.add("\"Don’t let having a fu***d up past stop you from becoming a better person . " +
                            "\nGrind pass those mistakes change actually mean WTF you gone do.\"\n");
// latest quotes(8/11/21)
        thegoodwords.add("\"A simp chases a female to be put on a collar," +
                         "\na man chases the bag to snag another dollar.\"-The Good Word 21:15");

        thegoodwords.add("\"Always remember a fool is  for only a fool speaks on something he ain't know \"-The Good Word 21:12");
        thegoodwords.add("\"For a dream is called a dream because it isn't reality," +
                "\nbut the only person who can see them is thou self, they dream must be worked into existence \"-The Good Word 20:4");
        thegoodwords.add("\"For thou art a King, keepeth thou head up and search for thots no longer\"-The Good Word 19:8");

// Allows randomization of the holy quotes
            int thebookofghetto = (int)(Math.random() * thegoodwords.size());

            System.out.println("Holy quote of the day:\n" +
                    thegoodwords.get(thebookofghetto));
    }
}
