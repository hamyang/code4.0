package 运动员和教练案列_优;
//篮球教练类
public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }
    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教如何运球和投篮");
    }
    @Override
    public void eat() {
        System.out.println("篮球教练吃肉");
    }
}