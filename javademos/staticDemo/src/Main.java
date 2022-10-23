public class Main {
    public static void main(String[] args) {
    ProductManager manager = new ProductManager();
    Product product = new Product();
    product.price=2;
    product.name= "mause";

    manager.add(product);

    DatabaseHelper.Crud.Delete();
    }
}