package org.example;

// 행동 인터페이스
interface SoundBehavior {
    void makeSound();
}

// 구체적인 행동 클래스
class BarkSound implements SoundBehavior {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class MeowSound implements SoundBehavior {
    public void makeSound() {
        System.out.println("Meow");
    }
}

// 동물 클래스가 행동을 포함함
class Animal {
    // 인터페이스 멤버 변수를 준 이유는 런타임 시점에서 구현체를 결정함
    private final SoundBehavior soundBehavior;

    // 생성자 주입
    public Animal(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

//    void performSound() {
//        soundBehavior.makeSound();
//    }
}

// 사용 예
public class Main1 {
    public static void main(String[] args) {
        // 실제 객체(Animal)가 생성될 때 매개변수로 구현체 객체(BarkSound)를 주입함
        BarkSound barkSound = new BarkSound();
        MeowSound meowSound = new MeowSound();

        Animal dog = new Animal(barkSound);
        Animal cat = new Animal(meowSound);
        // 인터페이스를 이용한 다형성
//        dog.performSound(); // 출력: Bark
//        cat.performSound(); // 출력: Meow


    }
}
