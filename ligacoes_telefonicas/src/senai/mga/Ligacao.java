package senai.mga;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ligacao {

	private Date data;
    private double valor;
    private long minutos;
    private int pulsos;
    private String telefone;

    public Ligacao(Date data, long minutos, String telefone) {
        this.data = data;
        this.minutos = minutos;
        this.telefone = telefone;
        this.pulsos = calcularPulsos();
        this.valor = calcularValor();
    }

    private int calcularPulsos() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Se for final de semana, contabiliza um pulso apenas
        if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
            return 1;
        } else {
            int pulsos = 1; // A ligação ao ser completada já conta um pulso
            pulsos += minutos / 4;
            return pulsos;
        }
    }

    private double calcularValor() {
        return pulsos * 0.08;
    }

    public Date getData() {
        return data;
    }

    public long getMinutos() {
        return minutos;
    }

    public int getPulsos() {
        return pulsos;
    }

    public double getValor() {
        return valor;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return "Ligacao{" +
                "data=" + sdf.format(data) +
                ", minutos=" + minutos +
                ", pulsos=" + pulsos +
                ", valor=" + valor +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
