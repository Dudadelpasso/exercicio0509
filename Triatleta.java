public class Triatleta extends Pessoa implements Ciclista, Corredor, Nadador{

    @Override
    public void aquecer() {
        System.out.println(getNomeDaPessoa()+" tem que aquecer antes do treino");
    }

    @Override
    public void nadar() {
        System.out.println(getNomeDaPessoa()+" nada");
    }

    @Override
    public void correr() {
        System.out.println(getNomeDaPessoa()+" corre");
    }

    @Override
    public void pedalar() {
        System.out.println(getNomeDaPessoa()+" pedala");
    }
    

    
}