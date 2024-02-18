package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {

        //Department obj = new Department(1, "Books");
        //System.out.println(obj);

        //Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now(), 3000.0, obj);
        //System.out.println(seller);

        // o programa conhece somente a interface
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}
