//https://www.youtube.com/watch?v=3fMfyrTITGs&list=PLlglyqJETQQ2weNGbwHbrjAeWA6ybt8wQ&index=100
package ProductDemo;

import javax.swing.*;

public class ProductBiz {

    public static void main(String[] args) {
        //用来保存每种商品的总量
        int[] counts = new int[3];

        double total = 0;          //最终要支付的总金额

        //解决对象被回收的现象，改进方案：使用对象数组
        Product[] products = new Product[3];

        for(int i = 0; i < counts.length; i++){
            //Product product = new Product();   新创建了对象，而且只是一个局部变量。将会被回收
            if (products[i] == null)
                products[i] = new Product();    //对象数组中的元素使用之前，一定要记得分配空间

            String name = JOptionPane.showInputDialog("请输入商品名称：");
            products[i].setName(name);

            //接受用户输入的商品单价，返回值是string
            String strPrice = JOptionPane.showInputDialog("请输入商品单价：");

            //需要将字符串类型转换成 double 类型， 再进行赋值
            //但假如用户输入abc，而非数字的话，就会报错。因为是无法把abc直接转换成double或int类型
            products[i].setPrice(Double.parseDouble(strPrice));

            String strCount = JOptionPane.showInputDialog("请输入购买的数量：");
            counts[i] = Integer.parseInt(strCount);

            //累加总金额
            total += products[i].getPrice() * counts[i];
        }
        System.out.println("购物结算： ");
        for (int i = 0; i < counts.length; i++){
            System.out.println(products[i].getName() + "\t" + products[i].getPrice());
        }
        System.out.println("商品总金额为： " + total);
    }
}
