package com.vasty.greatstudy.designpattern.state.headfirst.candy.bad;

/**
 * 糖果机
 * Created by ZhuangYanHao on 2016/1/26.
 */
class CandyMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;      //一开始的状态，并没有装入糖果
    int candyNum = 0;

    public CandyMachine(int candyNum) {
        this.candyNum = candyNum;
        if (candyNum > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * 顾客投入钱
     */
    public void insertQuarter() {
        if (state == SOLD_OUT) {
            System.out.println("candy had sold out");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("you successfully insert a quarter");
        } else if (state == HAS_QUARTER) {
            System.out.println("already has quarter");
        } else if (state == SOLD) {
            System.out.println("you already buy one, please wait");
        }
    }

    /**
     * 顾客想要退出钱
     */
    public void ejectQuarter() {
        if (state == SOLD_OUT) {
            System.out.println("candy had sold out");
        } else if (state == NO_QUARTER) {
            System.out.println("there is no quarter");
        } else if (state == HAS_QUARTER) {
            state = NO_QUARTER;
            System.out.println("you get your quarter back");
        } else if (state == SOLD) {
            System.out.println("too late, you already turnCrank");
        }
    }

    /**
     * 顾客按下摇杆，要糖果机出糖果
     */
    public void turnCrank() {
        if (state == SOLD_OUT) {
            System.out.println("candy had sold out");
        } else if (state == NO_QUARTER) {
            System.out.println("please insert quarter");
        } else if (state == HAS_QUARTER) {
            state = SOLD;
            System.out.println("solding candy for you now");
            dipense();
        } else if (state == SOLD) {
            System.out.println("wait, already prepare a candy for you");
        }
    }

    /**
     * 糖果机为顾客出糖果。
     */
    public void dipense() {
        if (state == SOLD) {
            candyNum--;
            if (candyNum <= 0) {
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
            System.out.println("you can pick up your candy now");
        } else {
            System.out.println("should not dipense when not in SOLD state");
        }
    }

    public String toString() {
        return "state is " + state + "; candyNum is " + candyNum;
    }

    /**
     * 补充糖果 (FIXME 实现)
     * @param candyNum 糖果的数量
     */
    public void addCandy(int candyNum) {

    }
}
