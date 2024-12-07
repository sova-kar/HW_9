public class Main {
    public static void main(String[] args) {
        Author korelli = new Author("Мария", "Корелли");
        Author remark = new Author("Эрих Мария", "Ремарк");

        Book theSorrows = new Book("Скорбь Сатаны", korelli,1895);
        Book theSorrows2 = new Book("Скорбь Сатаны", korelli,1895);
        Book arcDeTriomphe = new Book("Триумфальная арка", remark,1939);

        System.out.println(theSorrows);
        System.out.println(arcDeTriomphe);

//        System.out.println(theSorrows.getTitle()+ " " + korelli.getFirstName()+ " " + korelli.getSecondName()+ " " + theSorrows.getPublishingYear());
//        System.out.println(arcDeTriomphe.getTitle()+ " " + remark.getFirstName()+ " " + remark.getSecondName()+ " " + arcDeTriomphe.getPublishingYear());

        System.out.println("Сравнение theSorrows " + theSorrows.equals(theSorrows2));

        theSorrows.setPublishingYear(2024);
        System.out.println(theSorrows);

//        System.out.println(theSorrows.getTitle() + " " + korelli.getFirstName()+ " " + korelli.getSecondName() + " " + theSorrows.getPublishingYear());

        System.out.println("Сравнение theSorrows " + theSorrows.equals(theSorrows2));


    }
}