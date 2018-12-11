package com.dp.section2;

public class Client {
    public static void main(String[] args) {
        System.out.println("--------房地产公司是这样运行的--------");
        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();

        // 服装厂不赚钱，不卖了，卖IPod，注释掉
//        System.out.println("--------服装公司是这样运行的--------");
//        ClothesCorp clothesCorp = new ClothesCorp();
//        clothesCorp.makeMoney();
        System.out.println("--------IPod公司是这样运行的--------");
        IPodCorp iPodCorp = new IPodCorp();
        iPodCorp.makeMoney();
        // 但是，每次更换产品就重新建立一家公司，有点太傻了。所以，要把公司和产品进行解耦。
        // 请看section3
    }
}
