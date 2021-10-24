/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factory.example02;

/**
 *
 * @author Madhusha Prasad
 */
public class BOFactory {
    private static BOFactory bOFactory;

    private BOFactory() {
    }

    //apply singleton design pattern
    public static BOFactory getInstance() {
        if (bOFactory == null) {
            bOFactory = new BOFactory();
        }
        return bOFactory;
    }

    //use Enum for Types
    public enum BOType {
        LOGIN, USER, CUSTOMER, VOLUME, ITEM, ORDERS, ORDERDETAILS, STOCK,
        ITEM_BATCH, PURCHASE;
    }

//    public SuperBO getBOType(BOType types) {
//        switch (types) {
//            case LOGIN:
//                return new LoginBOImpl();
//            case CUSTOMER:
//                return new CustomerBOImpl();
//            case STOCK:
//                return new StockBOImpl();
//            case ITEM_BATCH:
//                return new ItemBatchBOImpl();
//            case ITEM:
//                return new ItemBOImpl();
//            case VOLUME:
//                return new VolumeBOImpl();
//            case PURCHASE:
//                return new PurchaseBOImpl();
//            case USER:
//                return new UserBOImpl();
//            default:
//                return null;
//        }
//    }
}
