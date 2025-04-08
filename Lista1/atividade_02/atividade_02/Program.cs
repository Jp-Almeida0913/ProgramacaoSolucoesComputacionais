class Program
{
    static void Main()
    {
        int number;
        String evenOrOdd;

        Console.WriteLine("Informe um número:");
        number = int.Parse(Console.ReadLine());

        evenOrOdd = EvenOrOdd(number);
        Console.WriteLine(evenOrOdd);
    }

    static String EvenOrOdd(int number)
    {
        if (number % 2 == 0) return "Par";

        else return "Impar";
    }
}