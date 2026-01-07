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
    }
}