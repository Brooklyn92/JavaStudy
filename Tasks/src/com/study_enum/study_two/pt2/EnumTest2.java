package com.study_enum.study_two.pt2;

public class EnumTest2 {
    public static void main(String[] args) {
        Book book1 = new Book("Arcane", Type.PHANTASY);
        System.out.println(book1.name + " " + book1.bookType);

        //=====================Метод перечислений констант========================
        Type[] types = Type.values(); // создаётся массив перечислений
        for(Type s:types){
            System.out.println(s);
        }
        System.out.println(Type.PHANTASY.ordinal());// ordinal() возвращает индекс определённой константы
    }
}