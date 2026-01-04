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
    }
}