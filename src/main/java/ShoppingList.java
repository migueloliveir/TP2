import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private String name;
    private User user;
    private List<User> userList = new ArrayList<User>();
    private List<Product> productList1 = new ArrayList<Product>();//Lista de produtos a comprar
    private List<Product> productList2 = new ArrayList<Product>();//Lista de produtos já no carrinho


    public String GetListName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User GetUserName() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double GetPercentageCompleted() {
        double percent = 0;
        int sizeList = productList1.size();
        int sizeCarList = productList2.size();
        percent = (sizeCarList * 100) / sizeList;
        return percent;
    }

    public int GetTotalOfProducts() {
        int nProduct = productList1.size();
        return nProduct;
    }

    public int GetTotalOfProductsOnShoppingCart() {
        int nProduct = productList2.size();
        return nProduct;
    }

    public double GetTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < productList1.size(); i++) {
            totalPrice = totalPrice + productList1.get(i).getPrice();
        }
        return totalPrice;
    }

    public double GetTotalPriceOnCart() {
        double totalPrice = 0;
        for (int i = 0; i < productList2.size(); i++) {
            totalPrice = totalPrice + productList2.get(i).getPrice();
        }
        return totalPrice;
    }


    public void AddProduct(Product product) {
        productList1.add(product);
    }

    public void RemoveProduct(Product product) {
        productList1.remove(product);
    }

    public void AddProductToShoppingCart(Product product) {
        productList2.add(product);
    }

    public void RemoveProductFromShoppingCart(Product product) {
        productList2.remove(product);
    }

    public void setUserList(User user) {
        userList.add(user);
    }

    public List<User> getUserList() {
        return userList;
    }

    public void para20() {
        int count=0;
        String saveCategory="";

            for(int k=(0); k<(productList2.size()-count);k++) {
                count = 0;


                if (saveCategory == ""){
                    System.out.println("-" + productList2.get(k).GetCategoryName());
                    for (int o = 0; o < productList2.size(); o++) {

                        if (productList2.get(k).GetCategoryName() == productList2.get(o).GetCategoryName()) {
                            System.out.println("\t-" + productList2.get(o).getName());
                            count++;
                            //System.out.println(count);
                        }

                    }
                    if (count==1){
                        count=0;
                    }
                    if (count > 1) {
                       saveCategory=productList2.get(k).GetCategoryName();


                    }
            }else{
                    saveCategory="";
                    count=0;
                }

            }

    }

}