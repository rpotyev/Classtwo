public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bodyWeight = 70;
        int height = service.calculate(bodyWeight);
        int index = bodyWeight / height;
        System.out.println(index);
    }
}