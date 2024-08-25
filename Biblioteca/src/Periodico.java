public class Periodico {
    private String periodicidade;
    private int volume;

    public Periodico(String periodicidade, int volume, String codigo, String titulo, int anoPublicacao) {
        super(codigo, titulo, anoPublicacao);
        this.periodicidade = periodicidade;
        this.volume = volume;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }
    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String validacao() {
        return super.validacao() && !periodicidade.isEmpty() && volume > 0;
    }
}
