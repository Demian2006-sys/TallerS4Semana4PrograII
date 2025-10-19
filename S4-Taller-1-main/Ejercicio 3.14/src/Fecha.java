public class Fecha {
    /**Inicializamos los atributos*/
    private int dia;
    private int mes;
    private int ano;

    /**Metodos de java*/

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    /**Metodos del programador*/

    public String mostrarFecha(int dia, int mes, int ano){
        String fecha;
        fecha = this.dia + "/" + this.mes + "/" + this.ano ;
        return fecha;
    }


}