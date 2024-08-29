import javax.swing.*;
public class mainJOP {

    public static void main(String[] args){
        String salarioSinAjusteMje= JOPtionpane.showInputDialog("ingrese el salario sin ajuste: ");
        String aumentoMje= JOPtionpane.showInputDialog("ingrese el porcentaje del aumento( si es el 15% ingresar el 0,15): ");
        float salarioSinAjuste = float.parseFloat(salarioSinAjusteMje);
        float aumento = float.parseFloat(aumentoMje);
        ejercicio pruebaJOP = new ejercicio(salarioSinAjuste, aumento, salarioConAjuste:0);
        float salarioAjustado= pruebaJOP.calcularsalario();
        JOPtionpane.showInputDialog(null,"El salario con ajuste es " + salarioAjustado);
    }
}