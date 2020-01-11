public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger();

        jaegerOne.setModelName("Striker Eureka");
        jaegerOne.setMark("Mark-6");
        jaegerOne.setOrigin("Australia");
        jaegerOne.setSpeed(10);

        jaegerTwo.setModelName("Cherno Alpha");
        jaegerTwo.setMark("Mark-1");
        jaegerTwo.setOrigin("Russia");
        jaegerTwo.setSpeed(4);

        System.out.println(jaegerOne.getSpeed());
        System.out.println(jaegerTwo.getSpeed());

        System.out.println(jaegerOne.checkStatus());
        System.out.println(jaegerTwo.checkStatus());

        jaegerTwo.setSpeed(2);
        System.out.println(jaegerTwo.getSpeed());
    }
}