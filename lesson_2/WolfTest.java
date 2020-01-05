public class WolfTest {

	public static void main(String[] args) {
		Wolf wolf = new Wolf();

		wolf.sex = 'M';
		wolf.nickName = "Fluffy";
		wolf.weight =  4.3f;
		wolf.age = 5;
		wolf.color = "grey";

		System.out.println("sex: " + wolf.sex);
		System.out.println("nickName: " + wolf.nickName);
		System.out.println("weight: " + wolf.weight);
		System.out.println("age: " + wolf.age);
		System.out.println("color: " + wolf.color);

		wolf.go();
		wolf.seat();
		wolf.run();
		wolf.howl();
		wolf.hunt();
	}
}