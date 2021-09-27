package ru.gnome.exercises.chapter3.Books;

public class BooksTestDrive {
    public static void main(String[] args) {
        Books [] myBooks = new Books[3];
        int x = 0;

        myBooks[0]= new Books();
        myBooks[1]= new Books();
        myBooks[2]= new Books();

        myBooks[0].title = "Плоды JAVA";
        myBooks[1].title = "JAVA Гэтсби";
        myBooks[2].title = "Сборник рецептов по JAVA";

        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";

        while (x<3){
            System.out.print(myBooks[x].title+ ", автор "+ myBooks[x].author);
            System.out.println();
            x= x+1;
        }
    }
}
