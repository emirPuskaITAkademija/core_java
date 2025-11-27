package com.academy.eight.demo;

/**
 * Brojimo koliko se puta javlja slovo 'p' ili 'P' u rečenici.
 */
public class ContinueDemo {
    public static void main(String[] args) {
        String text = "Petar Pan je pojeo pet plavih šljiva";
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char slovoText = text.charAt(i);
            if (slovoText != 'p' && slovoText != 'P') {
                continue;
            }
            counter++;
        }
        String message = "Slovo 'p' ili 'P' se nalazi u datom tekstu '%s' puta".formatted(counter);
        System.out.println(message);
    }
}
