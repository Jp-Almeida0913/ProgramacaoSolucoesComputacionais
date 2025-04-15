Este repositório contém commits relacionados às atividades propostas nas Listas de Atividades da disciplina de Programação de Soluções Computacionais, com o objetivo de praticar lógica de programação utilizando a linguagem C#.


using System;
					
public class Program
{
	public static void Main()
	{
		double a, b, c;
		
		Console.Write("Insira o valor de A --> ");
		a = double.Parse(Console.ReadLine());

		Console.Write("Insira o valor de B --> ");
		b = double.Parse(Console.ReadLine());
		
		Console.Write("Insira o valor de C --> ");
		c = double.Parse(Console.ReadLine());
		
		QuadraticEquation test = new QuadraticEquation(a, b, c);
		Console.Write(test);
		
	}
}

public class QuadraticEquation
{
	double A;
	double B;
	double C;
	
	public QuadraticEquation(double a, double b, double c)
	{
		A = a;
		B = b;
		C = c;
	}
	
	public double Delta()
	{
		return Math.Pow(B, 2.0) - 4*(A*C); 
	}
	
	public double FirstBhaskara(double delta)
	{
		delta = Delta();
		return (-B + Math.Sqrt(delta))/2;
	}
	
	public double SecondBhaskara(double delta)
	{
		delta = Delta();
		return (-B - Math.Sqrt(Delta()))/2;
	}
	
	public override string ToString()
	{
		string bFormatted = B >= 0 ? $"+ {B}" : $"- {Math.Abs(B)}";
		string cFormatted = C >= 0 ? $"+ {C}" : $"- {Math.Abs(C)}";

		return $"A equação de segundo grau:\n\n{A}x² {bFormatted}x {cFormatted} = 0\n\nTem como resultado: {FirstBhaskara} e {SecondBhaskara}";
	}
}
