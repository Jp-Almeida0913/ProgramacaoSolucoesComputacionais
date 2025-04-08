class Program
{
    static void Main()
    {
        int number;
        string positiveOrNegative;

        Console.WriteLine("Informe um número:");
        number = int.Parse(Console.ReadLine());
        Console.Clear();

        positiveOrNegative = PositiveOrNegative(number);
        Console.WriteLine(positiveOrNegative);
    }

    static string PositiveOrNegative(int number)
    {
        if (number < 0) return $"{number} é um número Negativo";

        else if (number == 0) return $"O número é igual a {number}";

        else return $"{number} é um número Positivo";
    }
}