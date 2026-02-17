package github.cr12dev.problem1;

/*  @title          BitsCounter
*   @description    Convertir de binario a decimal
*    */

public class BitsCounter {

        /*
        * This implementation is based on String. Transforming an integer into the binary
        * representation we can obtain an String and use it to counr the number of elements equals
        * to '1'
        * */
    public int countBitsToOneBasedOnString(int n) {
        int result = 0;
        String binaryNumber = Integer.toBinaryString(n);
        for (char c : binaryNumber.toCharArray()){
            result += c == '1' ? 1 : 0;
        }
        return result;
    }

    public int countBitsToOneBasedOnBinaryOperators(int n){
        int result = 0;
        while (n != 0) {
            result += (n & 1) == 1 ? 1 : 0;
            n = n >>> 1;
        }
        return result;
    }

    public static void main(String[] args){

        /*  Se crea el objeto   */
        BitsCounter counter = new BitsCounter();

        /*  Llamar a las funciones */
        int result1 = counter.countBitsToOneBasedOnString(100);
        int result2 = counter.countBitsToOneBasedOnBinaryOperators(10);

        /*  Mostrar el resultado */
        System.out.println("String method: " + result1);
        System.out.println("Binary method: " + result2);
    }

}
