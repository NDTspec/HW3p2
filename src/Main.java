public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 126;
        double hight = 1.73;
        int bmi = service.calculate(weight, hight);
        System.out.println("Ваш индекс массы тела: " + bmi + " балла");
    }
}