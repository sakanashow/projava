package main.java.projava;
import java.util.List;

public class InterFaceSample {
    interface Named {
        String name();
        default String greeting() {
            return "hello %s".formatted(name());
        }
    }
    interface Figure {
        int width();
        int height();
    }
    static class Passenger implements Named {

        @Override
        public String name() {
            return "通りすがり";
        }
    }
    static class Figures implements Figure {

        @Override
        public int width() {
            return 0;
        }

        @Override
        public int height() {
            return 0;
        }
    }
    record Student(String name, int score) implements Named{}
    record Teacher(String name, String subject) implements Named {}
    record Staff(String name, String job) implements Named {}
    record Box(int width, int height) implements Figure {}
    record Oval(int width, int height) implements Figure {}


    public static void main(String[] args) {
        var people = List.of(new Student("kis", 80), new Teacher("hosoya", "Math"), new Passenger(), new Staff("kaho", "jk"));

        for(Named p : people) {
//            var n = p instanceof Student s ? s.name():
//                    p instanceof Teacher t ? t.name():
//                            "---";
            System.out.println("こんにちは%sさん".formatted(p.name()));
            System.out.println(p.greeting());
        }
        var box = List.of(new Box(99, 80), new Oval(10, 30));
        for (Figure b : box) {
//            var n = b instanceof Box s ? s.width():
//                    b instanceof Oval o ? o.width():
//                    "---";
            System.out.println("幅は%dです".formatted(b.width()));
        }
    }
}
