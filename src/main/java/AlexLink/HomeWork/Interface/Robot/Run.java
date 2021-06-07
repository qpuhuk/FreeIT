package AlexLink.HomeWork.Interface.Robot;

import AlexLink.HomeWork.Interface.Robot.Hands.SamsungHand;
import AlexLink.HomeWork.Interface.Robot.Hands.SonyHand;
import AlexLink.HomeWork.Interface.Robot.Hands.ToshibaHand;
import AlexLink.HomeWork.Interface.Robot.Head.SamsungHead;
import AlexLink.HomeWork.Interface.Robot.Head.SonyHead;
import AlexLink.HomeWork.Interface.Robot.Head.ToshibaHead;
import AlexLink.HomeWork.Interface.Robot.Legs.SamsungLeg;
import AlexLink.HomeWork.Interface.Robot.Legs.SonyLeg;
import AlexLink.HomeWork.Interface.Robot.Legs.ToshibaLeg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {
    public static void main(String[] args) {
/*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        List<IRobot> robots = new ArrayList<>();
        robots.add(new Robot(new SamsungHead(800), new SonyHand(250), new SamsungLeg(440)));
        robots.add(new Robot(new ToshibaHead(300), new ToshibaHand(300), new SonyLeg(100)));
        robots.add(new Robot(new SonyHead(700), new SamsungHand(200), new ToshibaLeg(500)));

        robots.forEach(IRobot::action);

        System.out.println("Самый дорогой робот: " + Collections.max(robots, (s1, s2) -> s1.getPrice() - s2.getPrice()).getPrice());
    }
}
