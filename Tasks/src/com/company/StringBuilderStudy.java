package com.company;

public class StringBuilderStudy {
    public static void main(String[] args) {
        /*
        String x="hello";
        x=x.toUpperCase();// метод, который делает все буквы заглавными
        System.out.println(x);
         */
        StringBuilder sb=new StringBuilder("hello"); //  StringBuilder позволяет изменять строку, не создавая новых классов String. Класс String создаёт объект и изменять его не может.
        System.out.println(sb.toString());
        sb.append(" my").append(" friends");//append позволяет добавлять дополнительные записи к уже созданному объекту класса  StringBuilder.
        System.out.println(sb);
        //System.out.printf(" %f i study %s, %d in month",2.5, "JAVA",2 );//printf позволяет гибко работать с выводом строк. %s обозначает что будет вставлена  строка на это место.
                                                        // "COOL" - строка которая устанавливается вместо %s;
                                                        //%d - вставка цифр; %f-число с плавающей точкой.
        System.out.printf("String %10d \n",523); // %10d - вставляет необходимое число, но после 10 символов, после посленего символа(строки). Выравнивание идёт справа
        System.out.printf("String %10d \n",5555); //    \n - переносит строку
        System.out.printf("String %10d \n" ,667455); // %-10d - выравнивание будет происходить слево.
        System.out.printf("String %10d \n",1000);
        System.out.printf("String %.2f \n",7.24543); // %.2f - настраивает, сколько числе после точки будет выводится. В данном случае два числа.(7.24)
    }
}
