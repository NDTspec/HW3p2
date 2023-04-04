public class BmiService {
    public int calculate(double weight, double hight) {
        double bmi = weight / (hight * hight);
        return (int) bmi;
    }
}
