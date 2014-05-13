/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.cygnus.app;

import inc.cygnus.service.CustomerService;
import inc.cygnus.service.ProductService;
import inc.cygnus.service.PurchaseService;
import inc.cygnus.view.Menu;
import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author TA planning
 */
public class MainSpring {

    private static CustomerService customerService;
    private static ProductService productService;
    private static PurchaseService purchaseService;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Implementasi Konfigurasi Spring framework
                    @SuppressWarnings("resource")
                    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

                    // Initialize service
                    setCustomerService((CustomerService) appContext.getBean("customerService"));
                    setProductService((ProductService) appContext.getBean("productService"));
                    setPurchaseService((PurchaseService) appContext.getBean("purchaseService"));
                    
                    try {
                        // After finish service initialize
                        // Show Form Menu Master
                        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(MainSpring.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(MainSpring.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(MainSpring.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(MainSpring.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Menu mmv = new Menu();

                    mmv.setVisible(true);

                } catch (BeansException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Getter And Setter
     */
    public static CustomerService getCustomerService() {
        return customerService;
    }

    public static void setCustomerService(CustomerService customerService) {
        MainSpring.customerService = customerService;
    }

    public static ProductService getProductService() {
        return productService;
    }

    public static void setProductService(ProductService productService) {
        MainSpring.productService = productService;
    }

    public static PurchaseService getPurchaseService() {
        return purchaseService;
    }

    public static void setPurchaseService(PurchaseService purchaseService) {
        MainSpring.purchaseService = purchaseService;
    }

}
