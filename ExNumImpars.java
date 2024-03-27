import javax.swing.JOptionPane;

public class ExNumImpars {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número;"));
        int nImp = 0; //número de vezes que imprimiu
        int numero = 1; 
        while (nImp < n){
            if (numero % 2 == 1){
                nImp++;
                System.out.println("#"+nImp + " - "+ numero);
            }
            numero++;
        }
    }
}
