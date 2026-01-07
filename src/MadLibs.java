public class MadLibs {
    /*
 This program generates a mad libbed story.
 Author: Vanessa Liz
 Date: 06/01/2026
 */
    String name1;
    String name2;
    String adjective1;
    String adjective2;
    String adjective3;
    String verb1;
    String noun1;
    String noun2;
    String noun3;
    String noun4;
    String noun5;
    String noun6;
    int number;
    String place1;

    String senha;

    //The template for the story
    public String story() {
        return "This morning " + this.name1 + " woke up feeling " + this.adjective1 + ". 'It is going to be a " + this.adjective2 + " day!' Outside, a bunch of " + this.noun1 + "s were protesting to keep " + this.noun2 + " in stores. They began to " + this.verb1 + " to the rhythm of the " + this.noun3 + ", which made all the " + this.noun4 + "s very " + this.adjective3 + ". Concerned, " + this.name1 + " texted " + this.name2 + ", who flew " + this.name1 + " to " + this.place1 + " and dropped " + this.name1 + " in a puddle of frozen " + this.noun5 + ". " + this.name1 + " woke up in the year " + this.number + ", in a world where " + this.noun6 + "s ruled the world.";
    }
}

