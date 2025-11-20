package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (partRepository.count() == 0 && productRepository.count() == 0) {
            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();

            OutsourcedPart op1= new OutsourcedPart();
            op1.setCompanyName("Bespin Manufacturing");
            op1.setName("Left-Click Button");
            op1.setInv(5);
            op1.setPrice(1.0);
            op1.setId(100L);
            op1.setMinInv(1);
            op1.setMaxInv(99);
            outsourcedPartRepository.save(op1);
            OutsourcedPart outPart=null;
            outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("Left-Click Button"))outPart=part;
            }

            System.out.println(outPart.getCompanyName());

            OutsourcedPart op2= new OutsourcedPart();
            op2.setCompanyName("Bespin Manufacturing");
            op2.setName("Right-Click Button");
            op2.setInv(5);
            op2.setPrice(1.0);
            op2.setId(101L);
            op2.setMinInv(1);
            op2.setMaxInv(99);
            outsourcedPartRepository.save(op2);
            outPart=null;
            outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("Right-Click Button"))outPart=part;
            }

            System.out.println(outPart.getCompanyName());

            OutsourcedPart op3= new OutsourcedPart();
            op3.setCompanyName("Kuat Shipyards");
            op3.setName("Mouse Wheel");
            op3.setInv(5);
            op3.setPrice(2.0);
            op3.setId(102L);
            op3.setMinInv(1);
            op3.setMaxInv(99);
            outsourcedPartRepository.save(op3);
            outPart=null;
            outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("Mouse Wheel"))outPart=part;
            }

            System.out.println(outPart.getCompanyName());

            OutsourcedPart op4= new OutsourcedPart();
            op4.setCompanyName("Kuat Shipyards");
            op4.setName("Mouse Inner PCB");
            op4.setInv(5);
            op4.setPrice(4.0);
            op4.setId(103L);
            op4.setMinInv(1);
            op4.setMaxInv(99);
            outsourcedPartRepository.save(op4);
            outPart=null;
            outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("Mouse Inner PCB"))outPart=part;
            }

            System.out.println(outPart.getCompanyName());

            OutsourcedPart op5= new OutsourcedPart();
            op5.setCompanyName("Tython Mechanics");
            op5.setName("Mouse Chassis");
            op5.setInv(5);
            op5.setPrice(8.0);
            op5.setId(104L);
            op5.setMinInv(1);
            op5.setMaxInv(99);
            outsourcedPartRepository.save(op5);
            outPart=null;
            outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("Mouse Chassis"))outPart=part;
            }
            System.out.println(outPart.getCompanyName());
        
            Product ultimate_mouse= new Product("Ultimate Mouse",100.0,5);
            Product premium_mouse= new Product("Premium Mouse",80.0,5);
            Product standard_mouse= new Product("Standard Mouse",60.0,5);
            Product budget_mouse= new Product("Budget Mouse",40.0,5);
            Product proto_mouse= new Product("Proto Mouse",20.0,5);
            productRepository.save(ultimate_mouse);
            productRepository.save(premium_mouse);
            productRepository.save(standard_mouse);
            productRepository.save(budget_mouse);
            productRepository.save(proto_mouse);
        }
        
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
