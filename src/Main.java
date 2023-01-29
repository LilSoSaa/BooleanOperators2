public class Main {
    public static void main(String[] args) {


        System.out.println((55 != 55) && (false ^ true));
        //55 non è uguale a 55= Falso  false^true=Falso    (falso && falso)= Falso



         boolean a=true;
         boolean b=false;
         int c=2;
         char d='2';
        System.out.println((!a || !b) || c == d);
        //considering that a=true, b=false, int c=2 and char d='2': (!a || !b) || c == d
        //!a Falso|| !b Vero || int diverso da char quindi Falso
        //        Vero       ||        Falso
        // soluzione: Vero


        System.out.println(false && true || false && !false);
        // falso && vero= Falso || falso && vero= falso
        //     Falso||Falso   ::nessun valore Vero
        //soluzione: Falso


        System.out.println((false && true) || (false || true));
        //falso && vero= Falso || falso||true=Vero
        //  falso    ||     vero
        // soluzone: Vero





    }
}