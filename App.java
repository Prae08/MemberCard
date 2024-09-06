public class App {
    public static void main(String[] args) throws Exception {
        MemberCard platinumCard = new PlatinumCard("John Wick", 1500);
        System.out.println("Platinum info");
        platinumCard.display();
        System.out.println("*********");
        MemberCard silverCard = new PlatinumCard("John Lenon", 1500);
        System.out.println("Silver info");
        silverCard.display();
    }
}
