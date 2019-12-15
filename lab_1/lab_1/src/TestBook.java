import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Мцыри", "Лермонтов", 56, "поэма");
        Book b2 = new Book("Темная башня", "Кинг", 21589, "Проза");

        b2.setPagesCount(100000);

        System.out.println(b1);
        System.out.println(b2);
    }
}