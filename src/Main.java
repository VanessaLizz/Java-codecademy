public class Main {

    public static void main(String[] args) {
        System.out.println("Let's play hide and seek.");
        System.out.print("Three...");
        System.out.print("Two...");
        System.out.println("One...");
        System.out.println("Ready or not, here I come!");
        System.out.print("I found you!!");

        // barras duplas são usadas para comentários simples em uma única linha

        /* barra simples com asterisco no início e no fim
        são usadas em comentários que
        utilizam várias linhas em sua escrita
         */

        /**
         * o comentário em java doc é utilizado em casos especiais quando há necessidade de explicar o código
         * @param args serve para explicar o parametro
         */
        System.out.println("Java is a class-based language");
        System.out.println("Java classes have a 'main' method");
        System.out.println("Java statements end with a semicolon");
        System.out.println("My first Java program from scratch in english");

        //abaixo temos a criação de uma ávore de natal

        System.out.println("I going to plant a Christmas tree!!!");

        String[] tree = {
                "     *     ",
                "    ***    ",
                "   *****   ",
                "  *******  ",
                " ********* ",
                "     *   ",
                "     *   "
        };
        for (String line : tree) {
            System.out.println(line);
        }
        String name = "James Gosling";
        int yearCreated = 1995;
        System.out.println(name);
        System.out.println(yearCreated);

        int numComments = 4;
        System.out.println(numComments);
        
        //outros tipos de variáveis
        double androidShare = 81.7;
        System.out.println(androidShare);

        boolean intsCanHoldDecimals = false;
        System.out.println(intsCanHoldDecimals);

        char expectedGrade = 'A';
        System.out.println(expectedGrade);

        String openingLyrics = "Yesterday, all my troubles seemed so far away";
        System.out.println(openingLyrics);

    //nomeação de variáveis
        String Name = "Samira";
        String blah = "Smith";
        String com = "samira@google.com";
        int salaryexpectation = 100000;
        int year_of_birth = 1955;

        System.out.println("The program runs!");

        /*String name = "Vanessa";
        int age = 29;
        double desiredSalary = 30000.00;
        char gender = 'f';
        boolean lookingForJob = true;

         */

        MadLibs book = new MadLibs();
        MadLibs book2 = new MadLibs();

        book.name1 = "Jose";
        book.name2 = "Maria";
        book.adjective1 = "a";
        book.adjective2 = "b";
        book.adjective3 = "c";
        book.noun1 = "d";
        book.noun2 = "e";
        book.noun3 = "f";
        book.noun4 = "g";
        book.noun5 = "h";
        book.noun6 = "i";
        book.number = 6;
        book.verb1 = "j";
        book.place1 = "l";

        book2.name1 = "Josfbsdbe";
        book2.name2 = "Mabsngfria";
        book2.adjective1 = "aegbh";
        book2.adjective2 = "rgqergb";
        book2.adjective3 = "c";
        book2.noun1 = "d";
        book2.noun2 = "e";
        book2.noun3 = "f";
        book2.noun4 = "gfergh";
        book2.noun5 = "h";
        book2.noun6 = "i";
        book2.number = 6;
        book2.verb1 = "j";
        book2.place1 = "l";

        System.out.println(book.story());
        System.out.println(book2.story());
        
        //manipulando variaveis

        int mystery1 = 8 + 6;
        int mystery2 = 8 - 6;
        System.out.println(mystery2);
        
        //adição e subtração

        int zebrasInZoo = 8;
        int giraffesInZoo = 4;
        int animalsInZoo = zebrasInZoo + giraffesInZoo;
        System.out.println(animalsInZoo);

        int numZebrasAfterTrade = zebrasInZoo - 2;
        System.out.println(numZebrasAfterTrade);

        //multiplicação e divisão

        double subtotal = 30;
        double tax = 0.0875;
        double total = (subtotal * tax) + subtotal;
        System.out.println(total);
        double perPerson = total / 4;
        System.out.println(perPerson);

        //modulo

        int students = 26;
        int leftOut = students%3;
        System.out.println(leftOut);

        int numCookies = 17;
        numCookies -=3;
        numCookies /=2;
        // Add your code above
        System.out.println(numCookies);

        int expression1 = 5 % 2 - (4 * 2 - 1);
        System.out.println(expression1);

        int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
        System.out.println(expression2);

        int expression3 = 5 * 4 % 3 - 2 + 1;
        System.out.println(expression3);

        double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;
        System.out.println(creditsEarned > creditsToGraduate);
        double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
        System.out.println(creditsToGraduate < creditsAfterSeminar);

        int songsA = 9;
        int songsB = 9;
        int albumLengthA = 41;
        int albumLengthB = 53;
        boolean sameNumberOfSongs = songsA == songsB;
        boolean differentLength = albumLengthA != albumLengthB;
        System.out.println(sameNumberOfSongs);
        System.out.println(differentLength);

        double recommendedWaterIntake = 8;
        double daysInChallenge = 30;
        double yourWaterIntake = 235.5;
        double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
        boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
        System.out.println(isChallengeComplete);

        String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
        String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        System.out.println(line1.equals(line2));
        System.out.println(line2.equals(line3));

        int animals = 12;
        String species = "zebra";
        String zooDescription = "Our zoo has " + animals + " " + species + "s!";
        System.out.println(zooDescription);

        final double pi = 3.14;
        System.out.println(pi);
        double pi = 5;
        System.out.println(pi); // ao usar final em uma variação, ela não poderá ser alterada e qualquer tentativa ocasionar em uma mensagem de erro.

        //revisão e aplicações de variáveis

        double balance = 1000.75;
        double amountToWithdraw = 250;
        double updatedBalance = balance - amountToWithdraw;
        double amountForEachFriend = updatedBalance / 3;
        boolean canPurchaseTicket = amountForEachFriend >= 250;
        System.out.println(canPurchaseTicket);
        System.out.println("I gave each friend " + amountForEachFriend);

        //número mágico

        int myNumber = 15; //numero original
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println(stepSix); //qualquer valor de variável colocada em my number gerará o mesmo resultado em stepSix

        //classes em Java

        Store newStore = new Store();

        Dog newDog = new Dog();

        Store lemonadeStand = new Store("coffee");
        System.out.println(lemonadeStand.productType);
        lemonadeStand.increasePrice(1.5);
        System.out.println(lemonadeStand.price);

        Store cookieShop = new Store("cookies", 12, 3.75);
        lemonadeStand.advertise();
        lemonadeStand.greetCustomer("Codey");

        double lemonadePrice = lemonadeStand.getPriceWithTax();
        System.out.println(lemonadePrice);
        System.out.println(cookieShop);
    }
}