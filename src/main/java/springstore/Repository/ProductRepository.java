package springstore.Repository;

import springstore.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findProductByProductNameAndProductCategory(String productName, String productCategory);
    Product getProductsByProdId(int id);
    List<Product> getAllByProdId(int id);;
}
