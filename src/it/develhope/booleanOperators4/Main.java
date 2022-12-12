package it.develhope.booleanOperators4;

public class Main {
    public static void main(String[] args) {

        boolean a = (3 / 3 + 2) >= 3 || !(3 + 3 - 3 / 1 == 3); //TRUE, il primo risultato, essendo 3>=3, sarà true,
        // mentre il secondo, !3==3, sarà false, quindi con l'operatore OR il risultato finale è true
        boolean b = (5 * 5 - 6 * 6 / 2 != 12) || !false && true; //TRUE il primo risultato sarà true, essendo 7!=12,
        // così come il secondo

        System.out.println(a);
        System.out.println(b);
    }
}
