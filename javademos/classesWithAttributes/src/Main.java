public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product.name ="laptop";
        product.id=56;
        product.description="kjnekcn";
        product.stockAmount=22;
        System.out.println(product.description);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);
    }
}