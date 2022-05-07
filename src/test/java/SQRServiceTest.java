import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/positive.csv")
    void positiveTests(int start, int end, int expected) {
        SQRService service = new SQRService();
        Assertions.assertEquals(expected, service.countSquaresInRange(start, end));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/out_of_range.csv")
    void outOfRange(int start, int end, int expected) {
        SQRService service = new SQRService();
        Assertions.assertEquals(expected, service.countSquaresInRange(start, end));
    }

    @Test
    void switchedRangeNegativeTest() {
        SQRService service = new SQRService();
        Assertions.assertEquals(0, service.countSquaresInRange(1000, 300));
    }

    @Test
    void strictRangeValues() {
        SQRService service = new SQRService();
        Assertions.assertEquals(2, service.countSquaresInRange(100, 121));
    }
}