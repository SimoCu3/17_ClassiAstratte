/*
Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano il metodo per il calcolo dell'area in maniera specifica.
*/

public class ClassiAstratte {
    public static void main(String[] args) {

    Forma rettangolo = new Rettangolo(5, 10);
    Forma triangolo = new Triangolo(5, 10);

    rettangolo.calcolaArea();
    triangolo.calcolaArea();

    }
}