public class Funcionario { //Estudando Abstração
	
	private String nome;
	private Integer idade;
	private Double salario;
	
	public Funcionario(String nome, Integer idade, Double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	//Esse construtor da linha 7, pega via parâmetro os valores que ele precisa e ele repassa esses valores aos atributos da nossa classe
	}
	
	public static Double calculaDecimoTerceiroSalario(Double salario) {
	//Eu estou indicando que cada funcionário, vai ter um 13° Salário
		return salario + salario * 0.10;
		//Aqui ele vai calcular o 13° salário
	}
	
	public static void main(String [] args) {
		Funcionario funcionario = new Funcionario(nome: "Milton", idade: 21, salario: 580,00);
		//Aqui estou falando que a minha variável funcionario é do tipo funcionario, e ele ta recebendo uma nova instância de funcionario
		
		System.out.println("Funcionario: Nome =" 
		+ fucionario.nome + "Idade= " 
		+ funcionario.idade + "Salario= " 
		+ funcionario.salario);
		
		Double decimoTerceiro = calculaDecimoTerceiroSalario(funcionario.salario);
		
		System.out.println("O décimo terceiro salário do Funcionário " + funcionario.nome + " será: " + decimoTerceiro);
	}
}