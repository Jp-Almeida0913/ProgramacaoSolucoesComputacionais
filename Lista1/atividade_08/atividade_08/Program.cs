using System;

class Program
{
    static void Main()
    {
        int option;
        double temperature, conversion;

        Console.Write("Escolha qual conversão deseja realizar:\n" +
            "1) De Celsius para Fahrenheit\n" +
            "2) De Fahrenheit para Celsius\n" +
            "--> ");

        option = int.Parse(Console.ReadLine());

        switch (option)
        {
            case 1:
                Console.Write("Informe o valor em Celsius que deseja converter para Fahrenheit:\n--> ");
                temperature = double.Parse(Console.ReadLine());

                conversion = CelsiusToFahrenheit(temperature);
                Console.WriteLine($"Temperatura convertida: {conversion:F2} °F");
                break;

            case 2:
                Console.Write("Informe o valor em Fahrenheit que deseja converter para Celsius:\n--> ");
                temperature = double.Parse(Console.ReadLine());

                conversion = FahrenheitToCelsius(temperature);
                Console.WriteLine($"Temperatura convertida: {conversion:F2} °C");
                break;

            default:
                Console.WriteLine("Opção inválida!");
                break;
        }
    }

    static double CelsiusToFahrenheit(double celsius)
    {
        return (celsius * (9.0 / 5.0)) + 32;
    }

    static double FahrenheitToCelsius(double fahrenheit)
    {
        return (fahrenheit - 32) * (5.0 / 9.0);
    }
}