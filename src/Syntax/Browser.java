package src.Syntax;

public class Browser {

    void openBrowser() {
        System.out.println("oppning");
    }

    void navigate() {
        System.out.println("oppning URL");
    }

    void test() {
        System.out.println("testing the webpage");
    }

    void closeBrowser() {
        System.out.println("oppning");
    }

}
    class Chrome extends Browser {

        void openBrowser() {
            System.out.println("oppning the browser in less than 1 sec");
        }

        class FireFox extends Browser {
            void openBrowser() {
                System.out.println("oppning the browser in less than 3 sec");
            }

        }
    }



