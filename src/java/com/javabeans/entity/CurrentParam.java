/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabeans.entity;

/**
 *触摸屏上的环境参数
 *
 * @author lenovo
 */
public class CurrentParam {

    private float InnerWendu;//室内温度
    private float InnerShidu;//室内湿度
    private float InnerGuangzhao;//室内光照
    private float InnerFengsu;//室内风速
    private float OuterWendu;//室外温度
    private float OuterShidu;//室外湿度
    private float OuterGuangzhao;//室外光照
    private float OuterFengsu;//室外风速
    private float InnerWendu_2;//9
    private float InnerShidu_2;
    private float InnerGuangzhao_2;
    private float yaLi;
    private float yaLi_2;
    private float floatNum2_5;
    private float floatNum2_6;
    private float floatNum2_7;
    private float floatNum2_8;
    private float floatNum2_9;//9
    private float floatNum3_1;
    private float floatNum3_2;
    private float floatNum3_3;
    private float floatNum3_4;
    private float floatNum3_5;
    private float floatNum3_6;
    private float floatNum3_7;
    private float floatNum3_8;
    private float floatNum3_9;
    private float floatNum4_1;
    private float floatNum4_2;
    private float floatNum4_3;
    private float floatNum4_4;
    private float floatNum4_5;
    private float floatNum4_6;
    private float floatNum4_7;
    private float floatNum4_8;
    private float floatNum4_9;
    private float floatNum5_1;
    private float floatNum5_2;
    private float floatNum5_3;
    private float floatNum5_4;
    private float floatNum5_5;
    private float floatNum5_6;
    private float floatNum5_7;
    private float floatNum5_8;
    private float floatNum5_9;

    public CurrentParam(float InnerWendu, float InnerShidu, float InnerGuangzhao, float InnerFengsu, float OuterWendu, float OuterShidu,
            float OuterGuangzhao, float OuterFengsu) {
        this.InnerWendu = InnerWendu;
        this.InnerShidu = InnerShidu;
        this.InnerGuangzhao = InnerGuangzhao;
        this.InnerFengsu = InnerFengsu;
        this.OuterWendu = OuterWendu;
        this.OuterShidu = OuterShidu;
        this.OuterGuangzhao = OuterGuangzhao;
        this.OuterFengsu = OuterFengsu;
    }

    public CurrentParam() {
    }

    public CurrentParam(float InnerWendu, float InnerShidu, float InnerGuangzhao, float InnerFengsu, float OuterWendu, float OuterShidu,
            float OuterGuangzhao, float OuterFengsu, float InnerWendu_2, float InnerShidu_2, float InnerGuangzhao_2, float yaLi, float yaLi_2,
            float floatNum2_5, float floatNum2_6, float floatNum2_7, float floatNum2_8, float floatNum2_9, float floatNum3_1, float floatNum3_2,
            float floatNum3_3, float floatNum3_4, float floatNum3_5, float floatNum3_6, float floatNum3_7, float floatNum3_8, float floatNum3_9,
            float floatNum4_1, float floatNum4_2, float floatNum4_3, float floatNum4_4, float floatNum4_5, float floatNum4_6, float floatNum4_7,
            float floatNum4_8, float floatNum4_9, float floatNum5_1, float floatNum5_2, float floatNum5_3, float floatNum5_4, float floatNum5_5,
            float floatNum5_6, float floatNum5_7, float floatNum5_8, float floatNum5_9) {
        this.InnerWendu = InnerWendu;
        this.InnerShidu = InnerShidu;
        this.InnerGuangzhao = InnerGuangzhao;
        this.InnerFengsu = InnerFengsu;
        this.OuterWendu = OuterWendu;
        this.OuterShidu = OuterShidu;
        this.OuterGuangzhao = OuterGuangzhao;
        this.OuterFengsu = OuterFengsu;
        this.InnerWendu_2 = InnerWendu_2;
        this.InnerShidu_2 = InnerShidu_2;
        this.InnerGuangzhao_2 = InnerGuangzhao_2;
        this.yaLi = yaLi;
        this.yaLi_2 = yaLi_2;
        this.floatNum2_5 = floatNum2_5;
        this.floatNum2_6 = floatNum2_6;
        this.floatNum2_7 = floatNum2_7;
        this.floatNum2_8 = floatNum2_8;
        this.floatNum2_9 = floatNum2_9;
        this.floatNum3_1 = floatNum3_1;
        this.floatNum3_2 = floatNum3_2;
        this.floatNum3_3 = floatNum3_3;
        this.floatNum3_4 = floatNum3_4;
        this.floatNum3_5 = floatNum3_5;
        this.floatNum3_6 = floatNum3_6;
        this.floatNum3_7 = floatNum3_7;
        this.floatNum3_8 = floatNum3_8;
        this.floatNum3_9 = floatNum3_9;
        this.floatNum4_1 = floatNum4_1;
        this.floatNum4_2 = floatNum4_2;
        this.floatNum4_3 = floatNum4_3;
        this.floatNum4_4 = floatNum4_4;
        this.floatNum4_5 = floatNum4_5;
        this.floatNum4_6 = floatNum4_6;
        this.floatNum4_7 = floatNum4_7;
        this.floatNum4_8 = floatNum4_8;
        this.floatNum4_9 = floatNum4_9;
        this.floatNum5_1 = floatNum5_1;
        this.floatNum5_2 = floatNum5_2;
        this.floatNum5_3 = floatNum5_3;
        this.floatNum5_4 = floatNum5_4;
        this.floatNum5_5 = floatNum5_5;
        this.floatNum5_6 = floatNum5_6;
        this.floatNum5_7 = floatNum5_7;
        this.floatNum5_8 = floatNum5_8;
        this.floatNum5_9 = floatNum5_9;
    }

    public float getInnerFengsu() {
        return InnerFengsu;
    }

    public void setInnerFengsu(float InnerFengsu) {
        this.InnerFengsu = InnerFengsu;
    }

    public float getInnerGuangzhao() {
        return InnerGuangzhao;
    }

    public void setInnerGuangzhao(float InnerGuangzhao) {
        this.InnerGuangzhao = InnerGuangzhao;
    }

    public float getInnerGuangzhao_2() {
        return InnerGuangzhao_2;
    }

    public void setInnerGuangzhao_2(float InnerGuangzhao_2) {
        this.InnerGuangzhao_2 = InnerGuangzhao_2;
    }

    public float getInnerShidu() {
        return InnerShidu;
    }

    public void setInnerShidu(float InnerShidu) {
        this.InnerShidu = InnerShidu;
    }

    public float getInnerShidu_2() {
        return InnerShidu_2;
    }

    public void setInnerShidu_2(float InnerShidu_2) {
        this.InnerShidu_2 = InnerShidu_2;
    }

    public float getInnerWendu() {
        return InnerWendu;
    }

    public void setInnerWendu(float InnerWendu) {
        this.InnerWendu = InnerWendu;
    }

    public float getInnerWendu_2() {
        return InnerWendu_2;
    }

    public void setInnerWendu_2(float InnerWendu_2) {
        this.InnerWendu_2 = InnerWendu_2;
    }

    public float getOuterFengsu() {
        return OuterFengsu;
    }

    public void setOuterFengsu(float OuterFengsu) {
        this.OuterFengsu = OuterFengsu;
    }

    public float getOuterGuangzhao() {
        return OuterGuangzhao;
    }

    public void setOuterGuangzhao(float OuterGuangzhao) {
        this.OuterGuangzhao = OuterGuangzhao;
    }

    public float getOuterShidu() {
        return OuterShidu;
    }

    public void setOuterShidu(float OuterShidu) {
        this.OuterShidu = OuterShidu;
    }

    public float getOuterWendu() {
        return OuterWendu;
    }

    public void setOuterWendu(float OuterWendu) {
        this.OuterWendu = OuterWendu;
    }

    public float getFloatNum2_5() {
        return floatNum2_5;
    }

    public void setFloatNum2_5(float floatNum2_5) {
        this.floatNum2_5 = floatNum2_5;
    }

    public float getFloatNum2_6() {
        return floatNum2_6;
    }

    public void setFloatNum2_6(float floatNum2_6) {
        this.floatNum2_6 = floatNum2_6;
    }

    public float getFloatNum2_7() {
        return floatNum2_7;
    }

    public void setFloatNum2_7(float floatNum2_7) {
        this.floatNum2_7 = floatNum2_7;
    }

    public float getFloatNum2_8() {
        return floatNum2_8;
    }

    public void setFloatNum2_8(float floatNum2_8) {
        this.floatNum2_8 = floatNum2_8;
    }

    public float getFloatNum2_9() {
        return floatNum2_9;
    }

    public void setFloatNum2_9(float floatNum2_9) {
        this.floatNum2_9 = floatNum2_9;
    }

    public float getFloatNum3_1() {
        return floatNum3_1;
    }

    public void setFloatNum3_1(float floatNum3_1) {
        this.floatNum3_1 = floatNum3_1;
    }

    public float getFloatNum3_2() {
        return floatNum3_2;
    }

    public void setFloatNum3_2(float floatNum3_2) {
        this.floatNum3_2 = floatNum3_2;
    }

    public float getFloatNum3_3() {
        return floatNum3_3;
    }

    public void setFloatNum3_3(float floatNum3_3) {
        this.floatNum3_3 = floatNum3_3;
    }

    public float getFloatNum3_4() {
        return floatNum3_4;
    }

    public void setFloatNum3_4(float floatNum3_4) {
        this.floatNum3_4 = floatNum3_4;
    }

    public float getFloatNum3_5() {
        return floatNum3_5;
    }

    public void setFloatNum3_5(float floatNum3_5) {
        this.floatNum3_5 = floatNum3_5;
    }

    public float getFloatNum3_6() {
        return floatNum3_6;
    }

    public void setFloatNum3_6(float floatNum3_6) {
        this.floatNum3_6 = floatNum3_6;
    }

    public float getFloatNum3_7() {
        return floatNum3_7;
    }

    public void setFloatNum3_7(float floatNum3_7) {
        this.floatNum3_7 = floatNum3_7;
    }

    public float getFloatNum3_8() {
        return floatNum3_8;
    }

    public void setFloatNum3_8(float floatNum3_8) {
        this.floatNum3_8 = floatNum3_8;
    }

    public float getFloatNum3_9() {
        return floatNum3_9;
    }

    public void setFloatNum3_9(float floatNum3_9) {
        this.floatNum3_9 = floatNum3_9;
    }

    public float getFloatNum4_1() {
        return floatNum4_1;
    }

    public void setFloatNum4_1(float floatNum4_1) {
        this.floatNum4_1 = floatNum4_1;
    }

    public float getFloatNum4_2() {
        return floatNum4_2;
    }

    public void setFloatNum4_2(float floatNum4_2) {
        this.floatNum4_2 = floatNum4_2;
    }

    public float getFloatNum4_3() {
        return floatNum4_3;
    }

    public void setFloatNum4_3(float floatNum4_3) {
        this.floatNum4_3 = floatNum4_3;
    }

    public float getFloatNum4_4() {
        return floatNum4_4;
    }

    public void setFloatNum4_4(float floatNum4_4) {
        this.floatNum4_4 = floatNum4_4;
    }

    public float getFloatNum4_5() {
        return floatNum4_5;
    }

    public void setFloatNum4_5(float floatNum4_5) {
        this.floatNum4_5 = floatNum4_5;
    }

    public float getFloatNum4_6() {
        return floatNum4_6;
    }

    public void setFloatNum4_6(float floatNum4_6) {
        this.floatNum4_6 = floatNum4_6;
    }

    public float getFloatNum4_7() {
        return floatNum4_7;
    }

    public void setFloatNum4_7(float floatNum4_7) {
        this.floatNum4_7 = floatNum4_7;
    }

    public float getFloatNum4_8() {
        return floatNum4_8;
    }

    public void setFloatNum4_8(float floatNum4_8) {
        this.floatNum4_8 = floatNum4_8;
    }

    public float getFloatNum4_9() {
        return floatNum4_9;
    }

    public void setFloatNum4_9(float floatNum4_9) {
        this.floatNum4_9 = floatNum4_9;
    }

    public float getFloatNum5_1() {
        return floatNum5_1;
    }

    public void setFloatNum5_1(float floatNum5_1) {
        this.floatNum5_1 = floatNum5_1;
    }

    public float getFloatNum5_2() {
        return floatNum5_2;
    }

    public void setFloatNum5_2(float floatNum5_2) {
        this.floatNum5_2 = floatNum5_2;
    }

    public float getFloatNum5_3() {
        return floatNum5_3;
    }

    public void setFloatNum5_3(float floatNum5_3) {
        this.floatNum5_3 = floatNum5_3;
    }

    public float getFloatNum5_4() {
        return floatNum5_4;
    }

    public void setFloatNum5_4(float floatNum5_4) {
        this.floatNum5_4 = floatNum5_4;
    }

    public float getFloatNum5_5() {
        return floatNum5_5;
    }

    public void setFloatNum5_5(float floatNum5_5) {
        this.floatNum5_5 = floatNum5_5;
    }

    public float getFloatNum5_6() {
        return floatNum5_6;
    }

    public void setFloatNum5_6(float floatNum5_6) {
        this.floatNum5_6 = floatNum5_6;
    }

    public float getFloatNum5_7() {
        return floatNum5_7;
    }

    public void setFloatNum5_7(float floatNum5_7) {
        this.floatNum5_7 = floatNum5_7;
    }

    public float getFloatNum5_8() {
        return floatNum5_8;
    }

    public void setFloatNum5_8(float floatNum5_8) {
        this.floatNum5_8 = floatNum5_8;
    }

    public float getFloatNum5_9() {
        return floatNum5_9;
    }

    public void setFloatNum5_9(float floatNum5_9) {
        this.floatNum5_9 = floatNum5_9;
    }

    public float getYaLi() {
        return yaLi;
    }

    public void setYaLi(float yaLi) {
        this.yaLi = yaLi;
    }

    public float getYaLi_2() {
        return yaLi_2;
    }

    public void setYaLi_2(float yaLi_2) {
        this.yaLi_2 = yaLi_2;
    }
}
