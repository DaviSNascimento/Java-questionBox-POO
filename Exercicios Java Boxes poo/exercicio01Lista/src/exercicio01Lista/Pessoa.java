package exercicio01Lista;
/**
 *
 * @author DaviP
 */
import javax.swing.JOptionPane;

public class Pessoa {
    private String CPF, nome;
    private int idade;
     private char sexo;
    private boolean verifica = true;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String imprimir(){
        return "A pessoa " + this.nome + " do sexo " + this.sexo + " com CPF " + this.CPF + " possui " + this.idade + " anos de idade.";
    }
    public void menu(){
        Object[] objLista01 = {"Criar Pessoa", "Mostrar Pessoa", "Sair"};
        Object[] ObjLista02 = {"Nome", "CPF", "Sexo", "Idade", "Sair"};
        boolean verify = true;
        do{
            Object selectValue = JOptionPane.showInputDialog(null, "Escolha um Item: ", "Opção", JOptionPane.INFORMATION_MESSAGE, null, objLista01, objLista01[0]);
            switch(selectValue.toString()){
                case "Criar Pessoa":{
                    while(verify == true){
                        Object selectedValue = JOptionPane.showInputDialog(null, "Escolha um Item: ", "Opção", JOptionPane.INFORMATION_MESSAGE, null, ObjLista02, ObjLista02[0]);
                        switch(selectedValue.toString()){
                            case "Nome" -> {
                                String inputNome = JOptionPane.showInputDialog("Digite o nome: ");
                                setNome(inputNome);
                            }
                            case "CPF" -> {
                                String inputCPF = JOptionPane.showInputDialog("Digite o CPF: ");
                                setCPF(inputCPF);
                            }
                            case "Sexo" -> {
                                String inputSexo = JOptionPane.showInputDialog("Digite o Sexo: ");
                                setSexo(inputSexo.charAt(0));
                            }
                            case "Idade" -> {
                                String inputIdade = JOptionPane.showInputDialog("Digite a Idade: ");
                                setIdade(Integer.parseInt(inputIdade));
                            }
                            case "Sair" -> {
                                verify = false;
                            }
                        }
                    }
                    break;
                }
                case "Mostrar Pessoa":{
                    JOptionPane.showMessageDialog(null, imprimir());
                    break;
                    
                }
                case "Sair":{
                    this.verifica = false;
                }
            }
        }while(this.verifica == true);
    }
}
