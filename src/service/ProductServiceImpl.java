package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        int id1 = (int) (Math.random() * 100);
        products.put(id1, new Product(id1, "Iphone7", 15, "https://www.apple.com/shop/buy-iphone/iphone-7/4.7-inch-display-32gb-black-unlocked"));
        int id2 = (int) (Math.random() * 100);
        products.put(id2, new Product(id2, "Iphone7Plus", 20, "https://www.apple.com/shop/buy-iphone/iphone-7/5.5-inch-display-32gb-rose-gold-unlocked"));
        int id3 = (int) (Math.random() * 100);
        products.put(id3, new Product(id3, "Stand Air conditioner", 10, "https://cdn.tgdd.vn/Products/Images/7498/200439/midea-ac100-18b-300x300.jpg"));
        int id4 = (int) (Math.random() * 100);
        products.put(id4, new Product(id4, "Cooker", 2, "https://cdn.tgdd.vn/Products/Images/1922/92601/toshiba-rc-18nmfvn-wt-daidien-300x300.jpg"));
        int id5 = (int) (Math.random() * 100);
        products.put(id5, new Product(id5, "Cooker", 5, "https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6196/6196727_sd.jpg"));

    }


    @Override
    public List<Product> findByAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public Product findByName(String name) {
        List<Product> productList = findByAll();
        for (Product product : productList) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }
}
