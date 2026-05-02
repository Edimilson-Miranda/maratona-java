package academy.devdojo.maratonajava.intruducao;

/**  Eu <nome> morando no endereço <endereco>,
*  confirmo que recebi o salário de <salario>,
*  na data <data>.
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "João";
        String endereco = "Rua Fernando";
        double salario = 2500.0;
        String dataDoRecebimentoDoSalario = "20/02/2026";
        String relatorio = "Eu " + nome + " morando no endereço " + endereco + ", confirmo que recebi o salário de R$ " + salario
                + ", na data " + dataDoRecebimentoDoSalario;

        System.out.println(relatorio);
    }
}
