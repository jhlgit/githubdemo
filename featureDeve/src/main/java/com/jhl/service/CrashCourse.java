package com.jhl.service;

import com.jhl.base.BaseDeve;
import com.jhl.base.LogWriter;
import com.jhl.entity.pojo.*;
import com.jhl.utils.commonTmpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

/**
 * @Description mysql应知应会数据库
 * @Author jhl
 * @Date 2020/12/27 14:46
 * @Version 1.0
 */
@Component("crashCourse6")
public class CrashCourse extends BaseDeve {
    /**
     * @Description 随机生成数据，
     * @Author jhl
     * @Date 2020/12/28 19:47
     * @Version 1.0
     */
    private static final int VENDOR_NO = 1000;
    private static final int PRODUCT_NO = 10000;
    private static final int CUSTOMER_NO = 1250400;
    private static final int ORDER_NO = 200000;

    private static final String ID_TYPE_1 = "1";

    @Autowired
    VendorsMapper vendorsMapper;
    @Autowired
    ProductsMapper productsMapper;
    @Resource(type = ProductnotesMapper.class)
    ProductnotesMapper productnotesMapper;

    @Resource(type = CustomersMapper.class)
    CustomersMapper customersMapper;
    @Resource(type = OrdersMapper.class)
    OrdersMapper ordersMapper;
    @Resource(type = OrderitemsMapper.class)
    OrderitemsMapper orderitemsMapper;

    /**
     * @Description 生成数据填充表
     * @Author jhl
     * @Date 2020/12/28 21:15
     * @Version 1.0
     */
    public void noTxGenertatisonData() throws Exception{

        Random random = new Random();
        //1.供应商
        try {
            noTxGenVendor();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //2.产品
        ProductsExample productsExample = new ProductsExample();
        try {
            noTxGetProducts(random, productsExample);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //3.客户
        try {
            noTxGenCustomer(random);
            int a=5/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }

        Map<String, String> priceMap = new HashMap();
        try {
            this.productPrice(priceMap, productsExample);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //4订单
        try {
            noTxGenOrder(random, priceMap);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void noTxGenOrder(Random random, Map<String, String> priceMap) {
        OrdersExample ordersExample = new OrdersExample();
        Orders orders = new Orders();
        Orderitems orderitems = new Orderitems();
        long ordersCount = ordersMapper.countByExample(ordersExample);
        StringBuffer sb = new StringBuffer();
        int count = 0;
        if (ordersCount < ORDER_NO) {
            for (int i = (int) ordersCount; i <= ORDER_NO; i++) {
                noTxGenOneOrder(priceMap,1);
                count++;
                LogWriter.info(this.getClass(),"4订单：" + i);
            }
            logger.info("订单生成完成:" + count);
        }
    }

    private void noTxGenCustomer(Random random) {
        CustomersExample customersExample = new CustomersExample();
        Customers customers = new Customers();
        int count = 0;
        long customersCount = customersMapper.countByExample(customersExample);
        if (customersCount < CUSTOMER_NO) {
            for (int i = (int) ++customersCount; i <= CUSTOMER_NO; i++) {
                Date date = new Date();
                customers.setCustId(i);
                Customers customers1 = customersMapper.selectByPrimaryKey(i);
                if (customers1 != null) {
                    continue;
                }
                customers.setCustName(commonTmpUtils.genName());
                customers.setCustAddress(null);
                customers.setCustCity(null);
                customers.setCustState(null);
                customers.setCustZip(commonTmpUtils.genRadomNumber(6));
                customers.setCustCountry(null);
                customers.setCustContact(commonTmpUtils.genName());
                customers.setCustEmail(null);
                customers.setCustAge(random.nextInt(100));
                customers.setCustMobile("1" + commonTmpUtils.genRadomNumber(10));
                customers.setCustIdType(ID_TYPE_1);
                customers.setCustIdNo(commonTmpUtils.genRadomNumber(18));
                customers.setCreateTime(date);
                customers.setUpdateTime(date);
                customersMapper.insert(customers);
                count++;
                logger.info("3.客户：" + i);
            }
        }
        logger.info("客户生成完成:" + count);
    }

    private void noTxGetProducts(Random random, ProductsExample productsExample) {

        Products products = new Products();
        long productCount = productsMapper.countByExample(productsExample);
        int count = 0;
        if (productCount < PRODUCT_NO) {
            for (int i = (int) productCount; i <= PRODUCT_NO; i++) {
                Date date = new Date();
                products.setProdId(String.valueOf(i));
                Products products1 = productsMapper.selectByPrimaryKey(String.valueOf(i));
                if (null != products1) {
                    continue;
                }
                products.setVendId(random.nextInt(VENDOR_NO));
                products.setProdName("产品" + random.nextInt(VENDOR_NO));
                products.setProdDesc("产品描述" + commonTmpUtils.genChineseCharacter());
                BigDecimal prodPrice = BigDecimal.ZERO;
                while (BigDecimal.ZERO.equals(prodPrice)) {
                    prodPrice = new BigDecimal(random.nextDouble() * (random.nextInt(100)));
                }
                products.setProdPrice(prodPrice.setScale(2, BigDecimal.ROUND_HALF_UP));
                products.setCreateTime(date);
                products.setUpdateTime(date);
                productsMapper.insert(products);
                Productnotes productnotes = new Productnotes();
                productnotes.setNoteId(i);
                Productnotes productnotes1 = productnotesMapper.selectByPrimaryKey(i);
                if (null == productnotes1) {

                    productnotes.setProdId(products.getProdId());
                    productnotes.setNoteText("NoteText" + i);
                    productnotes.setNoteDate(date);
                    productnotesMapper.insert(productnotes);
                }
                logger.info("2.产品：" + i);
                count++;
            }
        }
        logger.info("产品生成完成:" + count);
    }

    private void noTxGenVendor() {
        VendorsExample example = new VendorsExample();
        Vendors vendors = new Vendors();
        String randomStr = "";
        long vendorsCount = vendorsMapper.countByExample(example);
        int count = 0;
        if (vendorsCount <= VENDOR_NO) {
            for (int i = (int) vendorsCount; i <= VENDOR_NO; i++) {
                Date date = new Date();
                randomStr = commonTmpUtils.genChineseCharacter();
                vendors.setVendId(i);
                Vendors vendors1 = vendorsMapper.selectByPrimaryKey(i);
                if (vendors1 != null) {
                    continue;
                }
                vendors.setVendName(randomStr + "有限公司");
                vendors.setVendAddress(randomStr + "地址");
                vendors.setVendCity(randomStr + "市");
                vendors.setVendState(randomStr + "省");
                vendors.setVendZip(commonTmpUtils.genRadomNumber(6));
                vendors.setVendCountry("中国");
                vendors.setCreateTime(date);
                vendors.setUpdateTime(date);
                vendorsMapper.insert(vendors);
                count++;
            }
        }
        logger.info("供应商生成完成:" + count);
    }

    /**
     * @Description Map缓存产品id和price
     * @Author jhl
     * @Date 2021/1/1 17:20
     * @Version 1.0
     */
    public void productPrice(Map<String, String> map, ProductsExample example) {
        List<Products> productsList = productsMapper.selectByExample(example);
        for (Products products : productsList) {
            map.put(products.getProdId(), String.valueOf(products.getProdPrice()));
        }
    }

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(5).multiply(new BigDecimal("15.5"));
        System.out.println(a);
    }

    /**
     * @Description 生成一个订单信息
     * @Author jhl
     * @Date 2022/2/7 21:03
     * @Version 1.0
     */
    public void noTxGenOneOrder(Map<String, String> priceMap,int orderCount) {
        Random random = new Random();
        Orders orders = new Orders();
        Orderitems orderitems = new Orderitems();
        long ordersCount = ordersMapper.selectMaxOrderNum();
        StringBuffer sb = new StringBuffer();
        int count = 0;
            for (int i = 1; i <= orderCount; i++) {
                Date date = new Date();
                int orderNum=(int)ordersCount +i;
                orders.setOrderNum( orderNum);
                Orders orders1 = ordersMapper.selectByPrimaryKey(orderNum);
                if (orders1 != null) {
                    continue;
                }
                orders.setOrderDate(date);
                orders.setCustId(random.nextInt(CUSTOMER_NO));
                ordersMapper.insert(orders);
                int itemNo = random.nextInt(5);
                for (int j = 0; j < itemNo; j++) {
                    orderitems.setOrderNum(orderNum);
                    orderitems.setOrderItem(j);
                    Orderitems orderitems1 = orderitemsMapper.selectByPrimaryKey(orderitems);
                    if (orderitems1 != null) {
                        continue;
                    }

                    String prodId = commonTmpUtils.getMapRandomKey(priceMap);
                    orderitems.setProdId(prodId);
                    int quantity = random.nextInt(5);
                    orderitems.setQuantity(quantity);
                    BigDecimal itemPrice = new BigDecimal(quantity).multiply(new BigDecimal(priceMap.get(prodId)));
                    orderitems.setItemPrice(itemPrice);

                    sb.append(commonTmpUtils.genChineseCharacter());
                    if (sb.toString().length() > 2000) {
                        sb.setLength(0);
                    }
                    orderitems.setRemark(sb.toString());
                    orderitemsMapper.insert(orderitems);
                }
                count++;
                LogWriter.info(this.getClass(),"4订单号：" + orderNum);
            }
            logger.info("订单生成完成，生成个数为:" + count);
    }
}
