package com.csl.visitor;

/**
 * 模拟指挥官手下有两名中士，每名中士手下有两名士兵的层次结构
 * 使用不同访问器对其进行访问
 *
 * @author MaoLongLong
 * @date 2021-04-28 20:01
 */
public class App {

    public static void main(String[] args) {
        Commander commander = new Commander(
            new Sergeant(new Soldier(), new Soldier(), new Soldier()),
            new Sergeant(new Soldier(), new Soldier(), new Soldier())
        );
        commander.accept(new SoldierVisitor());
        commander.accept(new SergeantVisitor());
        commander.accept(new CommanderVisitor());
    }
}
