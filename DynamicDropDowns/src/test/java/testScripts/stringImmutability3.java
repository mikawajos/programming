package testScripts;

public class stringImmutability3 {

        private int id;
        private String title;
    stringImmutability3(int id) {
            this.id = id;
        }
        public String getTitle() {
            return this.title;
        }
        public String setTitle(String text) {
            return text  = this.title;
        }
        @Override
        public String toString() {
            return String.format("doc #%d about '%s'", this.id/*, text*/);
        }

    public static void main(String[] args) {
        stringImmutability3 first = new stringImmutability3(50);
        first.setTitle("How to grill a sandwich");
        stringImmutability3 second = new stringImmutability3(50);
        second.setTitle("How to grill a sandwich");
        if (first.equals(second)) { // FALSE
            System.out.println(
                    String.format("%s is equal to %s", first, second)
            );
        }
    }
    }
