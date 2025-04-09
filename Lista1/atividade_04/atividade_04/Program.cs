class Program
{
    static void Main()
    {
        double x, y, max;

        Console.Write("Informe um número --> ");
        x = double.Parse(Console.ReadLine());

        Console.Write("Informe outro número --> ");
        y = double.Parse(Console.ReadLine());

        max = Math.Max(x, y);
        Console.WriteLine(max);
    }
}