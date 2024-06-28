import java.time.LocalDateTime;

public class DateTime {
    LocalDateTime currentDateTime;
    String date;
    String time;

    public DateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        date = currentDateTime.getYear()+"년"+currentDateTime.getMonthValue()+"월"+currentDateTime.getDayOfWeek().getValue()+"일";
        time = currentDateTime.getHour()+"시"+currentDateTime.getMinute()+"분";
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

}