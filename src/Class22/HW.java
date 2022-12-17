package src.Class22;

public  abstract class HW {
/*Create a class File that will have the following behaviors: open, edit,
close. Edit and close are implemented method while open is an abstract.
Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
implementation of open behaviour: Example: to open .java file we need notepad++ or sublime text,
to open .doc file we need Microsoft word to be installed etc*/
    void open() {
    }
   void edit() {
    }
    void close() {
    }
}
class JavaFile extends HW {
    void open() {
        System.out.println("to open java file we need notepad");
    }
    @Override
    void edit() {
        System.out.println("To edit java file we need notepad");
    }
    @Override
    void close() {
        System.out.println("To edit java file we need notepad");
    }
}
    class WordFile extends HW {
        @Override
        void open() {
            System.out.println("to open word file we need Microsoft word");
        }
        @Override
        void edit() {
            System.out.println("To edit word file we need Microsoft word");
        }
        @Override
        void close() {
            System.out.println("To edit word file we need Microsoft word");
        }
    }
    class PdfFile extends HW {

        @Override
        void open() {
            System.out.println("to open word file we need Adobe Acrobat");
        }
        @Override
        void edit() {
            System.out.println("To edit word file we need Adobe Acrobat");
        }
        @Override
        void close() {
            System.out.println("To edit word file we need Adobe Acrobat");
        }
    }


