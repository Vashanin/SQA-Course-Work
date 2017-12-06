package blackBox;

import order.Order;
import order.OrderItem;
import order.ProductType;
import order.ShipmentType;
import org.jetbrains.annotations.Contract;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Class for extracting testing sets from csv file.
 *
 * @author Vlad Shanin
 */

class ParseFile {
    private String fileName;

    ParseFile(String fileName) {
        this.fileName = fileName;
    }

    LinkedList<Order> getOrdersFromCSV() throws Exception {
        final String dirPath = "//home//vashanin//IdeaProjects//SQA//src//main//resources//";
        final String SEPARATOR = ",";

        BufferedReader csvReader = new BufferedReader(new FileReader(new File(dirPath + this.fileName)));

        // list of orders that will be used for White-Box testing
        LinkedList<Order> csvOrderList = new LinkedList<>();

        // extract data from csv file
        String line;
        boolean header = false;

        while ((line = csvReader.readLine()) != null) {
            // skip metadata
            if (line.charAt(0) == '#') {
                continue;
            }

            // skip headers
            if (!header) {
                header = true;
                continue;
            }

            LinkedList<OrderItem> orderItems = new LinkedList<>();

            String cells[] = line.split(SEPARATOR);
            int rowLength = cells.length;
            int quantityOfOrderItems = (rowLength - 2) / 4;

            for (int i = 0; i < quantityOfOrderItems; i++) {
                OrderItem item = new OrderItem(
                        this.getProductType(cells[i*3]),
                        this.getOrderQuantity(cells[1 + i*3]),
                        this.getOrderPrice(cells[rowLength - 2 - (quantityOfOrderItems - i)]),
                        this.isOrderGiftWrap(cells[2 + i*3])
                );

                orderItems.add(item);
            }

            Order order = new Order(
                    orderItems,
                    this.getOrderShipmentType(cells[(rowLength - 1) - 1]),
                    this.getOrderDate(cells[(rowLength - 1)])
            );

            csvOrderList.add(order);
        }

        csvReader.close();

        return csvOrderList;
    }

    @Contract("null -> null")
    private ProductType getProductType(String type) {
        ProductType productType = null;

        switch (type) {
            case "MUSIC" : {
                productType = ProductType.MUSIC;
                break;
            }
            case "VIDEO" : {
                productType = ProductType.VIDEO;
                break;
            }
            case "CLOTHING" : {
                productType = ProductType.CLOTHING;
                break;
            }
            case "BOOKS" : {
                productType = ProductType.BOOKS;
                break;
            }
            case "WATCHES" : {
                productType = ProductType.WATCHES;
                break;
            }
            case "ELECTRONICS" : {
                productType = ProductType.ELECTRONICS;
                break;
            }
            case "JEWELRY" : {
                productType = ProductType.JEWELRY;
                break;
            }
            case "FURNITUREDECOR" : {
                productType = ProductType.FURNITUREDECOR;
                break;
            }
        }

        return productType;
    }

    @Contract("null -> null")
    private ShipmentType getOrderShipmentType(String type) {
        ShipmentType shipmentType = null;

        switch (type) {
            case "DOMESTIC" : {
                shipmentType = ShipmentType.DOMESTIC;
                break;
            }
            case "DOMESTIC_EXPEDITED" : {
                shipmentType = ShipmentType.DOMESTIC_EXPEDITED;
                break;
            }
            case "INTERNATIONAL" : {
                shipmentType = ShipmentType.INTERNATIONAL;
                break;
            }
            case "INTERNATIONAL_EXPEDITED" : {
                shipmentType = ShipmentType.INTERNATIONAL_EXPEDITED;
                break;
            }
        }

        return shipmentType;
    }

    @Contract("null -> false")
    private boolean isOrderGiftWrap(String type) {
        boolean giftWrapType = false;
        if (type.equals("true"))
            giftWrapType = true;

        return giftWrapType;
    }

    private int getOrderQuantity(String quantity) {
        return Integer.parseInt(quantity);
    }

    private double getOrderPrice(String price) {
        return Double.parseDouble(price);
    }

    private Date getOrderDate(String date) {
        DateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        Date orderDate = null;

        try {
            orderDate = format.parse(date);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return orderDate;
    }
}
