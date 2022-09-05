public class TesteContaLogin {
    public static void main(String[] args) {
        ContaLogin conta = new ContaLogin();

        conta.setNomeUsuario("Andréia Nunes");
        conta.setEmailUsuario("andreia@gmail.com");
        conta.setDataNascimento("18/09/1996");
        conta.setSenha(123456);

        System.out.printf("Usuário: %s\n", conta.getNomeUsuario());
        System.out.printf("Email: %s\n", conta.getEmailUsuario());
        System.out.printf("Data de nascimento: %s\n", conta.getDataNascimento());
    }
}
