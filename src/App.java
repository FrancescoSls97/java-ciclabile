public class App {
    public static void main(String[] args) throws Exception {
        int[] numeri = { 27, 7, 11, 14, 56 };
        NumeriInteri arrayNum = new NumeriInteri(numeri);

        while (arrayNum.hasAncoraElementi()) {
            System.out.println(arrayNum.getElementoSuccessivo());
        }

    }

}
