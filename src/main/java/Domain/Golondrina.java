package Domain;

public class Golondrina {
  private int energia;

  public Golondrina(int energiaInicial) {
    this.energia = energiaInicial;
  }

  public void volar() {
    this.energia = this.energia - 10;
  }

  public void comer(int alpiste) {
    this.energia = this.energia + 3 * alpiste;
  }

  public int getEnergia() {
    return energia;
  }
}
