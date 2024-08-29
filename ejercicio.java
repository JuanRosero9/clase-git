    public class ejercicio {
    float salarioSinAjuste;
    float aumento;
    float salarioConAjuste;

    public ejercicio(float salarioSinAjuste,float aumento, float salarioConAjuste) {
        this.salarioSinAjuste = salarioSinAjuste;
        this.aumento = aumento;
        this.salarioConAjuste = salarioConAjuste;
    }
        
    public float calcularsalario(){
        if (salarioSinAjuste<1300606) {
            salarioConAjuste=salarioConAjuste + (aumento * salarioSinAjuste);
        } else {
            salarioConAjuste=salarioSinAjuste;
        }

        return salarioConAjuste;
    }
    }