import java.util.List;

public class Main {

    public static void main(String[] args) {


        Address address = new Address();
        Address address1 = new Address();
        Address address2 = new Address();


        User user = new User();
        User user1 = new User();
        User user2 = new User();


        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();
        Product product6 = new Product();
        Product product7 = new Product();
        Product product8 = new Product();

        Category category1 = new Category();
        Category category2 = new Category();
        Category category3 = new Category();
        Category category4 = new Category();


        category1.setColor("Vermelho");
        category1.setNome("Mercearia");
        category1.setDescription("Produtos de mercearia (ex: azeite, massa)");

        category2.setColor("verde");
        category2.setNome("Charcutaria");
        category2.setDescription("Produtos de charcutaria (ex: chourisso, fiambre)");

        category3.setColor("Amarelo");
        category3.setNome("Peixaria");
        category3.setDescription("Produtos de peixaria (ex: bacalhau, peixe espada)");

        category4.setColor("Amaredlo");
        category4.setNome("Peidxaria");
        category4.setDescription("Produtos de peixaria (ex: bacdalhau, peixe espada)");

        product1.setCategory(category2);
        product1.setDescription("Fiambre da pa");
        product1.setName("FIambre");
        product1.setPicture("picture");
        product1.setPrice(1.12);
        product1.setUnityType("kg");

        product2.setCategory(category1);
        product2.setDescription("Azeite");
        product2.setName("Azeite Pingo doce");
        product2.setPicture("picture");
        product2.setPrice(9.99);
        product2.setUnityType("ml");

        product3.setCategory(category3);
        product3.setDescription("Terra Do Bacalhau");
        product3.setName("Bacalhau Super especial (Inteiro)");
        product3.setPicture("picture");
        product3.setPrice(74.76);
        product3.setUnityType("kg");

        product4.setCategory(category2);
        product4.setDescription("Queijo Limiano");
        product4.setName("Queijo");
        product4.setPicture("picture");
        product4.setPrice(6.99);
        product4.setUnityType("gr");

        product5.setCategory(category3);
        product5.setDescription("Peixe Espada Branco");
        product5.setName("Peixe Espada Branco (ao kg)");
        product5.setPicture("picture");
        product5.setPrice(9.99);
        product5.setUnityType("kg");

        product6.setCategory(category2);
        product6.setDescription("Chourição");
        product6.setName("Chourição (150gr)");
        product6.setPicture("picture");
        product6.setPrice(12.79);
        product6.setUnityType("gr");

        product7.setCategory(category1);
        product7.setDescription("Arroz Carolino");
        product7.setName("Arroz Carolino (1kg)");
        product7.setPicture("picture");
        product7.setPrice(0.89);
        product7.setUnityType("kg");

        product8.setCategory(category1);
        product8.setDescription("Arroz Carolino");
        product8.setName("Arroz Carolino (1kg)");
        product8.setPicture("picture");
        product8.setPrice(0.89);
        product8.setUnityType("kg");



        address.setDoorNo("56");
        address.setPostalCode("4878-5825");
        address.setStreetName("Largo dos penedos");

        address1.setDoorNo("145");
        address1.setPostalCode("4810-2784");
        address1.setStreetName("Rua da igreja");

        address2.setDoorNo("78");
        address2.setPostalCode("4578-5621");
        address2.setStreetName("Rua de santa Margarida");


        user.setAddress(address);
        user.setEmail("criador@gmail.com");
        user.setName("criador da lista");
        user.setUsername("criador_123");
        user.setPassword("criador_lista_churrasco");

        user1.setAddress(address1);
        user1.setEmail("user1@gmail.com");
        user1.setName("User 1");
        user1.setUsername("user1_123");
        user1.setPassword("123456789");

        user2.setAddress(address2);
        user2.setEmail("user2@gmail.com");
        user2.setName("User 2");
        user2.setUsername("user2_321");
        user2.setPassword("987654321");

        ShoppingList lista = new ShoppingList();

        lista.setName("Lista de compras para chorrasco");
        lista.setUser(user);
        lista.setUserList(user1);
        lista.setUserList(user2);
        lista.AddProduct(product1);
        lista.AddProduct(product2);
        lista.AddProduct(product3);
        lista.AddProduct(product4);
        lista.AddProduct(product5);
        lista.AddProduct(product6);
        lista.AddProduct(product7);


        lista.RemoveProduct(product1);
        lista.AddProductToShoppingCart(product1);
        lista.RemoveProductFromShoppingCart(product4);
        lista.AddProductToShoppingCart(product4);


        System.out.println("Nome das pessoas com quem a lista está a ser partilhada");

        for(int i=0; i<lista.getUserList().size();i++) {
            System.out.println("Utilizador "+(i+1)+"\n\t" + lista.getUserList().get(i).getName());
        }

        System.out.println("Numero de produtos que estao no carrinho:"+lista.GetTotalOfProductsOnShoppingCart());
        System.out.println("Total do carrinho:"+lista.GetTotalPriceOnCart());

        System.out.println("\nNumero de produtos que estao na lista de compras:"+lista.GetTotalOfProducts());
        System.out.println("\nTotal da lista de compras:"+lista.GetTotalPrice());
        System.out.println("\nPercetegem completa:"+lista.GetPercentageCompleted());
        //Para 2o
        lista.para20();
    }
}
