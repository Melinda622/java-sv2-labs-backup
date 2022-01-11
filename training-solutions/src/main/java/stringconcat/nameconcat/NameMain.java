package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        Title title = Title.MR;
        Name name = new Name("Kiss", "Balazs", "Peter", title);
        System.out.println(name.concatNameHungarianStyle());
        System.out.println(name.concatNameWesternStyle("Kennedy", "Fitzgerald ", "Kennedy"));
    }
}
