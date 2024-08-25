public class IntemBibliografico {
    private String codigo;
    private String titulo;
    private int anoPublicacao;

    public IntemBibliografico(String codigo, String titulo, int anoPublic) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;

    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public boolean validarCampos(){
        return codigo != null && titulo != null && anoPublicacao > 0;
    }

}

