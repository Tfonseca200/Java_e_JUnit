package resumos_rock;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class main {

	public static void main(String[] args) {
		
		String nome = "Thiago";
		int numero = 5;
		double valor = 2.53;
		
		System.out.printf("Meu nome é %s e o numero da minha compra é %d com o valor de R$ %.2f \n", nome, numero,valor);
		
		
		String sobrenome1 = "Fonseca";
		String sobrenome2 = "Claudino";
		
		StringBuilder nomeCompleto = new StringBuilder();
		
		nomeCompleto.append(nome);
		nomeCompleto.append(sobrenome1);
		nomeCompleto.append(sobrenome2);
		
		System.out.println(nomeCompleto);
		
		
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());
		
		
		
		System.out.println("=====================================BIG DECIMAL========================================================");
		
		
		BigDecimal zero = BigDecimal.ZERO;
		BigDecimal um = zero.add(new  BigDecimal(50));
		BigDecimal result = um.subtract(new  BigDecimal(25));
		Long longuinho = 123L;
		
		System.out.println(um);
		System.out.println(result);
		
		
		
		System.out.println("========================================================================================================");
		
		//Acrecentando valor
		BigDecimal valorLitro = BigDecimal.valueOf(5.799);
		BigDecimal litroUtilizados = BigDecimal.valueOf(21.752);
		//Multiplicando valor
		BigDecimal valorApagar = litroUtilizados.multiply(valorLitro);
		
		System.out.println(valorApagar);
		
		//arredondando
		BigDecimal valoArredodado = valorApagar.setScale(2,RoundingMode.HALF_EVEN);
		System.out.println(valoArredodado);

		
		
		System.out.println("================================== Datas com LocalDate =====================================================");
		
		
		LocalDate dataNascimento = LocalDate.of(2001, 10, 04);
		
		//(está errado) LocalDate diasVivido = LocalDate.now().minusYears(dataNascimento.getYear());
	
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//Formatando data
		System.out.println(formatter.format(dataNascimento));
		
		String dataFormatadaFull = dataNascimento.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
		System.out.println(dataFormatadaFull);
		
		String dataFormatadaMedium  = dataNascimento.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)); 
		System.out.println(dataFormatadaMedium);
		
		String dataFormatadaShort  = dataNascimento.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)); 
		System.out.println(dataFormatadaShort);
		
		
		System.out.println("================================== Horas com LocalTime =====================================================");
		
		LocalTime horaAtual = LocalTime.now();
		//LocalTime horaMinutoSegundoEspecificos = LocalTime.of(13,00,50);
		//LocalTime horaMinutoEspecifico = LocalTime.of(22,45);
		//LocalTime horaDeUmaString = LocalTime.parse("20:38");
		
		DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(horaFormatada.format(horaAtual));
		
		LocalTime horaAtualMais30Minutos = horaAtual.plusMinutes(15);
		DateTimeFormatter formatPlus30Segundos = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(formatPlus30Segundos.format(horaAtualMais30Minutos));
				
		
		
		System.out.println("==================================dias e Horas com LocalDateTime =====================================================");
			
		LocalDateTime horaData = LocalDateTime.now();
		DateTimeFormatter formatt = DateTimeFormatter.ofPattern("dd/MM/yyy hh:mm:ss");
		System.out.println(formatt.format(horaData));
		
		System.out.println("==================================Transformando LocalDateTime =====================================================");
		
		/*
		LocalDateTime data = LocalDateTime.of(2020,01,01,00,00,00);
		esperaData(data.toLocalDate());
		esperaData(data.toLocalTime());
		*/
		
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.of(22, 50);
		LocalDateTime dataHora = localDate.atTime(localTime);
		esperaData(dataHora);
		
	}
	
	static void esperaData(LocalDate data) {
		System.out.println("implementação de data: " + data);
		
	}
	
	static void esperaData(LocalTime data) {
		System.out.println("implementação de hora: " + data);
	}
	
	static void esperaData(LocalDateTime data) {
		DateTimeFormatter formart = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("implementação de data e hora: " + formart.format(data));
		
		
		
		System.out.println("================================== Expressões =======================================================");
		
		System.out.println(String.format("hello %s", "world"));
		System.out.println(String.format("valor %.2f", 2.00));
		
		String nome = "Thiago";
		String sobrenome = "Fonseca Claudino";
		int idade = 22;
		double salario = 7500;
		LocalDate date = LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dateF = format.format(date);
		
		
		String StringPersonalizada = String.format("Nome: %s Sobrenome: %s idade: %d Salario: %.0f data atual: %s", nome,sobrenome, idade, salario, dateF);
		System.out.println(StringPersonalizada);
		
		
		
	}
	
	
	
}
