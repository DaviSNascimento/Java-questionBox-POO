package exercicio02Lista;
/**
 *
 * @author DaviP
 */
import javax.swing.JOptionPane;
public class Aluno {
    private String Ra, Nome;
    private float ac1, ac2, ag, af;
    private boolean verificar = true;

    public String getRa() {
        return Ra;
    }

    public void setRa(String Ra) {
        this.Ra = Ra;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getAc1() {
        return ac1;
    }

    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAc2() {
        return ac2;
    }

    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAg() {
        return ag;
    }

    public void setAg(float ag) {
        this.ag = ag;
    }

    public float getAf() {
        return af;
    }

    public void setAf(float af) {
        this.af = af;
    }
    public float calcularMedia(){
        double Media = (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);
        float media = (float) Media;
        return media;
    }
    public String verificarAprovacao(){
        if(calcularMedia() >= 5){
            return "Aprovado!";
        }
        else{
            return "Reprovado!";
        }
    }
    public String imprimir(){
        return "Ra: " + Ra + "\nNome: " + Nome + "\nAC1: " + ac1 + "\nAC2: " + ac2 + "\nAG: " + ag + "\nAF: " + af + "\nMedia: " + calcularMedia() + "\n\nSituação: " + verificarAprovacao();     
    }
    public void menu(){
        Object[] caixa01 = {"Criar Aluno", "Mostrar Aluno", "Sair"};
        Object[] caixa02 = {"Nome", "RA", "AC1", "AC2", "AG", "AF", "Sair"};
        boolean verify = true;
        do{
            Object selectValue = JOptionPane.showInputDialog(null, "Escolha um Item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, caixa01, caixa01[0]);
            switch(selectValue.toString()){
                case "Criar Aluno":{
                    while(verify == true){
                        Object selectedValue = JOptionPane.showInputDialog(null, "Escolha um Item: ", "Opção", JOptionPane.INFORMATION_MESSAGE, null, caixa02, caixa02[0]);
                        switch(selectedValue.toString()){
                            case "Nome" ->  {
                                String inputNome = JOptionPane.showInputDialog("Digite o Nome: ");
                                setNome(inputNome);
                            }
                            case "RA" ->  {
                                String inputRA = JOptionPane.showInputDialog("Digite o RA: ");
                                setRa(inputRA);
                            }
                            case "AC1" ->  {
                                String inputAC1 = JOptionPane.showInputDialog("Digite a AC1: ");
                                setAc1(Float.parseFloat(inputAC1));
                            }
                            case "AC2" ->  {
                                String inputAC2 = JOptionPane.showInputDialog("Digite a AC2: ");
                                setAc2(Float.parseFloat(inputAC2));
                            }
                            case "AG" ->  {
                                String inputAG = JOptionPane.showInputDialog("Digite a AG: ");
                                setAg(Float.parseFloat(inputAG));
                            }
                            case "AF" ->  {
                                String inputAF = JOptionPane.showInputDialog("Digite a AF: ");
                                setAf(Float.parseFloat(inputAF));
                            }
                            case "Sair" -> {
                                verify = false;
                            }
                        } 
                    }
                    break;
                }
                case "Mostrar Aluno":{
                    JOptionPane.showMessageDialog(null, imprimir());
                    break;
                }
                case "Sair":{
                    this.verificar = false;               }
            }
        }while(this.verificar == true);
    }
    
}
