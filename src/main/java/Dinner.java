package main.java;

class Dinner {

    private void makeNoodles(Noodle noodle, String sauce) {

        noodle.cook();

        System.out.println("Mixing " + noodle.texture + " noodles made from " + noodle.ingredients + " with " + sauce + ".");
        System.out.println("Dinner is served!");

    }

    public static void main(String[] args) {

        Noodle biangBiang = new BiangBiang();

        Dinner noodlesDinner = new Dinner();
        noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");
        // Add your code here:





    }

}