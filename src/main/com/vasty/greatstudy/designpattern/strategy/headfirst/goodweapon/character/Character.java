package com.vasty.greatstudy.designpattern.strategy.headfirst.goodweapon.character;

import com.vasty.greatstudy.designpattern.strategy.headfirst.goodweapon.strategy.IWeapon;

/**
 * 角色
 * Created by ZhuangYanHao on 2016/1/7.
 */
public abstract class Character {

    /**每一个角色都有一个武器*/
    private IWeapon weapon;

    /**
     * 设置武器
     * @param weapon 武器
     */
    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        if (weapon != null) {
            weapon.useWeapon();
        }
    }
}
