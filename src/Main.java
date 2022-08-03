public class Main {
    public static void main(String[] args) {
 // Задание № 1
    byte pen = 120;
    short pencil = 150;
    int ruler = 200;
    long paperclips = 230L;
    float sugar = 3.5f;
    double salt = 5.6;
    boolean rulerIsLonger = pen < 200;
    System.out.println(rulerIsLonger);
    char percent = 35;
    System.out.println(percent);

    // Задание № 2
    double boxer1 = 78.2;
    double boxer2 = 82.7;
    double totalWeightBoxers = boxer1 + boxer2;
    System.out.println("Общий вес боксеров" + totalWeightBoxers);
    double weightDifference = boxer2 - boxer1;
    System.out.println("Разница в весе боксеров" + weightDifference);

    // Задание № 3
    int bananas = 5;
    int milk = 200;
    int iceCream = 2;
    int egg = 4;
    int weightBananas = bananas * 80;
    System.out.println("Общий вес бананов" + weightBananas);
    int weightMilk = (milk/100) * 105;
    System.out.println("Вес молока" + weightMilk);
    int weightEgg = egg * 70;
    System.out.println("Вес яиц" + weightEgg);
    int weightIceCream =iceCream * 100;
    System.out.println("Все мороженного" +weightIceCream);
    int totalWeight = weightEgg + weightBananas + weightIceCream + weightMilk;
    System.out.println("Общий вес коктеля" +totalWeight);
    int kg = totalWeight / 1000;
    System.out.println("Перевод в килограммы" + kg);

    // Задание № 4
    int sportsmen = 7 ;
    int weightInDay = (sportsmen * 1000) / 250;
    System.out.println("Потреря веса 250 " + weightInDay);
    int weightInDays = (sportsmen * 1000) / 500;
    System.out.println("Потеря веса 500" +weightInDays);
    int day = (weightInDay +weightInDays)/2;
    System.out.println("Дней в среднем чтобы добиться результата похудения"+ day);

// Задание № 5
int Masha = 67_760;
int Denis = 83_690;
int Kristina = 76_230;
int mashasalary = Masha * 10/ 100;
System.out.println("Увеличение зарплаты у Маши на" + mashasalary);
int denissalary = Denis * 10/ 100;
System.out.println("Увеличение зарплаты у Дениса на" + denissalary);
int kristinasalary = Kristina * 10/100;
System.out.println("Увеличение зарплаты у Кристины на" +kristinasalary);
int totalSalayMasha= Masha+mashasalary;
System.out.println("Общая сумма у Маши в месяц" + totalSalayMasha);
int totalSalaryDen=Denis+denissalary;
System.out.println("Общая сумма у Дениса в месяц" + totalSalaryDen);
int totalSalaryKri=Kristina+kristinasalary;
System.out.println("Общая сумма у Кристины в месяц" +totalSalaryKri);

int annualIncomeMashi = Masha *12;
System.out.println("Годовой доход Маши до повышения" +annualIncomeMashi);
int annualIncomeafterMashi = totalSalayMasha * 12;
System.out.println("Годовой доход Маши после повышения" +annualIncomeafterMashi);
int sallaryDifferenceMasha = annualIncomeafterMashi -annualIncomeMashi;
System.out.println("Разница в зарплате у Маши" +sallaryDifferenceMasha);

int annualIncomeDen = Denis * 12;
System.out.println("Годовой доход Дениса до повышения" +annualIncomeDen);
int annualIncomeafterDen = totalSalaryDen * 12;
System.out.println("Годовой доход Дениса после повышения" +annualIncomeafterDen);
int sallaryDifferenceDenis = annualIncomeafterDen - annualIncomeDen;
System.out.println("Разница в зарплате у Дениса" + sallaryDifferenceDenis);

int annualIncomeKri = Kristina * 12;
System.out.println("Годовой доход Кристины до повышения" + annualIncomeKri);
int annualIncomeafterKri = totalSalaryKri * 12;
System.out.println("Годовой доход Кристины после повышения" + annualIncomeafterKri);
int sallaryDifferenceKristina = annualIncomeafterKri - annualIncomeKri;
System.out.println("Разница в зарплате у Кристины" + sallaryDifferenceKristina);























    }
}













