class Program
{
    static void Main()
    {
        double x, y, minOf;

        Console.Write("Informe um número --> ");
        x = double.Parse(Console.ReadLine());

        Console.Write("Informe outro número --> ");
        y = double.Parse(Console.ReadLine());

        minOf = Math.Min(x, y);
        Console.WriteLine(minOf);
    }
}