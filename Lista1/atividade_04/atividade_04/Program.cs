class Program
{
    static void Main()
    {
        double x, y, maxOf;

        Console.Write("Informe um número --> ");
        x = double.Parse(Console.ReadLine());

        Console.Write("Informe outro número --> ");
        y = double.Parse(Console.ReadLine());

        maxOf = Math.Max(x, y);
        Console.WriteLine(maxOf);
    }
}