import Subjects.Subject;
import Observers.*;

public class Client {
    public static void main(String[] args) {

        Subject danskeKroner = new Subject();

        new USD_Observer(danskeKroner);
        new EUR_Observer(danskeKroner);
        new GBP_Observer(danskeKroner);
        new SEK_Observer(danskeKroner);

        danskeKroner.setAmount_DKK(100);
        System.out.println();
        danskeKroner.setAmount_DKK(200);
        System.out.println();
        danskeKroner.setAmount_DKK(500);

    }
}
