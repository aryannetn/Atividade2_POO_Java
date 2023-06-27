package app;

class Barco extends Veiculo {
    private int numVelas;

    public Barco(String nome, int anoFabricacao, int capacidade, Fabricante fabricante, int numVelas) {
        super(nome, anoFabricacao, capacidade, fabricante);
        this.numVelas = numVelas;
    }

    public int getNumVelas() {
        return numVelas;
    }

    public void setNumVelas(int numVelas) {
        this.numVelas = numVelas;
    }

    public void icarVelas() {
        System.out.println("O barco está com as velas içadas.");
    }

    public void recolherVelas() {
        System.out.println("Velas recolhidas.");
    }

    @Override
    public void acelerar() {
        System.out.println("O barco está acelerando.");
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Número de velas: " + numVelas);
    }
}