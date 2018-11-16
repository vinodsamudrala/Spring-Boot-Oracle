package guru.springframework.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.domain.MSRNData;
import guru.springframework.services.MSRNDataService;

@RestController
public class MSRNDataController {

    private MSRNDataService msrnDataService;

    @Autowired
    public void setProductService(MSRNDataService msrnDataService) {
        this.msrnDataService = msrnDataService;
    }

    @RequestMapping("/rest/irts/msrn")
    public List<MSRNData> redirToList(){
        return msrnDataService.listAll();
    }

    @RequestMapping(value = "/rest/irts/msrn", method = RequestMethod.POST)
    public MSRNData saveOrUpdateProduct(@Valid @RequestBody MSRNData msrnData){
        MSRNData savedProduct = msrnDataService.saveOrUpdate(msrnData);
        return savedProduct;
    }
    
   /* @RequestMapping({"/product/list", "/product"})
    public String listProducts(Model model){
        model.addAttribute("products", msrnDataService.listAll());
        return "product/list";
    }

    @RequestMapping("/product/show/{id}")
    public String getProduct(@PathVariable String id, Model model){
        model.addAttribute("product", msrnDataService.getById(Long.valueOf(id)));
        return "product/show";
    }


    @RequestMapping("/product/new")
    public String newProduct(Model model){
        model.addAttribute("productForm", new ProductForm());
        return "product/productform";
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String saveOrUpdateProduct(@Valid MSRNData msrnData, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "product/productform";
        }

        MSRNData savedProduct = msrnDataService.saveOrUpdate(msrnData);

        return "redirect:/product/show/" + savedProduct.getId();
    }
*/


}
