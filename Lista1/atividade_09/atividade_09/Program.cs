

class Program
{
    static void Main()
    {
        double num1, num2, num3, average, topAverage, highestGrade, lowestGrade;

        Console.Write("Insira a primeira nota --> ");
        num1 = double.Parse(Console.ReadLine());

        Console.Write("Insira a segunda nota --> ");
        num2 = double.Parse(Console.ReadLine());

        Console.Write("Insira a terceira nota --> ");
        num3 = double.Parse(Console.ReadLine());

        Console.Clear();

        GradeAverageCalculator studentGrade = new GradeAverageCalculator(num1, num2, num3);

        average = studentGrade.GradeAverage();
        Console.WriteLine($"Média das notas: {average}");

        topAverage = studentGrade.AverageOfTopGrades();
        Console.WriteLine($"Média das duas maiores notas: {topAverage}");

        studentGrade.GetTopAndLowestGrades(out highestGrade, out _, out lowestGrade);
        Console.WriteLine($"Maior nota: {highestGrade}, Menor nota: {lowestGrade}");
    }

    class GradeAverageCalculator
    {
        public double number1;
        public double number2;
        public double number3;
        public List<double> grades;

        public GradeAverageCalculator(double num1, double num2, double num3)
        {
            number1 = num1;
            number2 = num2;
            number3 = num3;
            grades = new List<double> { number1, number2, number3 };
        }
        public double GradeAverage()
        {
            return grades.Average();
        }

        public void GetTopAndLowestGrades(out double highestGrade, out double secondHighestGrade, out double lowestGrade)
        {
            grades.Sort();
            highestGrade = grades[2];
            secondHighestGrade = grades[1];
            lowestGrade = grades[0];
        }

        public double AverageOfTopGrades()
        {
            GetTopAndLowestGrades(out double highestGrade, out double secondHighestGrade, out _);
            return (highestGrade + secondHighestGrade) / 2;
        }
    }
}