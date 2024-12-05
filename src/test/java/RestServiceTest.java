
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.services.RestService;

public class RestServiceTest {
    @Test
    void firstTest() {
        RestService service = new RestService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int count = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, count);
        System.out.println(count);
    }

    @Test
    void secondTest() {
        RestService service = new RestService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int count = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, count);
        System.out.println(count);
    }
}