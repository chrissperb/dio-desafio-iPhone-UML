public class iPhone {

    static class iPhoneImplementation implements ReprodutorMusicalInterface, AparelhoTelefonicoInterface, NavegadorInternetInterface {

        @Override
        public void tocar() {
            System.out.println("Tocando a música selecionada.");
        }

        @Override
        public void pausar() {
            System.out.println("Player de música pausado.");
        }

        @Override
        public void selecionarMusica() {
            System.out.println("Selecione a música desejada.");
        }

        @Override
        public void ligar() {
            System.out.println("Ligando para o número selecionado.");
        }

        @Override
        public void atender() {
            System.out.println("Atendendo a ligação.");
        }

        @Override
        public void iniciarCorreioVoz() {
            System.out.println("Chamando Correio de Voz.");
        }

        @Override
        public void exibirPagina() {
            System.out.println("Abrindo página da web.");
        }

        @Override
        public void adicionarNovaAba() {
            System.out.println("Criando nova aba em branco.");
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Página atualizada.");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe que implementa as interfaces
        iPhoneImplementation meuiPhone = new iPhoneImplementation();

        // Testando os métodos das interfaces
        meuiPhone.selecionarMusica();
        meuiPhone.tocar();
        meuiPhone.pausar();

        meuiPhone.ligar();
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        meuiPhone.exibirPagina();
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}