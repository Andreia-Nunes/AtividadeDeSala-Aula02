public class ContaLogin {
    private String nomeUsuario;
    private String emailUsuario;
    private String dataNascimento;
    private int senha;

    public String getNomeUsuario(){
        return this.nomeUsuario;
    }

    public String getEmailUsuario(){
        return this.emailUsuario;
    }

    public String getDataNascimento(){
        return this.dataNascimento;
    }

    public void setNomeUsuario(String novoNome){
        this.nomeUsuario = novoNome;
    }

    public void setEmailUsuario(String novoEmail){
        this.emailUsuario = novoEmail;
    }

    public void setDataNascimento(String data){
        this.dataNascimento = data;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}
