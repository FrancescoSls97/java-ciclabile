public class NumeriInteri {

    private int[] elenco;
    private int indice;

    // Costruttore
    public NumeriInteri(int[] elenco) {
        this.elenco = elenco;
        this.indice = 0;
    }

  // Restituisce il prossimo numero
    public int getElementoSuccessivo() {
        if (hasAncoraElementi()) {
            int prossimo = elenco[indice];
            indice++;
            return prossimo;
        } else {
            throw new IllegalStateException("Non ci sono altri numeri");
        }
    }



    // Verifica se ci sono ancora numeri
    public boolean hasAncoraElementi() {
        return indice < elenco.length;
    }

}
