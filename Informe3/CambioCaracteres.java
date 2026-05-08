public class CambioCaracteres {
    public static void main(String[] args) {

        String nombres[] = {
            "JUAN",
            "EVELIN",
            "ANA",
            "MARK",
            "DIEGO"
        };

        char caracteres[] = {
            'A','B','C','D','E','F','G','H','I','J',
            'K','L','M','N','Ñ','O','P','Q','R','S',
            'T','U','V','W','X','Y','Z'
        };

        int numeros[] = {
            1,2,3,4,5,6,7,8,9,10,
            11,12,13,14,15,16,17,18,19,20,
            21,22,23,24,25,26,27
        };

        int x = 0;
        String nombreAuxiliar = "";

        while (x < nombres.length) {

            for (int j = 0; j < nombres[x].length(); j++) {

                for (int k = 0; k < caracteres.length; k++) {

                    if (nombres[x].charAt(j) == caracteres[k]) {
                        nombreAuxiliar = nombreAuxiliar + numeros[k];
                    }
                }
            }

            nombres[x] = nombreAuxiliar;

            System.out.println(nombres[x]);

            nombreAuxiliar = "";
            x++;
        }
    }
}
