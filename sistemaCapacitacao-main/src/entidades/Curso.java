package entidades;

public class Curso {
     private int idCurso;
     private String nome;
     private String formaDeRealizacao;
     private String ofertante;
     private int vagas;
     private  double valor;
     private String site;
     private String situacao;

     public Curso(){};

    public Curso(int idCurso, String nome, String formaDeRealizacao, String ofertante, int vagas, double valor, String site, String situacao) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.formaDeRealizacao = formaDeRealizacao;
        this.ofertante = ofertante;
        this.vagas = vagas;
        this.valor = valor;
        this.site = site;
        this.situacao = situacao;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormaDeRealizacao() {
        return formaDeRealizacao;
    }

    public void setFormaDeRealizacao(String formaDeRealizacao) {
        this.formaDeRealizacao = formaDeRealizacao;
    }

    public String getOfertante() {
        return ofertante;
    }

    public void setOfertante(String ofertante) {
        this.ofertante = ofertante;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    @Override
    public String toString() {
        return "Curso{" +
                "idCurso=" + idCurso +
                ", nome='" + nome + '\'' +
                ", formaDeRealizacao='" + formaDeRealizacao + '\'' +
                ", ofertante='" + ofertante + '\'' +
                ", vagas=" + vagas +
                ", valor=" + valor +
                ", site='" + site + '\'' +
                ", situacao='" + situacao + '\'' +
                '}';
    }
}
