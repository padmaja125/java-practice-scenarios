public class SQLTrainer extends Trainer {
    public SQLTrainer(String dept, String institute) {
        super(dept, institute);
    }

    public SQLTrainer() {
        super();
    }

    public static void main(String[] args) {
        SQLTrainer ram = new SQLTrainer();
        ram.training();
        System.out.println(ram.getSalary());
    }
}
