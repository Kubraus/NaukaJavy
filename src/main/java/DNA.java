package main.java;
//The genome of an organism stores all the genetic information necessary to build and maintain that organism.
// It is an organism’s complete set of DNA.

public class DNA {


    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna3;

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);

        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop);

        if (start != -1 &&
                stop != -1 &&
                (stop - start) % 3 == 0) {

            String protein = dna.substring(start, stop + 3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No protein");
        }


        int length = dna.length();
        System.out.println("Length: " + length);
    }
}
