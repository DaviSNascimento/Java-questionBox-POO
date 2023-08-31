package exercicio03Lista;
/**
 *
 * @author DaviP
 */
import javax.swing.JOptionPane;
public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora, qntdHora, salario, valorDesconto;
    private boolean verificar = true;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtDeHora() {
        return qntdHora;
    }

    public void setQtDeHora(float qtDeHora) {
        this.qntdHora = qtDeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    public float calcularSalario(){
        if(tipoVinculo == "H".charAt(0) || tipoVinculo == "h".charAt(0)){
            return valorHora * qntdHora - valorDesconto;
        }
        else{
            return salario - valorDesconto;
        }
    }
    public String imprimir(){
        return "Crachá: " + cracha + "\nNome: " + nome + "\nTipo de Vínculo: " + tipoVinculo + "\nSalário: " + salario + "\nValor Hora: " + valorHora + "\nQuantia de Horas: " + qntdHora + "\nDesconto: " + valorDesconto + "\n\nValor Final: " + calcularSalario();
    }
    public void menu(){
        Object[] itens1 = {"Criar Funcionário", "Mostrar Folha de Pagamento", "Alterar Forma de Remuneração", "Sair"};
        Object[] itens2 = {"Crachá", "Nome", "Tipo de Vínculo", "Salário", "Valor Hora", "Quantia de Horas", "Desconto", "Sair"};
        do{
            Object selectValue = JOptionPane.showInputDialog(null, "Escolha um Item", "Escolha um Item", JOptionPane.INFORMATION_MESSAGE, null, itens1, itens1[0]);
            switch(selectValue.toString()){
                case "Criar Funcionário":{
                    boolean verify = true;
                    do{
                        Object selectedValue = JOptionPane.showInputDialog(null, "Escolha um Item", "Escolha um Item", JOptionPane.INFORMATION_MESSAGE, null, itens2, itens2[0]);
                        switch(selectedValue.toString()){
                            case "Crachá" -> {
                                String inputCracha = JOptionPane.showInputDialog("Digite o crachá: ");
                                setCracha(Integer.parseInt(inputCracha));
                            }
                            case "Nome" -> {
                                String inputNome = JOptionPane.showInputDialog("Digite o nome: ");
                                setNome(inputNome);
                            }
                            case "Tipo de Vínculo" -> {
                                String inputVinculo = JOptionPane.showInputDialog("Digite o Vínculo: ");
                                setTipoVinculo(inputVinculo.charAt(0));
                            }
                            case "Salário" -> {
                                String inputSalario = JOptionPane.showInputDialog("Digite o Salario: ");
                                setSalario(Float.parseFloat(inputSalario));
                            }
                            case "Desconto" -> {
                                String inputDesconto = JOptionPane.showInputDialog("Digite o Nome: ");
                                setValorDesconto(Float.parseFloat(inputDesconto));
                            }
                            case "Sair" -> {
                                verify = false;
                            }
                            case "Quantia de Horas" -> {
                                String inputHoras = JOptionPane.showInputDialog("Digite a Carga Horaria:");
                                setQtDeHora(Float.parseFloat(inputHoras));
                            }
                            case "Valor Hora" -> {
                                String inputValorHora = JOptionPane.showInputDialog("Digite o Valor Hora: ");
                                setValorHora(Float.parseFloat(inputValorHora));
                            }
                        }
                    }while(verify == true);
                    break;
                }
                case "Mostrar Folha de Pagamento: ":{
                    JOptionPane.showMessageDialog(null, imprimir());
                    break;
                }
                case "Alterar Forma de Remuneracao: ":{
                    String inputVinculo = JOptionPane.showInputDialog("Digite o Novo Tipo de Vinculo: ");
                    setTipoVinculo(inputVinculo.charAt(0));
                    break;
                }
                case "Sair":{
                    verificar = false;
                }
            }
        }while(verificar == true);
    }
}