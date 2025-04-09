using System;

class Program
{
    static void Main()
    {
        double radius, volume;

        Console.WriteLine("Insira o Raio da esfera para saber o seu volume:");
        radius = double.Parse(Console.ReadLine());

        volume = CalculateSphereVolume(radius);
        Console.WriteLine($"A esfera de raio {radius} possuí o volume = {volume}");
    }

    static double CalculateSphereVolume(double radius)
    {
        const double pi = 3.14;
        double result;

        result = (4.0 / 3.0) * (pi * Math.Pow(radius, 3.0));
        return result;
    }
}