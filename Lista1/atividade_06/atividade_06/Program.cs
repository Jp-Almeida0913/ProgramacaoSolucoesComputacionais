class Program
{
    static void Main()
    {
        double num1, num2, num3, maxOf, higherNumber;

        Console.Write("Informe o primeiro número --> ");
        num1 = double.Parse(Console.ReadLine());

        Console.Write("Informe o segundo número --> ");
        num2 = double.Parse(Console.ReadLine());

        Console.Write("Informe o terceiro número --> ");
        num3 = double.Parse(Console.ReadLine());

        higherNumber = Math.Max(num1, num2);
        maxOf = Math.Max(higherNumber, num3);

        Console.WriteLine(maxOf);
    }
}