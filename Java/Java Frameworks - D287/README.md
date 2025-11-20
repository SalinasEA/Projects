# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS

### C. Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.


#### Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.
Changed title, shop name, part name, and product name. Added footer section.

File: mainscreen.html
• Changed line. Line 14. Changed title to 'Coronet Engineering'.
```
<title>Coronet Engineering</title>
```
• Changed line. Line 19. Changed h2 to 'Coronet Engineering - Premium Computer Mice'.
```
<h1>Coronet Engineering - Premium Computer Mice</h1>
```
• Changed line. Line 21. Changed h2 to 'Mouse Sections'.
```
<h2>Mouse Sections</h2>
```
• Changed line. Line 53. Changed h2 to 'Mice'.
```
<h2>Mice</h2>
```

• Added lines. Line 91-97. Added footer, div class="container", and added copyright text in the div to '&copy; 2025, Coronet Engineering.'.
```
<footer>

<div class="container">
&copy; 2025, Coronet Engineering.
</div>

</footer>
```

### D. Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
Added new "About" page 'about.html' and updated both "About" page and "Home" page 'mainscreen.html' to include anchor navigation button between each other. Added information about the company and added footer section in the "About" page. Added "About" page controller 'AboutController.java' to map url for "About" page 'about.html'.

File: mainscreen.html
• Added line. Line 20. Added anchor navigation with class="btn btn-info" to 'about.html'.
```
<a href="/about" class="btn btn-info">About Us</a>
```

File: about.html
• Added file and lines. Line 1-38. Added html structure from "Home" page 'mainscreen.html', head, title, anchor navigation with class="btn btn-info", information about the company, footer, div class="container", and added copyright text in the div to '&copy; 2025, Coronet Engineering.'.
```
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8" />

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>About Us</title>
</head>
<body>

<div class="container">
    <h1>About Coronet Engineering</h1>
    <a href="/mainscreen" class="btn btn-info">Home</a>
    <hr>

    <h2>Our Story</h2>
    <p>Coronet Engineering was established with a single goal: to elevate the humble computer mouse to a new level of precision and elegance. What began in a small workshop in 2024 with a handful of enthusiasts quickly evolved into a passionate team of engineers, designers, and tech historians, each dedicated to reimagining the way we interact with computers through our hands.</p>
    <hr>
    <h2>Our Purpose</h2>
    <p>At Coronet Engineering, we believe a computer mouse should be more than just a tool - it should be a trusted extension of your intent. We combine cutting-edge sensor technology with ergonomic design and a touch of retro inspiration to craft mice that feel as good as they perform. Whether you're a digital artist, gamer, or productivity warrior, Coronet Engineering is here to deliver input devices that meet your standards - and exceed your expectations.</p>

</div>
</body>
<footer>

<div class="container">
&copy; 2025, Coronet Engineering.
</div>

</footer>
</html>
```

File: AboutController.java
• Added file and lines. Line 1-13. Added '@GetMapping' controller to access "About" page 'about.html'.
```
package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
@GetMapping("/about")
    public String about() {
        return "about";
    }
}

```

### E. Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

#### Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.
Removed commented out code and reused it to add 5 new outsourced parts and 5 new products to sample inventory if there are no parts and products on initial application launch.

File: BootStrapData.java
• Removed line. Lines 62-68. Removed commented out product code.
```

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

```
• Added line. Lines 41-129. Added previously removed commented out part and product code to add 5 new outsourced parts and 5 new products to sample inventory if there are no parts and products on initial application launch.
```
        if (partRepository.count() == 0 && productRepository.count() == 0) {
            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();

            OutsourcedPart op1= new OutsourcedPart();
            op1.setCompanyName("Bespin Manufacturing");
            op1.setName("Left-Click Button");
            op1.setInv(5);
            op1.setPrice(1.0);
            op1.setId(100L);
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
        
```

### F. Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
#### • The “Buy Now” button must be next to the buttons that update and delete products.
#### • The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
#### • Display a message that indicates the success or failure of a purchase.
Added "Buy Now" Thymeleaf anchor button to 'mainscreen.html', added "Buy Now" purchase mapping to 'AddProductController.java' that decrements product quantity if quantity is not zero, added file 'confirmationbuyproduct.html' and 'failurebuyproduct.html' that uses javascript to alert user if purchase was successful or not via purchase mapping on 'AddProductController.java' and returns back to 'mainscreen.html', added Bootstrap CSS to 'productForm.html' and 'InhousePartForm.html' and 'OutsourcedPartForm.html'.

File: mainscreen.html
• Added line. Lines 86-89. Added "Buy Now" Thymeleaf anchor button.
```
                   <br>
                   <a th:href="@{/buyproduct(productID=${tempProduct.id})}" class="btn btn-primary btn-sm mb-3"
                   onclick="if(!(confirm('Are you sure you want to buy this product?')))return false">Buy Now</a>
```

File: AddProductController.java
• Added line. Lines 129-143. Added "Buy Now" purchase mapping to 'AddProductController.java' that decrements product quantity if quantity is not zero and returns 'confirmationbuyproduct.html' or 'failurebuyproduct.html' depending if purchase was successful or not.
```

    @GetMapping("/buyproduct")
    public String buyProduct(@RequestParam("productID") int theId, Model theModel) {
        ProductService productService = context.getBean(ProductServiceImpl.class);
        Product product3=productService.findById(theId);
        if (product3.getInv() > 0) {
            product3.setInv(product3.getInv() - 1);
            productService.save(product3);
            
            return "confirmationbuyproduct";
        }
        else {
            return "failurebuyproduct";
        }
    }
```

File: confirmationbuyproduct.html
• Added file. Lines 1-15. Added html page that uses javascript to alert user for purchase that was successful via purchase mapping on 'AddProductController.java' and returns back to 'mainscreen.html'.
```
<!DOCTYPE html>
<html lang="en">
<head>
<!--    <meta charset="UTF-8">-->
    <meta http-equiv="refresh"
          content="0;URL='mainscreen'">
    <title>Purchase Success</title>
    <script>
        alert('Purchase successful! Redirecting to home....');
        window.location.href = 'mainscreen';
    </script>
</head>
<body>
</body>
</html>
```

File: failurebuyproduct.html
• Added file. Lines 1-15. Added html page that uses javascript to alert user for purchase that was not successful via purchase mapping on 'AddProductController.java' and returns back to 'mainscreen.html'.
```
<!DOCTYPE html>
<html lang="en">
<head>
<!--    <meta charset="UTF-8">-->
    <meta http-equiv="refresh"
          content="0;URL='mainscreen'">
    <title>Failure</title>
    <script>
        alert('Failure to purchase! The product is out of stock! Redirecting to home....');
        window.location.href = 'mainscreen';
    </script>
</head>
<body>
</body>
</html>
```

File: productForm.html
• Added line. Lines 7-11. Added Bootstrap CSS.
```

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

```

File: InhousePartForm.html
• Added line. Lines 6-10. Added Bootstrap CSS.
```

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
          
```

File: OutsourcedPartForm.html
• Added line. Lines 7-10. Added Bootstrap CSS.
```

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
          
```

### G. Modify the parts to track maximum and minimum inventory by doing the following:
#### • Add additional fields to the part entity for maximum and minimum inventory.
#### • Modify the sample inventory to include the maximum and minimum fields.
#### • Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
#### • Rename the file the persistent storage is saved to.
#### • Modify the code to enforce that the inventory is between or at the minimum and maximum value.
Added minimum and maximum inventory fields/getters/setters as well as in the constructor alongside minimum and maximum validator fields to 'Part.java', added to the sample inventory in 'BootStrapData.java' to include the minimum and maximum fields, added text inputs for the minimum and maximum fields to 'InhousePartForm.html' and 'OutsourcedPartForm.html', changed the name of the database to 'coronet-engineering-db', and added minimum and maximum inventory validator enforcers to 'Part.java' and 'AddInhousePartController.java' and 'AddOutsourcedPartController.java'.

File: Part.java
• Added line. Line 6. Added import for '@Max' validation.
```
import javax.validation.constraints.Max;
```
• Added line. Lines 32-36. Added minimum and maximum inventory fields.
```
    @Min(value = 0, message = "Minimum inventory value must be positive")
    int minInv;
    @Min(value = 0, message = "Maximum inventory value must be positive")
    @Max(value = 99, message = "Maximum inventory value cannot exceed 99")
    int maxInv;
```
• Added and changed line. Lines 46-61. Added minimum and maximum, 'minInv' and 'maxInv' inventory fields to constructors.
```
    public Part(String name, double price, int inv, int minInv, int maxInv) {
        this.name = name;
        this.price = price;
        this.inv = inv;
        this.minInv = minInv;
        this.maxInv = maxInv;
    }

    public Part(long id, String name, double price, int inv, int minInv, int maxInv) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inv = inv;
        this.minInv = minInv;
        this.maxInv = maxInv;
    }
```
• Added line. Lines 63-65. Added boolean validator method for ensuring inputted inventory is within minimum and maximum inventory fields 'invLimitValidation()'.
```
    public boolean invLimitValidation() {
        return (this.inv >= this.minInv && this.inv <= this.maxInv && this.minInv <= this.maxInv);
    }
```
• Added line. Lines 98-113. Added minimum and maximum inventory fields getters/setters.
```

    public int getMinInv() {
        return minInv;
    }

    public void setMinInv(int minInv) {
        this.minInv = minInv;
    }

    public int getMaxInv() {
        return maxInv;
    }

    public void setMaxInv(int maxInv) {
        this.maxInv = maxInv;
    }
```

File: BootStrapData.java
• Added line. Lines 50-51. Added minimum and maximum inventory fields to sample inventory.
```
            op1.setMinInv(1);
            op1.setMaxInv(99);
```
• Added line. Lines 67-69. Added minimum and maximum inventory fields to sample inventory.
```
            op2.setMinInv(1);
            op2.setMaxInv(99);
```
• Added line. Lines 84-85. Added minimum and maximum inventory fields to sample inventory.
```
            op3.setMinInv(1);
            op3.setMaxInv(99);
```
• Added line. Lines 101-102. Added minimum and maximum inventory fields to sample inventory.
```
            op4.setMinInv(1);
            op4.setMaxInv(99);
```
• Added line. Lines 118-119. Added minimum and maximum inventory fields to sample inventory.
```
            op5.setMinInv(1);
            op5.setMaxInv(99);
```

File: InhousePartForm.html
• Added line. Lines 31-36. Added text inputs for the minimum and maximum fields.
```
<p><input type="text" path="minInv" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('minInv')}" th:errors="*{minInv}">Minimum Inventory Error</p>

<p><input type="text" path="maxInv" th:field="*{maxInv}" placeholder="Maximum Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('maxInv')}" th:errors="*{maxInv}">Maximum Inventory Error</p>

```

File: OutsourcedPartForm.html
• Added line. Lines 32-37. Added text inputs for the minimum and maximum fields.
```
<p><input type="text" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('minInv')}" th:errors="*{minInv}">Minimum Inventory Error</p>

<p><input type="text" th:field="*{maxInv}" placeholder="Maximum Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('maxInv')}" th:errors="*{maxInv}">Maximum Inventory Error</p>

```

File: application.properties
• Changed line. Line 6. Changed database name to 'coronet-engineering-db'.
```
spring.datasource.url=jdbc:h2:file:~/coronet-engineering-db
```

File: AddInhousePartController.java
• Added line. Lines 42-47. Added minimum and maximum inventory validator enforcers.
```
        if (part.getMinInv() > part.getMaxInv()) {
            theBindingResult.rejectValue("minInv", "minMax.invalid", "Minimum inventory cannot exceed maximum inventory.");
        }
        else if (!part.invLimitValidation()) {
            theBindingResult.rejectValue("inv", "inv.invalid", "Inventory must be between minimum and maximum inventory values.");
        }
```

File: AddOutsourcedPartController.java
• Added line. Lines 43-48. Added minimum and maximum inventory validator enforcers.
```
        if (part.getMinInv() > part.getMaxInv()) {
            bindingResult.rejectValue("minInv", "minMax.invalid", "Minimum inventory cannot exceed maximum inventory.");
        }
        else if (!part.invLimitValidation()) {
            bindingResult.rejectValue("inv", "inv.invalid", "Inventory must be between minimum and maximum inventory values.");
        }
```

### H. Add validation for between or at the maximum and minimum fields. The validation must include the following:
#### • Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
#### • Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
#### • Display error messages when adding and updating parts if the inventory is greater than the maximum.
Changed minimum and maximum field validators for the part inventory field in 'AddInhousePartController.java' and 'AddOutsourcedPartController.java' to be more verbose, added part validator to 'EnufPartsValidator.java' to ensure products do not have more inventory than their associated part, added part validator messaging to 'Product.java' to warn user with messaging of products having more inventory than their associated part, changed "Return to Mainscreen" anchor in 'InhousePartForm.html' and 'OutsourcedPartForm.html' to be a button and have better wording, added "Home" anchor button in 'productForm.html'.

File: AddInhousePartController.java
• Removed line. Lines 45-46. Removed previous minimum and maximum field validator method.
```
        else if (!part.invLimitValidation()) {
            theBindingResult.rejectValue("inv", "inv.invalid", "Inventory must be between minimum and maximum inventory values.");

```
• Added line. Lines 45-49. Added minimum and maximum field validator fields with better error messaging.
```
        if (part.getInv() < part.getMinInv()){
            theBindingResult.rejectValue("inv", "inv.low", "Inventory cannot be less than miminum inventory.");
        }
        if (part.getInv() > part.getMaxInv()){
            theBindingResult.rejectValue("inv", "inv.high", "Inventory cannot be greater than maximum inventory.");
```

File: AddOutsourcedPartController.java
• Removed line. Lines 46-47. Removed previous minimum and maximum field validator method.
```
        else if (!part.invLimitValidation()) {
            bindingResult.rejectValue("inv", "inv.invalid", "Inventory must be between minimum and maximum inventory values.");

```
• Added line. Lines 46-50. Added minimum and maximum field validator fields with better error messaging.
```
        if (part.getInv() < part.getMinInv()){
            bindingResult.rejectValue("inv", "inv.low", "Inventory cannot be less than miminum inventory.");
        }
        if (part.getInv() > part.getMaxInv()){
            bindingResult.rejectValue("inv", "inv.high", "Inventory cannot be greater than maximum inventory.");
```

File: EnufPartsValidator.java
• Added line. Line 37. Added part validator to ensure products do not have more inventory than their associated part.
```
                if (p.getInv()-1<p.getMinInv())return false;
```

File: Product.java
• Changed line. Line 21. Changed part validator messaging to warn user with messaging of products having more inventory than their associated part.
```
@ValidEnufParts(message = "Cannot complete product: making this product would cause part inventory to fall below its minimum.")
```

File: InhousePartForm.html
• Changed line. Line 41. Changed "Return to Mainscreen" anchor in to be a button and have better wording.
```
<a href="http://localhost:8080/" class="btn btn-info">Home</a>
```

File: OutsourcedPartForm.html
• Changed line. Line 40. Changed "Return to Mainscreen" anchor in to be a button and have better wording.
```
<a href="http://localhost:8080/" class="btn btn-info">Home</a>
```

File: productForm.html
• Added line. Line 81. Added "Home" anchor button.
```
<a href="http://localhost:8080/" class="btn btn-info">Home</a>
```

### I. Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
Added minimum and maximum getters/setters tests fields to 'PartTest.java'.

File: PartTest.java
• Added line. Lines 103-138. Added minimum and maximum getters/setters tests fields to 'PartTest.java'.
```

    @Test
    void getMinInv() {
        int minInv=5;
        partIn.setMinInv(minInv);
        assertEquals(minInv,partIn.getMinInv());
        partOut.setMinInv(minInv);
        assertEquals(minInv,partOut.getMinInv());
    }

    @Test
    void setMinInv() {
        int minInv=5;
        partIn.setMinInv(minInv);
        assertEquals(minInv,partIn.getMinInv());
        partOut.setMinInv(minInv);
        assertEquals(minInv,partOut.getMinInv());
    }

    @Test
    void getMaxInv() {
        int maxInv=50;
        partIn.setMaxInv(maxInv);
        assertEquals(maxInv,partIn.getMaxInv());
        partOut.setMaxInv(maxInv);
        assertEquals(maxInv,partOut.getMaxInv());
    }

    @Test
    void setMaxInv() {
        int maxInv=50;
        partIn.setMaxInv(maxInv);
        assertEquals(maxInv,partIn.getMaxInv());
        partOut.setMaxInv(maxInv);
        assertEquals(maxInv,partOut.getMaxInv());
    }
```

### J. Remove the class files for any unused validators in order to clean your code.
Deleted unused validators 'ValidDeletePart.java' and 'DeletePartValidator.java' as suggested by IDE, deleted associated imports of 'ValidDeletePart.java' from 'Part.java'.

File: ValidDeletePart.java
• Removed file.

File: DeletePartValidator.java
• Removed file.

File: Part.java
• Removed line. Line 3. Removed unused import of 'ValidDeletePart.java'.
```
import com.example.demo.validators.ValidDeletePart;
```
• Removed line. Line 17. Removed unused usage of 'ValidDeletePart.java'.
```
@ValidDeletePart
```