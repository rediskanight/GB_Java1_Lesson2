
// Д.З 2
public class HomeWorkApp2 {
    public static void main(String[] args) {
        //System.out.println(checkSumOf(10,12));
        //System.out.println(plusMinus(100));
        //System.out.println(plusMinus2(-11));
        //      printN("Миру мир",7);
        System.out.println(visYear(1982));

    }
//1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean checkSumOf(int a,int b) {
         boolean bool = a+b>=10 && a+b<=20;
         return bool;
    }
//2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static String plusMinus(int aa) {
        String ans;
        if (aa >= 0) {
            ans = "Положительное";
        }
        else{
            ans = "Отрицательное"; }
        return ans;
    }
//3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean plusMinus2(int aaa) {
       boolean bool1 = aaa<0;
       return bool1;
    }
    // 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз
public static void printN(String text,int n)
{int a = n;
    for (a = a ;a>0;a-=1){
    System.out.println(text);
} }
    //5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean visYear(int year) {
    boolean bool2 = year % 4 == 0 &&
    return bool2;  }
}




