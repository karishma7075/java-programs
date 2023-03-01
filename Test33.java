import java.util.Scanner;

class MyDate {
    private int day;
    private int month;
    private int year;

    public int get_day() {
        return day;
    }

    public void set_day(int d) {
        day = d;
    }

    public int get_month() {
        return month;
    }

    public void set_month(int m) {
        month = m;
    }

    public int get_year() {
        return year;
    }

    public void set_year(int y) {
        year = y;
    }
}

class Test33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day, month, year;

        System.out.println("Enter the day number");
        day = scanner.nextInt();

        System.out.println("Enter the month number");
        month = scanner.nextInt();

        System.out.println("Enter the year number");
        year = scanner.nextInt();

        MyDate date = new MyDate();
        date.set_day(day);
        date.set_month(month);
        date.set_year(year);

        System.out.println(date.get_day() + "-" + date.get_month() + "-" + date.get_year());
    }
}