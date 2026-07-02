package negocio;

public class FichaFinanciera {

    private double honorariosPactados;
    private double gastosRealizados;
    private double adelantosPercibidos;
    private double saldoPendiente;

    public FichaFinanciera (){
    }


    private void calcularSaldoPendiente() {
        this.saldoPendiente = (this.honorariosPactados + this.gastosRealizados) - this.adelantosPercibidos;
    }



    public double getSaldoPendiente() {
        calcularSaldoPendiente();
        return saldoPendiente;
    }

    public double getHonorariosPactados() {
        return honorariosPactados;
    }

    public double getGastosRealizados() {
        return gastosRealizados;
    }

    public double getAdelantosPercibidos() {
        return adelantosPercibidos;
    }

}
