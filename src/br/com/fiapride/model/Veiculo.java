package br.com.fiapride.model;

public class Veiculo {
    private String individuo;
    private String pl;
    private int gas;

    public void adicionar(int v) {
        if (v > 0) {
            gas = gas + v;
        }
    }

    public void gasta(int v) {
        if (v > 0 && v <= gas) {
            gas = gas - v;
        }
    }

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public int getGas() {
        return gas;
    }
    
    public void setGas(int gas) {
        if (gas >= 0) {
            this.gas = gas;
        }
    }
}