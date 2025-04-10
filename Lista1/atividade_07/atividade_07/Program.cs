class Program
{
    static void Main()
    {
        double number1, number2, number3, minOf, lowerNumber;

        Console.Write("Informe o primeiro número --> ");
        number1 = double.Parse(Console.ReadLine());

        Console.Write("Informe o segundo número --> ");
        number2 = double.Parse(Console.ReadLine());

        Console.Write("Informe o terceiro número --> ");
        number3 = double.Parse(Console.ReadLine());

        lowerNumber = Math.Min(number1, number2);
        minOf = Math.Min(lowerNumber, number3);

        Console.WriteLine(minOf);
    }
}