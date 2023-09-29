
public class Imovel {
    public int codigo;
    public String tipo;
    public double tamanho;
    public double preco;

    public Imovel() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean oportunidade() {
        double valor = this.getPreco() / this.getTamanho();
        if (this.getTipo() == "AP") {
            return valor < 5000;
        }
        if (this.getTipo() == "CASA") {
            return valor < 4000;
        }
        return false;
    }
}