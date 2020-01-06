public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setSex('M');
        wolf.setNickName("Fluffy");
        wolf.setWeight(4.3f);
        wolf.setAge(4);
        wolf.setColor("grey");

        System.out.println("sex: " + wolf.getSex());
        System.out.println("nickName: " + wolf.getNickName());
        System.out.println("weight: " + wolf.getWeight());
        System.out.println("age: " + wolf.getAge());
        System.out.println("color: " + wolf.getColor());

        wolf.go();
        wolf.seat();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}