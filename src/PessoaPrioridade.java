public class PessoaPrioridade implements Comparable<PessoaPrioridade> {
    private String nome;
    private boolean prioridade;

    public PessoaPrioridade(String nome, boolean prioridade){
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getPrioridade() {
        return this.prioridade;
    }
    public void setPrioridade(boolean prioridade) {
        this.prioridade = prioridade;
    }

    public String toString(){
        return "A Pessoa " + this.nome + ", tem prioridade = " + this.prioridade;
    }

    @Override
    public int compareTo(PessoaPrioridade outraPessoa) {
        if (this.getPrioridade() && !outraPessoa.getPrioridade()) {
            return -1;
        } else if (!this.getPrioridade() && outraPessoa.getPrioridade()){
            return 1;
        }

        return this.getNome().compareTo(outraPessoa.getNome());
    }

}
