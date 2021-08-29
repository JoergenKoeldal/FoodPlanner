import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AutoPlan {

    ArrayList<Recepie> nemRecipe = new ArrayList<>();
    Recepie recepie;


    public ArrayList<Recepie> nemRecipe() {


        nemRecipe.add(new Recepie("KnorrRet", 1));
        nemRecipe.add(new Recepie("Bøffer", 1));
        nemRecipe.add(new Recepie("KyllingeBryst", 1));
        nemRecipe.add(new Recepie("wraps", 1));
        nemRecipe.add(new Recepie("Pita Brød", 1));
        nemRecipe.add(new Recepie("BudhaBowl", 1));
        nemRecipe.add(new Recepie("Rugbrød", 1));
        nemRecipe.add(new Recepie("Saml selv pizza", 1));
        nemRecipe.add(new Recepie("Burger", 1));
        nemRecipe.add(new Recepie("KyllingeBurger", 1));
        nemRecipe.add(new Recepie("FiskeBurger", 1));
        nemRecipe.add(new Recepie("Frisk fisk", 1));
        nemRecipe.add(new Recepie("PastaSalat", 1));
        nemRecipe.add(new Recepie("Hotdogs", 1));
        nemRecipe.add(new Recepie("Tunmouse", 1));
        nemRecipe.add(new Recepie("falafel", 1));
        nemRecipe.add(new Recepie("Rema Nuggets", 1));
        nemRecipe.add(new Recepie("HakkeBøffer", 1));

        nemRecipe.add(new Recepie("Lasagne", 2));
        nemRecipe.add(new Recepie("Roastbeef", 2));
        nemRecipe.add(new Recepie("Frikadeller", 2));
        nemRecipe.add(new Recepie("MillionBøf", 2));
        nemRecipe.add(new Recepie("Pastabolo", 2));
        nemRecipe.add(new Recepie("Kartoffelporre Suppe", 2));
        nemRecipe.add(new Recepie("Fiske frikadeller", 2));
        nemRecipe.add(new Recepie("Korteletter", 2));
        nemRecipe.add(new Recepie("kyllingelår", 2));
        nemRecipe.add(new Recepie("medister", 2));
        nemRecipe.add(new Recepie("Chili con carne", 2));
        nemRecipe.add(new Recepie("Boller i karry", 2));
        nemRecipe.add(new Recepie("Hokaido suppe", 2));
        nemRecipe.add(new Recepie("Kylling i kokosmælk", 2));
        nemRecipe.add(new Recepie("Mørbrad", 2));
        nemRecipe.add(new Recepie("Krebinetter", 2));
        nemRecipe.add(new Recepie("Skinke", 2));


        nemRecipe.add(new Recepie("SquashFrikadeller", 3));
        nemRecipe.add(new Recepie("Risengrød", 3));
        nemRecipe.add(new Recepie("Dahl", 3));
        nemRecipe.add(new Recepie("PastaAlfredo", 3));
        nemRecipe.add(new Recepie("Stegt flæsk", 3));
        nemRecipe.add(new Recepie("Mørbrad Gryde", 3));
        nemRecipe.add(new Recepie("Kinesisk Suppe", 3));
        nemRecipe.add(new Recepie("Bulgogi", 3));
        nemRecipe.add(new Recepie("Tarteletter", 3));
        nemRecipe.add(new Recepie("Hjemmelavet Pizza", 3));
        nemRecipe.add(new Recepie("Ovn Steg", 3));
        nemRecipe.add(new Recepie("Flæskesteg", 3));
        nemRecipe.add(new Recepie("Flæskestegsburger", 3));

        return nemRecipe;
    }

    public void autoPlanner() {

        Random random = new Random();
        nemRecipe();
        int weekDays = 8;
        int bound = 18;
        for (int j = 1; j <= 4; j++) {

            System.out.println();
            System.out.println("Uge: " + j);
            System.out.println();

            for (int i = 1; i < weekDays; i++) {

                //Find mængden af objecter der har prob. diff 1 - på dem i et array og sæt max bound til det array.

                if (i == 1) {
                    Recepie mandag = nemRecipe.get(random.nextInt(bound));
                    System.out.println("Mandag: " + mandag.getName());
                    nemRecipe.remove(mandag);
                    bound = bound -1;
                } else {
                    Recepie deAndreDage = nemRecipe.get(random.nextInt(nemRecipe.size()));
                    String[] dage = {"Tirsdag: ", "Onsdag: ", "Torsdag: ", "Fredag: ", "Lørdag: ", "Søndag: "};

                    System.out.println(dage[i - 2] + deAndreDage.getName());
                    if (deAndreDage.getDifficulty() == 1) {
                        bound = bound -1;
                    }
                    nemRecipe.remove(deAndreDage);

                }
            }

        }
    }


}

















