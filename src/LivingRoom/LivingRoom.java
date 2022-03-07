package LivingRoom;

public class LivingRoom {
    public static void main(String[] args) {
        Book orwell1984 = new Book("George Orwell","1984", 328);
        Book annaKarenina = new Book("Leo Tolstoy", "Anna Karenina", 1300);
        BookCase regal = new BookCase(5,"Manga", new Book[]{orwell1984, annaKarenina});

        regal.store();

    }

}
