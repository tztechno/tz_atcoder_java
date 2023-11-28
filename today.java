import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // 現在の日付を取得
        LocalDate now = LocalDate.now();

        // 年、月、日を取得
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();

        // 年-月-日の形式で表示
        System.out.printf("日付: %d-%02d-%02d%n", year, month, day);
    }
}
