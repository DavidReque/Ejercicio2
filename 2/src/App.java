public class App {
    public static void main(String[] args) throws Exception {

        var estacion = "VERANO";

        switch (estacion) {
            case "VERANO":
                System.out.println("Es VERANO");
                break;
            case "INVIERNO":
                System.out.println("Es INVIERNO");
                break;
            case "PRIMAVERA":
                System.out.println("Es PRIMAVERA");
                break;
            case "OTOÑO":
                System.out.println("Es OTOÑO");
                break;
            default:
                System.out.println("OTRA");
        }

/*FOR
        for ( int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }*/

 /*DO*/
        /*int numeroWhile = 3;
        do {
            System.out.println(numeroWhile);
            numeroWhile--;
        } while (numeroWhile > 3);*/

/*WHILE */
        /* int numeroWhile = 3;
       while (numeroWhile > 0) {
        System.out.println(numeroWhile);
        numeroWhile--;
      }*/

/*Condicionales */
        /*int numeroIf = 0;
        if ( numeroIf > 0 ) {
            System.out.println("Es positivo");
        }
        else {
            System.out.println("Es negativo");
        }*/

    }
}
