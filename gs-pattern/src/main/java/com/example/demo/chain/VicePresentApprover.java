package com.example.demo.chain;


/**
 * 功能描述
 *
 * @author TomLuo
 * @date 2019/10/31
 */
public class VicePresentApprover extends Approver {


    public VicePresentApprover(String name) {
        super(name + "副总裁");
    }

    @Override
    protected void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getTotal() >= 10000f && purchaseRequest.getTotal() < 20000f) {
            System.out.println(this.name + "批准" + purchaseRequest.getName() + "的价格为：" + purchaseRequest.getPrice() + " 采购数量为：" + purchaseRequest.getNum() + " 总计：" + purchaseRequest.getTotal());
        } else {
            successor.processRequest(purchaseRequest);
        }
    }
}
